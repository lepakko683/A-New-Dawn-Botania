package vazkii.botania.common.core.handler;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ICrashCallable;
import cpw.mods.fml.common.Loader;
import vazkii.botania.common.Botania;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kotasc3 on 9/24/2015.
 */
public class CrashHandler {


    public static void checkCrash ()
    {
        List<String> modIds = new ArrayList<String>();

        if (Loader.isModLoaded("botania") && Botania.and)
        {

            Botania.logger.error("[BOTANIA] THIS INSTANCE OF MINECRAFT IS USING A FORK OF BOTANIA NOT SANCTIONED BY VAZKII, REPORT ALL CRASHES AT http://bit.ly/1KTavgM");
            modIds.add("botania");
        }

        if (modIds.size() == 0)
        {
            ICrashCallable callable = new CrashBotania();
            FMLCommonHandler.instance().registerCrashCallable(callable);
        }
        else
        {
            ICrashCallable callable = new CrashBotania();
            FMLCommonHandler.instance().registerCrashCallable(callable);
        }
    }





    public final String getMessage() {
        return "THIS INSTANCE OF MINECRAFT IS USING A FORK OF BOTANIA NOT SANCTIONED BY VAZKII, REPORT ALL CRASHES AT http://bit.ly/1KTavgM";
    }

}
