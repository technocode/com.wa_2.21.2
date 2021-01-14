package X;

import com.whatsapp.chatinfo.ListChatInfo;

/* renamed from: X.2Wy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51002Wy implements AnonymousClass2NW {
    public final /* synthetic */ ListChatInfo A00;

    public /* synthetic */ C51002Wy(ListChatInfo listChatInfo) {
        this.A00 = listChatInfo;
    }

    @Override // X.AnonymousClass2NW
    public final void AMP(String str) {
        ListChatInfo listChatInfo = this.A00;
        if (!listChatInfo.A0H.A08(listChatInfo.A09, false).equals(str)) {
            C007003k r1 = listChatInfo.A09;
            r1.A0F = str;
            listChatInfo.A0E.A0K(r1);
            listChatInfo.A0M.A01(listChatInfo.A0g(), str);
            listChatInfo.A0l();
            listChatInfo.A0L.A05(listChatInfo.A0g());
            listChatInfo.A0V.A03(listChatInfo.A09);
        }
    }
}
