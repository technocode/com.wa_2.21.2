package X;

import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.0fR  reason: invalid class name and case insensitive filesystem */
public class C10930fR extends AnonymousClass0JW {
    public final C014308b A00;
    public final C007003k A01;
    public final WeakReference A02;
    public final ArrayList A03;

    public C10930fR(C007003k r2, TextEmojiLabel textEmojiLabel, ArrayList arrayList, C014308b r5) {
        this.A02 = new WeakReference(textEmojiLabel);
        this.A01 = r2;
        this.A03 = arrayList;
        this.A00 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ArrayList arrayList;
        String str = (String) obj;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) this.A02.get();
        if (textEmojiLabel != null) {
            Object tag = textEmojiLabel.getTag();
            C007003k r2 = this.A01;
            if (tag.equals(r2.A09)) {
                textEmojiLabel.setVisibility(0);
                if (!AnonymousClass1VY.A0T(r2.A09) || !TextUtils.isEmpty(r2.A0F)) {
                    arrayList = null;
                } else {
                    arrayList = this.A03;
                }
                textEmojiLabel.A04(str, arrayList, false, 0);
            }
        }
    }
}
