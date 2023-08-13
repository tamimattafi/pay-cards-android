package cards.pay.paycardsrecognizer.sdk.ndk;


import android.graphics.Bitmap;

import androidx.annotation.RestrictTo;


public interface RecognitionStatusListener {

    void onRecognitionComplete(RecognitionResult result);

    void onCardImageReceived(Bitmap bitmap);

}
