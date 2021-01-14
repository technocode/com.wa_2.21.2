package X;

import android.view.View;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.GifHelper;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.io.File;

/* renamed from: X.2Yf  reason: invalid class name and case insensitive filesystem */
public class C51312Yf implements AbstractC02970Eh {
    public final /* synthetic */ ViewOnClickCListenerShape4S0200000_I1 A00;

    @Override // X.AbstractC02970Eh
    public void AFt(Exception exc) {
    }

    public C51312Yf(ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1) {
        this.A00 = viewOnClickCListenerShape4S0200000_I1;
    }

    @Override // X.AbstractC02970Eh
    public void AG3(String str, File file, byte[] bArr) {
        ViewOnClickCListenerShape4S0200000_I1 viewOnClickCListenerShape4S0200000_I1 = this.A00;
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) viewOnClickCListenerShape4S0200000_I1.A00;
        ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A07.setProgressBarVisibility(false);
        ((View) viewOnClickCListenerShape4S0200000_I1.A01).setVisibility(0);
        if (file == null) {
            Log.e("sharedtextpreviewdialogfragment/gif-preview/file is null");
        } else {
            sharedTextPreviewDialogFragment.A0M(GifHelper.A00(file, sharedTextPreviewDialogFragment.A0A(), sharedTextPreviewDialogFragment.A02, ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A09, null), 27, null);
        }
    }
}
