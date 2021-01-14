package X;

import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3Qh  reason: invalid class name and case insensitive filesystem */
public class C71783Qh extends AnonymousClass0JW {
    public final AnonymousClass3QA A00;
    public final C03570Gt A01;

    public C71783Qh(AnonymousClass3QA r1, C03570Gt r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass0JW
    public Object A02(Object[] objArr) {
        AnonymousClass33N[] r6 = (AnonymousClass33N[]) objArr;
        if (r6 != null) {
            boolean z = true;
            if (r6.length != 1) {
                z = false;
            }
            AnonymousClass00E.A06(z);
            AnonymousClass33N r0 = r6[0];
            if (r0 != null) {
                List<C29241Xq> list = r0.A04;
                ArrayList arrayList = new ArrayList(list.size());
                for (C29241Xq r2 : list) {
                    arrayList.add(Boolean.valueOf(this.A01.A0N.A02(r2.A0A)));
                }
                return arrayList;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        AnonymousClass3QA r0 = this.A00;
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = r0.A01;
        AnonymousClass33N r3 = r0.A00;
        stickerStorePackPreviewActivity.A0N = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            if (((Boolean) list.get(i)).booleanValue()) {
                stickerStorePackPreviewActivity.A0N.add(((C29241Xq) r3.A04.get(i)).A0A);
            }
        }
        stickerStorePackPreviewActivity.A0U();
    }
}
