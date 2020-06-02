package ru.obvilion.box.physics.box2d.utils;

import java.io.File;

import ru.obvilion.box.jnigen.AntScriptGenerator;
import ru.obvilion.box.jnigen.BuildConfig;
import ru.obvilion.box.jnigen.BuildTarget;
import ru.obvilion.box.jnigen.NativeCodeGenerator;
import ru.obvilion.box.jnigen.BuildTarget.TargetOs;

public class Box2DBuild {
	public static void main(String[] args) throws Exception {
		BuildTarget win32 = BuildTarget.newDefaultTarget(TargetOs.Windows, false);
		BuildTarget win64 = BuildTarget.newDefaultTarget(TargetOs.Windows, true);
		BuildTarget lin32 = BuildTarget.newDefaultTarget(TargetOs.Linux, false);
		BuildTarget lin64 = BuildTarget.newDefaultTarget(TargetOs.Linux, true);
		BuildTarget android = BuildTarget.newDefaultTarget(TargetOs.Android, false);
		BuildTarget mac64 = BuildTarget.newDefaultTarget(TargetOs.MacOsX, true);
		BuildTarget ios = BuildTarget.newDefaultTarget(TargetOs.IOS, false);
		new NativeCodeGenerator().generate("src", "bin" + File.pathSeparator + "../../../gdx/bin", "jni");
		new AntScriptGenerator().generate(new BuildConfig("gdx-box2d"), win32, win64, lin32, lin64, mac64, android, ios);		
	}
}