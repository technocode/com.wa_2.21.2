package X;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3RT  reason: invalid class name */
public class AnonymousClass3RT extends AbstractC16300pa {
    public AnonymousClass34B A00;
    public AnonymousClass34B A01;
    public AnonymousClass34J A02;
    public C72033Rg A03;
    public String A04;
    public List A05 = new ArrayList();
    public List A06;
    public boolean A07;
    public boolean A08;
    public final int A09;
    public final View.OnClickListener A0A;
    public final LinearLayoutManager A0B;
    public final AnonymousClass02M A0C;
    public final AnonymousClass0YX A0D;
    public final C08580bN A0E;
    public final Runnable A0F = new RunnableEBaseShape13S0100000_I1_8(this, 7);
    public final String A0G;
    public final LinkedHashMap A0H;

    public AnonymousClass3RT(AnonymousClass02M r4, LinearLayoutManager linearLayoutManager, AnonymousClass0YX r6, int i, String str, C08580bN r9, View.OnClickListener onClickListener) {
        this.A0C = r4;
        this.A0B = linearLayoutManager;
        this.A0D = r6;
        this.A09 = i;
        this.A0G = str;
        this.A0E = r9;
        this.A0A = onClickListener;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A0H = linkedHashMap;
        linkedHashMap.put(2, Boolean.FALSE);
        this.A0H.put(1, Boolean.TRUE);
        this.A0H.put(3, Boolean.FALSE);
        this.A0H.put(4, Boolean.TRUE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (A09() != 0) goto L_0x002d;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A05() {
        /*
            r3 = this;
            int r0 = r3.A08()
            int r2 = r3.A09()
            int r2 = r2 + r0
            boolean r0 = r3.A07
            r1 = 0
            if (r0 == 0) goto L_0x0021
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x0021
            java.util.List r0 = r3.A05
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0020
            int r0 = r3.A0A()
            if (r0 <= 0) goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            int r2 = r2 + r1
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x002d
            int r1 = r3.A09()
            r0 = 1
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RT.A05():int");
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 1) {
            C72033Rg r1 = this.A03;
            if (r1 != null) {
                return r1;
            }
            C72033Rg r12 = new C72033Rg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_summary_view, viewGroup, false));
            this.A03 = r12;
            return r12;
        } else if (i == 2) {
            return new C72023Rf(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_loading_header, viewGroup, false));
        } else {
            if (i == 3) {
                return new AnonymousClass3RX(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_cleanup_suggestions, viewGroup, false));
            }
            if (i == 4) {
                return new AnonymousClass3RV(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_search_view, viewGroup, false));
            }
            if (i == 6) {
                return new AnonymousClass3RU(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_footer_view, viewGroup, false));
            }
            if (i != 7) {
                return new AnonymousClass3RW(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.storage_usage_chat_row_item, viewGroup, false));
            }
            C73903Zh r13 = new C73903Zh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_no_result, viewGroup, false));
            r13.A0F(Boolean.TRUE);
            return r13;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        if (r12.A02.size() < 4) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010a, code lost:
        if (r8.A02.size() < 4) goto L_0x010c;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r21, int r22) {
        /*
        // Method dump skipped, instructions count: 1039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RT.A07(X.0hD, int):void");
    }

    public final int A08() {
        int i = 0;
        for (Map.Entry entry : this.A0H.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    public final int A09() {
        if (!this.A07 || this.A08) {
            return this.A05.size();
        }
        return this.A05.size() - A0A();
    }

    public final int A0A() {
        int i = 0;
        for (AnonymousClass1VD r0 : this.A05) {
            if (r0.A00.A0G == 0) {
                i++;
            }
        }
        return i;
    }

    public final int A0B(int i) {
        int i2 = 0;
        for (Map.Entry entry : this.A0H.entrySet()) {
            if (((Boolean) entry.getValue()).booleanValue()) {
                if (((Number) entry.getKey()).intValue() == i) {
                    return i2;
                }
                i2++;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r2 < 4) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0.A02.size() < 4) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r7 = this;
            java.util.LinkedHashMap r6 = r7.A0H
            r4 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r6.get(r5)
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            X.34B r0 = r7.A01
            if (r0 == 0) goto L_0x001c
            java.util.List r0 = r0.A02
            int r1 = r0.size()
            r0 = 4
            r3 = 1
            if (r1 >= r0) goto L_0x001d
        L_0x001c:
            r3 = 0
        L_0x001d:
            X.34B r0 = r7.A00
            if (r0 == 0) goto L_0x002b
            java.util.List r0 = r0.A02
            int r2 = r0.size()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r3 != 0) goto L_0x0041
            if (r0 != 0) goto L_0x0041
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0056
            r0 = 0
            r7.A0D(r4, r0)
            return
        L_0x0041:
            java.lang.Object r0 = r6.get(r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r7.A08
            if (r0 != 0) goto L_0x0055
            r0 = 1
            r7.A0D(r4, r0)
        L_0x0055:
            return
        L_0x0056:
            int r0 = r7.A0B(r4)
            if (r0 < 0) goto L_0x005f
            r7.A02(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RT.A0C():void");
    }

    public final void A0D(int i, boolean z) {
        LinkedHashMap linkedHashMap = this.A0H;
        Integer valueOf = Integer.valueOf(i);
        if (linkedHashMap.get(valueOf) != null && ((Boolean) linkedHashMap.get(valueOf)).booleanValue() != z) {
            if (z) {
                linkedHashMap.put(valueOf, Boolean.TRUE);
                int A0B2 = A0B(i);
                super.A01.A02(A0B2, 1);
                if (A0B2 == 0) {
                    LinearLayoutManager linearLayoutManager = this.A0B;
                    if (linearLayoutManager.A0r() == 0) {
                        linearLayoutManager.A0M(0);
                        return;
                    }
                    return;
                }
                return;
            }
            super.A01.A03(A0B(i), 1);
            linkedHashMap.put(valueOf, Boolean.FALSE);
        }
    }

    public void A0E(List list, List list2, String str, List list3) {
        this.A05 = list;
        this.A04 = str;
        this.A06 = list3;
        this.A07 = true;
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                super.A01.A02(A08() + intValue, 1);
            }
            return;
        }
        super.A01.A00();
    }

    public void A0F(boolean z) {
        this.A08 = z;
        int A0A2 = A0A();
        if (z) {
            A0D(1, false);
            A0D(3, false);
            A0D(4, false);
            super.A01.A04(A05() - 1, A0A2 + 1, null);
            return;
        }
        A0D(1, true);
        A0C();
        A0D(4, true);
        super.A01.A04(A05() - A0A2, A0A2, null);
    }

    public void A0G(boolean z) {
        AnonymousClass02M r0 = this.A0C;
        Runnable runnable = this.A0F;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        if (z) {
            handler.postDelayed(runnable, 1000);
        } else {
            A0D(2, false);
        }
    }
}
