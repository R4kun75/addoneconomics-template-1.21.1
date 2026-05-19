package com.example.addoneconomics;

import com.dtmpro621.moderngui.screen.ModernScreen;
import net.minecraft.network.chat.Component;

public class InterfaceEconomics extends ModernScreen {

    // O construtor define o título da tela
    public InterfaceEconomics() {
        super(Component.literal("Menu do Meu Addon"));
    }

    // Este método é chamado quando a tela abre.
    // É o "onCreate" da sua interface.
    @Override
    protected void init() {
        super.init();
        var root = this.getRootContainer();
    }
}
