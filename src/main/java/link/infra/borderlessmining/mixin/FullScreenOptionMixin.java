package link.infra.borderlessmining.mixin;

import net.minecraft.client.*;
import link.infra.borderlessmining.config.ConfigHandler;
import net.minecraft.client.gui.screen.option.VideoOptionsScreen;
import net.minecraft.client.option.SimpleOption;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.function.Consumer;

@Mixin(VideoOptionsScreen.class)
public abstract class FullScreenOptionMixin {
	@Shadow
	private SimpleOption<Boolean> fullscreen;

	@Shadow
	private int width;

	@Shadow
	private int height;

	@Shadow
	private net.minecraft.client.MinecraftClient client;

	@Shadow
	protected abstract void addDrawableChild(net.minecraft.client.gui.Element element);

	// Add borderless fullscreen option to the video settings if enabled
	@Inject(method = "init", at = @At("TAIL"))
	private void addBorderlessFullscreenOption(CallbackInfo ci) {
		if (!ConfigHandler.getInstance().addToVanillaVideoSettings) {
			return;
		}

		boolean enabled = ConfigHandler.getInstance().isEnabledOrPending();

		SimpleOption<Boolean> borderlessOption = SimpleOption.ofBoolean(
			"text.borderlessmining.videomodename",
			enabled,
			(value) -> {
				ConfigHandler.getInstance().setEnabledPending(value);
				if (value) {
					this.fullscreen.setValue(false);
				}
			}
		);

		// Add the option widget directly since addSingleOptionRow is not available
		this.addDrawableChild(borderlessOption.createWidget(this.client.options, this.width / 2 - 155, this.height - 27, 310));
	}
}
