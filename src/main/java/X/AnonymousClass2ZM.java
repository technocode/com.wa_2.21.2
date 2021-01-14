package X;

import android.text.Spannable;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.2ZM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZM implements AnonymousClass1KM {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ AbstractC51572Zg A01;
    public final /* synthetic */ AbstractC007503q A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass2ZM(AbstractC51572Zg r1, TextEmojiLabel textEmojiLabel, AbstractC007503q r3, boolean z) {
        this.A01 = r1;
        this.A00 = textEmojiLabel;
        this.A02 = r3;
        this.A03 = z;
    }

    @Override // X.AnonymousClass1KM
    public final void AMm(Spannable spannable) {
        this.A01.A0U(spannable, this.A00, this.A02, this.A03, false, false);
    }
}
