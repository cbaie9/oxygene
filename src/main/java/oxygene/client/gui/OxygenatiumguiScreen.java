
package oxygene.client.gui;

import oxygene.world.inventory.OxygenatiumguiMenu;

import oxygene.procedures.Oxygenatiumprocessl9Procedure;
import oxygene.procedures.Oxygenatiumprocessl8Procedure;
import oxygene.procedures.Oxygenatiumprocessl7Procedure;
import oxygene.procedures.Oxygenatiumprocessl6Procedure;
import oxygene.procedures.Oxygenatiumprocessl5Procedure;
import oxygene.procedures.Oxygenatiumprocessl4Procedure;
import oxygene.procedures.Oxygenatiumprocessl3Procedure;
import oxygene.procedures.Oxygenatiumprocessl2Procedure;
import oxygene.procedures.Oxygenatiumprocessl1Procedure;
import oxygene.procedures.Oxygenatiumprocessl13Procedure;
import oxygene.procedures.Oxygenatiumprocessl12Procedure;
import oxygene.procedures.Oxygenatiumprocessl11Procedure;
import oxygene.procedures.Oxygenatiumprocessl10Procedure;
import oxygene.procedures.Oxygenatiumprocessl0Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class OxygenatiumguiScreen extends AbstractContainerScreen<OxygenatiumguiMenu> {
	private final static HashMap<String, Object> guistate = OxygenatiumguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public OxygenatiumguiScreen(OxygenatiumguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("oxygene:textures/screens/oxygenatiumgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Oxygenatiumprocessl0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_icon_gui.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l1.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l2.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l3.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l4.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl5Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l5.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl6Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l6.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl7Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l7.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl8Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l8.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl9Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l9.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl10Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l10.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl11Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l11.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl12Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l12.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		if (Oxygenatiumprocessl13Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("oxygene:textures/screens/oxygene_l13.png"));
			this.blit(ms, this.leftPos + 55, this.topPos + 55, 0, 0, 16, 16, 16, 16);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Inventory", 5, 105, -12829636);
		this.font.draw(poseStack, "Heat source", 111, 13, -12829636);
		this.font.draw(poseStack, "Input", 104, 36, -12829636);
		this.font.draw(poseStack, "In use", 100, 54, -12829636);
		this.font.draw(poseStack, "Output", 99, 72, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
