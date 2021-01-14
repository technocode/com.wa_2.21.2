package X;

import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.StickerStoreTabFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3QW  reason: invalid class name */
public class AnonymousClass3QW extends AnonymousClass0JW {
    public final AnonymousClass3Q5 A00;
    public final C03620Gz A01;
    public final C03570Gt A02;

    public AnonymousClass3QW(C03620Gz r1, C03570Gt r2, AnonymousClass3Q5 r3) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
        if (X.C006803i.A0m(r0) != false) goto L_0x0097;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r10) {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QW.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str = (String) obj;
        AnonymousClass3Q5 r0 = this.A00;
        if (r0 != null) {
            boolean z = false;
            if (str != null) {
                z = true;
            }
            AnonymousClass339 r02 = (AnonymousClass339) r0.A00.get();
            if (r02 != null) {
                r02.ALP(z);
            }
        }
        if (str != null) {
            C03620Gz r03 = this.A01;
            if (r03 != null) {
                AnonymousClass00E.A01();
                Iterator it = ((AbstractC003401r) r03).A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        AnonymousClass33L r12 = (AnonymousClass33L) r1.next();
                        if (r12 instanceof AnonymousClass3R9) {
                            C662733o r3 = ((AnonymousClass3R9) r12).A00;
                            if (r3.A03 != null) {
                                boolean z2 = false;
                                for (int i = 0; i < r3.A03.size(); i++) {
                                    if (((AnonymousClass33N) r3.A03.get(i)).A0D.equals(str)) {
                                        r3.A03.remove(i);
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    r3.A04(r3.A03, null);
                                }
                            }
                        } else if (r12 instanceof C71803Qj) {
                            StickerStoreTabFragment stickerStoreTabFragment = ((C71803Qj) r12).A00;
                            if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                                StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                                C71823Ql r32 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A05;
                                if (r32 != null) {
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= r32.A00.size()) {
                                            break;
                                        }
                                        AnonymousClass33N r13 = (AnonymousClass33N) r32.A00.get(i2);
                                        if (r13.A0D.equals(str)) {
                                            r32.A00.remove(r13);
                                            if (r32.A00.size() == 0) {
                                                ((AbstractC16300pa) r32).A01.A00();
                                            } else {
                                                ((AbstractC16300pa) r32).A01.A03(i2, 1);
                                            }
                                            r32.A01.A0n();
                                        } else {
                                            i2++;
                                        }
                                    }
                                    stickerStoreMyTabFragment.A03 = true;
                                }
                            } else if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A06 != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= stickerStoreTabFragment.A06.size()) {
                                        break;
                                    }
                                    AnonymousClass33N r4 = (AnonymousClass33N) stickerStoreTabFragment.A06.get(i3);
                                    if (r4.A0D.equals(str)) {
                                        r4.A05 = false;
                                        r4.A01 = 0;
                                        r4.A02 = null;
                                        C71823Ql r04 = stickerStoreTabFragment.A05;
                                        if (r04 != null) {
                                            r04.A02(i3);
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        } else if (r12 instanceof C71753Qe) {
                            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C71753Qe) r12).A00;
                            AnonymousClass33N r05 = stickerStorePackPreviewActivity.A0G.A02;
                            if (r05 != null && r05.A0D.equals(str)) {
                                stickerStorePackPreviewActivity.A0T();
                            }
                        } else if (r12 instanceof C53032cI) {
                            C48522Mp r9 = ((C53032cI) r12).A00;
                            r9.A0g.remove(str);
                            Map map = r9.A0h;
                            Collection<AbstractC48432Mf> collection = (Collection) map.get(str);
                            if (collection != null) {
                                C53022cH r7 = r9.A0V;
                                synchronized (r7) {
                                    for (AbstractC48432Mf r5 : collection) {
                                        for (C03960Il r14 : r5.A6B()) {
                                            Collection collection2 = (Collection) r7.A05.get(r14);
                                            if (collection2 != null) {
                                                collection2.remove(r5);
                                            }
                                        }
                                    }
                                }
                            }
                            map.remove(str);
                            r9.A0X.A0D(str);
                        } else {
                            continue;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                throw null;
            }
        }
    }
}
