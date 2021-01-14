package X;

import android.util.SparseBooleanArray;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreFeaturedTabFragment;
import com.whatsapp.stickers.StickerStoreMyTabFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.StickerStoreTabFragment;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3QS  reason: invalid class name */
public class AnonymousClass3QS extends AnonymousClass0JW {
    public final AnonymousClass3Q9 A00;
    public final C03620Gz A01;
    public final AnonymousClass0H0 A02;
    public final C03570Gt A03;
    public final String A04;

    public AnonymousClass3QS(C03620Gz r1, C03570Gt r2, AnonymousClass0H0 r3, String str, AnonymousClass3Q9 r5) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A00 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object... objArr) {
        int intValue = ((Number) objArr[1]).intValue();
        AnonymousClass0H0 r0 = this.A02;
        String str = this.A04;
        r0.A01.put(str, Integer.valueOf(intValue));
        this.A01.A03(str, intValue);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00aa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ae, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d3, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d7, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ec, code lost:
        if (r9 == false) goto L_0x00ee;
     */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r20) {
        /*
        // Method dump skipped, instructions count: 826
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3QS.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass338 r2 = (AnonymousClass338) obj;
        if (r2 != null) {
            A04(r2);
            return;
        }
        throw null;
    }

    public final void A04(AnonymousClass338 r19) {
        AnonymousClass33N r2;
        if (r19.A02 != null && (r2 = r19.A00) != null) {
            C03620Gz r0 = this.A01;
            if (r0 != null) {
                AnonymousClass00E.A01();
                Iterator it = ((AbstractC003401r) r0).A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (!r1.hasNext()) {
                        break;
                    }
                    AnonymousClass33L r12 = (AnonymousClass33L) r1.next();
                    if (r12 instanceof AnonymousClass3R9) {
                        C662733o r5 = ((AnonymousClass3R9) r12).A00;
                        HashMap hashMap = r5.A09;
                        String str = r2.A0D;
                        hashMap.remove(str);
                        r5.A0A.remove(str);
                        if (r5.A03 != null) {
                            int i = 0;
                            while (true) {
                                if (i >= r5.A03.size()) {
                                    r5.A03.add(r2);
                                    Collections.sort(r5.A03, new AnonymousClass33P(false));
                                    break;
                                } else if (((AnonymousClass33N) r5.A03.get(i)).A0D.equals(str)) {
                                    r5.A03.set(i, r2);
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            r5.A04(r5.A03, null);
                        } else {
                            r5.A03();
                        }
                    } else if (r12 instanceof C71803Qj) {
                        StickerStoreTabFragment stickerStoreTabFragment = ((C71803Qj) r12).A00;
                        if (stickerStoreTabFragment instanceof StickerStoreMyTabFragment) {
                            StickerStoreMyTabFragment stickerStoreMyTabFragment = (StickerStoreMyTabFragment) stickerStoreTabFragment;
                            if (((StickerStoreTabFragment) stickerStoreMyTabFragment).A05 != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06.size()) {
                                        C71823Ql r8 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A05;
                                        if (!(r8 instanceof C74143aE)) {
                                            r8.A00.add(r2);
                                            ((AbstractC16300pa) r8).A01.A02(r8.A00.indexOf(r2), 1);
                                            r8.A01.A0n();
                                        } else {
                                            C74143aE r82 = (C74143aE) r8;
                                            ((C71823Ql) r82).A00.add(0, r2);
                                            ((AbstractC16300pa) r82).A01.A02(((C71823Ql) r82).A00.indexOf(r2), 1);
                                            r82.A00.A0n();
                                        }
                                        stickerStoreMyTabFragment.A03 = true;
                                    } else if (((AnonymousClass33N) ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06.get(i2)).A0D.equals(r2.A0D)) {
                                        ((StickerStoreTabFragment) stickerStoreMyTabFragment).A06.set(i2, r2);
                                        C71823Ql r02 = ((StickerStoreTabFragment) stickerStoreMyTabFragment).A05;
                                        if (r02 != null) {
                                            r02.A02(i2);
                                        }
                                    } else {
                                        i2++;
                                    }
                                }
                            }
                        } else if ((stickerStoreTabFragment instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment.A06 != null) {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= stickerStoreTabFragment.A06.size()) {
                                    break;
                                } else if (((AnonymousClass33N) stickerStoreTabFragment.A06.get(i3)).A0D.equals(r2.A0D)) {
                                    stickerStoreTabFragment.A06.set(i3, r2);
                                    C71823Ql r03 = stickerStoreTabFragment.A05;
                                    if (r03 != null) {
                                        r03.A02(i3);
                                    }
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else if (r12 instanceof C71753Qe) {
                        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = ((C71753Qe) r12).A00;
                        AnonymousClass33O r6 = stickerStorePackPreviewActivity.A0G;
                        AnonymousClass33N r04 = r6.A02;
                        if (r04 != null && r04.A0D.equals(r2.A0D)) {
                            r6.A02 = r2;
                            r6.A01 = new SparseBooleanArray();
                            r6.A00 = new SparseBooleanArray();
                            stickerStorePackPreviewActivity.A0M = new HashMap();
                            stickerStorePackPreviewActivity.A0N = null;
                            AnonymousClass3QA r13 = new AnonymousClass3QA(stickerStorePackPreviewActivity, r2);
                            Log.d("StickerStorePackPreviewActivity/getStarredStickerListAsync/begin");
                            C03570Gt r83 = stickerStorePackPreviewActivity.A0V;
                            stickerStorePackPreviewActivity.A0X.ANC(new C71783Qh(r13, r83), r2);
                            for (int i4 = 0; i4 < r2.A04.size(); i4++) {
                                stickerStorePackPreviewActivity.A0M.put(((C29241Xq) r2.A04.get(i4)).A0A, Integer.valueOf(i4));
                            }
                            if (stickerStorePackPreviewActivity.A0H == null) {
                                AnonymousClass3QO r10 = new AnonymousClass3QO(r83.A04(), stickerStorePackPreviewActivity.A0S, stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_item), stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(R.dimen.sticker_store_preview_padding), true, "sticker_store_my_tab".equals(stickerStorePackPreviewActivity.getIntent().getStringExtra("sticker_pack_preview_source")), stickerStorePackPreviewActivity.A0J);
                                stickerStorePackPreviewActivity.A0H = r10;
                                r10.A05 = stickerStorePackPreviewActivity.A0W;
                                stickerStorePackPreviewActivity.A0B.setAdapter(r10);
                            }
                            AnonymousClass3QO r14 = stickerStorePackPreviewActivity.A0H;
                            r14.A04 = stickerStorePackPreviewActivity.A0G;
                            ((AbstractC16300pa) r14).A01.A00();
                            stickerStorePackPreviewActivity.A0U();
                            stickerStorePackPreviewActivity.setResult(1);
                            stickerStorePackPreviewActivity.finish();
                        }
                    } else if (r12 instanceof C53032cI) {
                        C48522Mp r52 = ((C53032cI) r12).A00;
                        List A002 = C48522Mp.A00(r52, r2);
                        Map map = r52.A0g;
                        String str2 = r2.A0D;
                        map.put(str2, r2);
                        r52.A0V.A02(A002);
                        r52.A0h.put(str2, A002);
                        C48522Mp.A01(r52, A002);
                        AnonymousClass2cQ r7 = r52.A0X;
                        LinkedHashMap linkedHashMap = r7.A04;
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        r7.A04 = linkedHashMap2;
                        linkedHashMap2.put(str2, r7.A09(r2));
                        r7.A04.putAll(linkedHashMap);
                        r7.A0B();
                        ((AbstractC16300pa) r7).A01.A04(r7.A05.size(), r7.A05() - r7.A05.size(), null);
                        r7.A0C();
                    }
                }
            } else {
                throw null;
            }
        } else if (r19.A01 != null) {
            C03620Gz r05 = this.A01;
            String str3 = this.A04;
            if (r05 != null) {
                AnonymousClass00E.A01();
                Iterator it2 = ((AbstractC003401r) r05).A00.iterator();
                while (true) {
                    AnonymousClass0AY r15 = (AnonymousClass0AY) it2;
                    if (!r15.hasNext()) {
                        break;
                    }
                    AnonymousClass33L r16 = (AnonymousClass33L) r15.next();
                    if (r16 instanceof AnonymousClass3R9) {
                        C662733o r22 = ((AnonymousClass3R9) r16).A00;
                        r22.A09.remove(str3);
                        r22.A0A.remove(str3);
                        List list = r22.A03;
                        if (list != null) {
                            r22.A04(list, null);
                        }
                    } else if (r16 instanceof C71803Qj) {
                        StickerStoreTabFragment stickerStoreTabFragment2 = ((C71803Qj) r16).A00;
                        if (!(stickerStoreTabFragment2 instanceof StickerStoreMyTabFragment)) {
                            if ((stickerStoreTabFragment2 instanceof StickerStoreFeaturedTabFragment) && stickerStoreTabFragment2.A06 != null) {
                                for (int i5 = 0; i5 < stickerStoreTabFragment2.A06.size(); i5++) {
                                    AnonymousClass33N r122 = (AnonymousClass33N) stickerStoreTabFragment2.A06.get(i5);
                                    if (r122.A0D.equals(str3)) {
                                        r122.A05 = false;
                                        C71823Ql r06 = stickerStoreTabFragment2.A05;
                                        if (r06 != null) {
                                            r06.A02(i5);
                                        }
                                        stickerStoreTabFragment2.A08.A0C(stickerStoreTabFragment2.A09.A0D(R.string.sticker_store_download_failed, r122.A0F), 1);
                                    }
                                }
                            }
                        } else if (stickerStoreTabFragment2.A06 != null) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= stickerStoreTabFragment2.A06.size()) {
                                    break;
                                }
                                AnonymousClass33N r17 = (AnonymousClass33N) stickerStoreTabFragment2.A06.get(i6);
                                if (r17.A0D.equals(str3)) {
                                    r17.A05 = false;
                                    C71823Ql r07 = stickerStoreTabFragment2.A05;
                                    if (r07 != null) {
                                        r07.A02(i6);
                                    }
                                } else {
                                    i6++;
                                }
                            }
                        }
                    } else if (r16 instanceof C71753Qe) {
                        StickerStorePackPreviewActivity stickerStorePackPreviewActivity2 = ((C71753Qe) r16).A00;
                        AnonymousClass33N r102 = stickerStorePackPreviewActivity2.A0G.A02;
                        if (r102 != null && str3.equals(r102.A0D)) {
                            r102.A05 = false;
                            stickerStorePackPreviewActivity2.A0U();
                            ((ActivityC004702f) stickerStorePackPreviewActivity2).A0F.A0C(((AnonymousClass2C0) stickerStorePackPreviewActivity2).A01.A0D(R.string.sticker_store_download_failed, r102.A0F), 1);
                        }
                    }
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
        AnonymousClass0H0 r23 = this.A02;
        String str4 = this.A04;
        r23.A01.remove(str4);
        r23.A00.remove(str4);
        AnonymousClass3Q9 r08 = this.A00;
        if (r08 != null) {
            Runnable runnable = r08.A00;
            if (r19.A03 && runnable != null) {
                runnable.run();
            }
        }
    }
}
