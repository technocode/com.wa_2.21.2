package X;

import com.whatsapp.GifVideoPreviewActivity;
import com.whatsapp.TextStatusComposerActivity;
import java.util.ArrayList;

/* renamed from: X.1qy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39111qy implements AbstractC03730Hk {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ C39111qy(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    @Override // X.AbstractC03730Hk
    public final void AGa(C49262Ps r15) {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        String trim = textStatusComposerActivity.A08.getText().toString().trim();
        ArrayList arrayList = new ArrayList();
        arrayList.add(C12060hU.A00);
        C49252Pr r1 = r15.A01;
        int i = r1.A01;
        if (i <= 0) {
            i = r15.A02.A01;
        }
        int i2 = r1.A00;
        if (i2 <= 0) {
            i2 = r15.A02.A00;
        }
        textStatusComposerActivity.startActivityForResult(GifVideoPreviewActivity.A04(textStatusComposerActivity, arrayList, r15.A02.A02, r1.A02, r15.A03.A02, r15.A00, false, true, 22).putExtra("media_width", i).putExtra("media_height", i2).putExtra("caption", C002001d.A1l(trim)), 1);
    }
}
