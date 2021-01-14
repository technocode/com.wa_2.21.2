package X;

import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1vk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C41851vk implements AnonymousClass0SG {
    public final /* synthetic */ CartFragment A00;

    public /* synthetic */ C41851vk(CartFragment cartFragment) {
        this.A00 = cartFragment;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        CartFragment cartFragment = this.A00;
        List<C27711Rc> list = (List) obj;
        ((ActivityC004702f) cartFragment.A0B()).AMi();
        C41831vi r1 = cartFragment.A0F;
        synchronized (r1) {
            r1.A00 = list;
            ((AbstractC16300pa) r1).A01.A00();
        }
        cartFragment.A0z();
        C41991vy r4 = cartFragment.A0G;
        int i = cartFragment.A02;
        int i2 = cartFragment.A01;
        if (!(r4.A00 || list.isEmpty())) {
            r4.A00 = true;
            ArrayList arrayList = new ArrayList(list.size());
            for (C27711Rc r0 : list) {
                arrayList.add(r0.A01.A06);
            }
            C27701Rb r02 = r4.A0D;
            UserJid userJid = r4.A0J;
            C41781vd r15 = r02.A0A;
            r15.A00 = r02.A0G;
            AnonymousClass09H r11 = r15.A03;
            String A02 = r11.A02();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new AnonymousClass0M5("width", (AnonymousClass0OS[]) null, Integer.toString(i)));
            arrayList2.add(new AnonymousClass0M5("height", (AnonymousClass0OS[]) null, Integer.toString(i2)));
            AnonymousClass0M5 r03 = new AnonymousClass0M5("image_dimensions", null, (AnonymousClass0M5[]) arrayList2.toArray(new AnonymousClass0M5[0]), null);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(r03);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new AnonymousClass0M5("id", (AnonymousClass0OS[]) null, (String) it.next()));
                arrayList3.add(new AnonymousClass0M5("product", null, (AnonymousClass0M5[]) arrayList4.toArray(new AnonymousClass0M5[0]), null));
            }
            AnonymousClass0M5 r6 = new AnonymousClass0M5("cart", new AnonymousClass0OS[]{new AnonymousClass0OS("op", "refresh", null, (byte) 0), new AnonymousClass0OS("biz_jid", userJid.getRawString(), null, (byte) 0)}, (AnonymousClass0M5[]) arrayList3.toArray(new AnonymousClass0M5[0]), null);
            r11.A06(253, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("smax_id", "11", null, (byte) 0), new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("xmlns", "fb:thrift_iq", null, (byte) 0), new AnonymousClass0OS("type", "get", null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00)}, r6), r15, 32000);
            AnonymousClass008.A14("RefreshCart/sendRefreshCartRequest biz_jid=", userJid);
        }
    }
}
