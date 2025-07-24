package gimod;

import arc.*;
import arc.scene.ui.Dialog;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.gen.Icon;
import mindustry.mod.*;
import mindustry.ui.Styles;
import mindustry.ui.dialogs.*;

public class GIMod extends Mod{

    public GIMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Dialog dialog = new BaseDialog("rua!");
            dialog.shown(() -> {
                dialog.cont.label(() -> "rua!");
                dialog.buttons.button(Icon.exit, Styles.flati, Core.app::exit);
            });
            dialog.show();
        });
    }

    @Override
    public void loadContent(){
        Log.info("Loading some gimod content.");
    }

}
