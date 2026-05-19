package com.example.addoneconomics;


import com.dtmpro621.moderngui.client.gui.layout.LayoutContext;
import com.dtmpro621.moderngui.client.gui.layout.UiScale;
import com.dtmpro621.moderngui.client.gui.layout.VBox;
import com.dtmpro621.moderngui.client.gui.screen.ModernScreen;
import com.dtmpro621.moderngui.client.gui.theme.Themes;
import com.dtmpro621.moderngui.client.gui.widget.Widget;
import net.minecraft.network.chat.Component;


public class InterfaceEconomics extends ModernScreen {

    public InterfaceEconomics() {
        // Passamos o título e os padrões de tema/escala.
        // Se Theme ou UiScale ficarem vermelhos, clique neles e dê Alt + Enter para importar!
        super(Component.literal("Menu do Meu Addon"), Themes.MODERN, UiScale.DEFAULT_AUTO);
    }

    @Override
    protected Widget buildRoot(LayoutContext layoutContext) {
        return null;
    }
}