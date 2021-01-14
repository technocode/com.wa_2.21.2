package X;

import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1w2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42031w2 implements AnonymousClass1RW {
    public final /* synthetic */ CatalogHeader A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C42031w2(CatalogHeader catalogHeader, UserJid userJid) {
        this.A00 = catalogHeader;
        this.A01 = userJid;
    }

    @Override // X.AnonymousClass1RW
    public final void ADb(C28231Tk r12) {
        TextEmojiLabel textEmojiLabel;
        CatalogHeader catalogHeader = this.A00;
        UserJid userJid = this.A01;
        if (!catalogHeader.A04 && (r12 == null || (catalogHeader.A07.A0D(AbstractC000400g.A0c) && !r12.A08))) {
            new C40141sh(catalogHeader.A0A.A01(), userJid, null, catalogHeader.A05, catalogHeader.A0H, catalogHeader.A0C, catalogHeader.A09).A00(catalogHeader);
            catalogHeader.A04 = true;
        }
        if (r12 != null && (textEmojiLabel = catalogHeader.A02) != null) {
            textEmojiLabel.A02(r12.A03);
        }
    }
}
