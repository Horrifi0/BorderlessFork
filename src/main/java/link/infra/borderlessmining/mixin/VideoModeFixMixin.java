package link.infra.borderlessmining.mixin;

import link.infra.borderlessmining.config.ConfigHandler;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.option.VideoOptionsScreen;
import java.lang.reflect.Method;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * This Mixin fixes a bug in Keyboard that causes video mode changes to not be applied when pressing Esc.
 * See: https://bugs.mojang.com/browse/MC-175437
 */
@Mixin(VideoOptionsScreen.class)
public class VideoModeFixMixin {
	@Inject(at = @At("HEAD"), method = "removed()V")
	public void screenRemoved(CallbackInfo ci) {
		MinecraftClient mc = MinecraftClient.getInstance();
		if (mc != null && mc.getWindow() != null) {
			ConfigHandler.getInstance().saveIfDirty();
			try {
				Method method = mc.getWindow().getClass().getMethod("borderlessmining_apply");
				method.invoke(mc.getWindow());
			} catch (Exception e) {
				// Fallback to updateWindowRegion if hook not available
				try {
					Method fallback = mc.getWindow().getClass().getDeclaredMethod("updateWindowRegion");
					fallback.setAccessible(true);
					fallback.invoke(mc.getWindow());
				} catch (Exception ignored) {}
			}
		}
	}
}
