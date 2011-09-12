package de.lessvoid.nifty.sound.openal;

import java.util.logging.Logger;

import de.lessvoid.nifty.sound.SoundSystem;
import de.lessvoid.nifty.spi.sound.SoundDevice;
import de.lessvoid.nifty.spi.sound.SoundHandle;

/**
 * Slick Implementation of the SoundLoader.
 * @author void
 */
public class OpenALSoundDevice implements SoundDevice {

  /**
   * The logger.
   */
  private static Logger log = Logger.getLogger(SoundSystem.class.getName());

  /**
   * Load a sound.
   * @param soundSystem soundSystem
   * @param filename filename of sound
   * @return handle to sound
   */
  public SoundHandle loadSound(final SoundSystem soundSystem, final String filename) {
    try {
      return new OpenALSoundHandle(soundSystem, new Sound(filename));
    } catch (Exception e) {
      log.warning("loading of '" + filename + "' failed" + e);
    }
    return null;
  }

  /**
   * Load a music piece.
   * @param soundSystem soundSystem
   * @param filename file to load
   * @return the music piece
   */
  public SoundHandle loadMusic(final SoundSystem soundSystem, final String filename) {
    try {
      return new OpenALMusicHandle(soundSystem, new Music(filename, true));
    } catch (Exception e) {
      log.warning("loading of '" + filename + "' failed" + e);
    }
    return null;
  }

  public void update(final int delta) {
    Music.poll(delta);
  }
}
