/*
 * Copyright (C) 2015-2016 Andrea Binello ("andbin")
 *
 * This file is part of the "Java Examples" project and is licensed under the
 * MIT License. See one of the license files included in the root of the project
 * for the full text of the license.
 */

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageFilter;
import java.awt.image.ImageProducer;
import java.net.URL;
import javax.swing.GrayFilter;
import javax.swing.SwingUtilities;

/*
 * This is the "main" class of this Java Example.
 *
 * The SwingUtilities.invokeLater causes the run() to be executed asynchronously
 * in the context of the EDT (Event Dispatch Thread).
 *
 * It is generally always a good practice to start all the GUI creation on the
 * EDT and *not* on the "main" thread.
 */
public class RGBImageFiltersMain {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				RGBImageFiltersMain main = new RGBImageFiltersMain();
				main.createAndShowGUI();
			}
		});
	}

	private void createAndShowGUI() {
		// Original image loaded from image resource.
		Image originalImage = loadImage("images/colored-pencils.png");

		// FILTER 1: a "negative" filter.
		Image negativeImage = filterImage(originalImage, new NegativeImageFilter());

		// FILTER 2: a "gray" filter using the standard javax.swing.GrayFilter class.
		// See javadoc documentation of GrayFilter constructor.
		Image swingGrayImage = filterImage(originalImage, new GrayFilter(true, 40));

		// FILTER 3: an "average desaturation" filter.
		Image avgDesaturationImage = filterImage(originalImage, new AverageDesaturationImageFilter());

		// FILTER 4: a "hue shift" filter adding +1/6.
		Image hueShiftImage = filterImage(originalImage, new HueShiftImageFilter(1.0f / 6));

		// FILTER 5: a "red pass" filter.
		Image redPassImage = filterImage(originalImage, ColorMaskImageFilter.getRedPass());

		// FILTER 6: a "green pass" filter.
		Image greenPassImage = filterImage(originalImage, ColorMaskImageFilter.getGreenPass());

		// FILTER 7: a "blue pass" filter.
		Image bluePassImage = filterImage(originalImage, ColorMaskImageFilter.getBluePass());

		// Creates and shows GUI.
		RGBImageFiltersFrame frame = new RGBImageFiltersFrame(0, 4, 16, 16);
		frame.addImageBox(originalImage, "ORIGINAL");
		frame.addImageBox(negativeImage, "NEGATIVE");
		frame.addImageBox(swingGrayImage, "GRAY (Swing filter)");
		frame.addImageBox(avgDesaturationImage, "AVERAGE DESATURATION");
		frame.addImageBox(hueShiftImage, "HUE SHIFT (+1/6)");
		frame.addImageBox(redPassImage, "RED PASS");
		frame.addImageBox(greenPassImage, "GREEN PASS");
		frame.addImageBox(bluePassImage, "BLUE PASS");

		frame.pack();
		frame.setLocationRelativeTo(null);   // Centers the frame on the screen.
		frame.setVisible(true);
	}

	private Image loadImage(String resourceName) {
		// Finds the image file using the "resource" concept. See the
		// documentation of getResource/getResourceAsStream in java.lang.Class.
		URL imageUrl = getClass().getResource(resourceName);
		return Toolkit.getDefaultToolkit().getImage(imageUrl);
	}

	/*
	 * This method applies the filter (ImageFilter) to an Image creating and
	 * returning a *new* Image.
	 */
	private static Image filterImage(Image image, ImageFilter imageFilter) {
		ImageProducer producer = image.getSource();
		FilteredImageSource source = new FilteredImageSource(producer, imageFilter);
		Image filteredImage = Toolkit.getDefaultToolkit().createImage(source);
		return filteredImage;
	}
}