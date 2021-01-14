package X;

import android.widget.RelativeLayout;
import com.whatsapp.contact.picker.SharedFilePreviewDialogFragment;
import java.io.File;

/* renamed from: X.2Y7  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y7 implements AnonymousClass35j {
    public final /* synthetic */ RelativeLayout A00;
    public final /* synthetic */ SharedFilePreviewDialogFragment A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ AnonymousClass2Y7(SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment, String str, RelativeLayout relativeLayout) {
        this.A01 = sharedFilePreviewDialogFragment;
        this.A02 = str;
        this.A00 = relativeLayout;
    }

    @Override // X.AnonymousClass35j
    public final void AG2(File file) {
        SharedFilePreviewDialogFragment sharedFilePreviewDialogFragment = this.A01;
        String str = this.A02;
        RelativeLayout relativeLayout = this.A00;
        sharedFilePreviewDialogFragment.A02 = file;
        if (C02230Bd.A05(str) == 2) {
            C47062Gh r0 = new C47062Gh(sharedFilePreviewDialogFragment.A0A());
            r0.A00(sharedFilePreviewDialogFragment, file);
            relativeLayout.addView(r0);
            return;
        }
        C47072Gi r1 = new C47072Gi(sharedFilePreviewDialogFragment.A0A());
        r1.A00(sharedFilePreviewDialogFragment, file, str, sharedFilePreviewDialogFragment.A00);
        relativeLayout.addView(r1);
    }
}
