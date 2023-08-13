package cards.pay.paycardsrecognizer.sdk.ndk;

import androidx.annotation.RestrictTo;


public interface TorchStatusListener {

    void onTorchStatusChanged(boolean turnTorchOn);

}
