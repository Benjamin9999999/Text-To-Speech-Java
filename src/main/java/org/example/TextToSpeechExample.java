package org.example;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeechExample {
    public static void main(String[] args) {
        // Create a VoiceManager
        VoiceManager voiceManager = VoiceManager.getInstance();

        // Allocate a voice
        Voice voice = voiceManager.getVoice("kevin16");

        // Loading the voice
        voice.allocate();

        // Speak the desired text
        speakText("You are on the fifth floor.");

        // Deallocate the voice resources
        voice.deallocate();
    }

    private static void speakText(String text) {
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");
        voice.allocate();
        voice.speak(text);
    }
}
