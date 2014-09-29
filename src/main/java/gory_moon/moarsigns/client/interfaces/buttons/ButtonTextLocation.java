package gory_moon.moarsigns.client.interfaces.buttons;

import gory_moon.moarsigns.client.interfaces.GuiBase;
import gory_moon.moarsigns.client.interfaces.GuiMoarSign;
import net.minecraft.client.gui.GuiScreen;

public class ButtonTextLocation extends GuiButtonSpecial {

    int id;
    private boolean moveUp;

    public ButtonTextLocation(int id, int x, int y, boolean moveUp) {
        super(x, y, 16, 8, moveUp ? 224: 240, 0);
        this.moveUp = moveUp;
        this.id = id;
    }

    @Override
    public String getButtonInfo() {
        return "";
    }

    @Override
    public void action(GuiBase gui) {
        GuiMoarSign guiM = ((GuiMoarSign)gui);

        int change = GuiScreen.isShiftKeyDown() ? 10: 1;
        guiM.changeTextPosition(id, moveUp ? -change: change);
    }
}
