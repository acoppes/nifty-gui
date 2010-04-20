package de.lessvoid.nifty.java2d.tests;

import java.awt.Font;

import de.lessvoid.nifty.java2d.renderer.FontProviderJava2dImpl;

public class HelloWorldTest extends NiftyJava2dWindow {

	public static void main(String[] args) throws InterruptedException {
		new HelloWorldTest("Nifty Java2d Renderer - HelloWolrd example", 800,
				600, "helloworld.xml", "start").start();
	}

	public HelloWorldTest(String title, int width, int height, String filename,
			String screenName) {
		super(title, width, height, filename, screenName);
	}

	@Override
	protected void registerFonts(FontProviderJava2dImpl fontProviderJava2dImpl) {
		fontProviderJava2dImpl.addFont("arial.fnt", new Font("arial",
				Font.BOLD, 24));
	}

}
