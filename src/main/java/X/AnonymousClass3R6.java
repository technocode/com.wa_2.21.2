package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.search.verification.client.R;
import com.whatsapp.stickers.StickerStoreDialogFragment;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3R6  reason: invalid class name */
public class AnonymousClass3R6 extends AbstractC63952xH {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass3Z2 A03;
    public AnonymousClass33U A04;
    public C74183aJ A05;
    public C74193aK A06;
    public C74193aK A07;
    public C74193aK A08;
    public C74193aK A09;
    public C74203aL A0A;
    public C74213aM A0B;
    public AnonymousClass3RI A0C;
    public String A0D;
    public HashMap A0E;
    public List A0F;
    public AnonymousClass3RI[] A0G;
    public final int A0H;
    public final LayoutInflater A0I;
    public final View A0J;
    public final ViewTreeObserver.OnGlobalLayoutListener A0K = new ViewTreeObserver$OnGlobalLayoutListenerC662533m(this);
    public final AnonymousClass00D A0L;
    public final C002701k A0M;
    public final AnonymousClass00Y A0N;
    public final C69873Iw A0O;
    public final C04230Jo A0P;
    public final AnonymousClass0D1 A0Q;
    public final C03620Gz A0R;
    public final AnonymousClass33S A0S;
    public final C03570Gt A0T;
    public final AnonymousClass33U A0U = new AnonymousClass3R5(this);
    public final C71953Qy A0V;
    public final AnonymousClass3R8 A0W;
    public final C662733o A0X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3R6(C002701k r11, Activity activity, AnonymousClass00T r13, AnonymousClass00Y r14, C04230Jo r15, AnonymousClass01X r16, C03620Gz r17, C03570Gt r18, AnonymousClass00D r19, ViewGroup viewGroup, C69873Iw r21, AnonymousClass0D1 r22, AbstractC16450pp r23, C662733o r24, C71953Qy r25) {
        super(activity, r16, viewGroup, R.id.sticker_pager, r23);
        C662733o r1 = r24;
        this.A0M = r11;
        this.A0N = r14;
        this.A0R = r17;
        this.A0T = r18;
        this.A0L = r19;
        this.A0Q = r22;
        this.A0O = r21;
        this.A0P = r15;
        this.A0I = LayoutInflater.from(activity);
        this.A0S = new AnonymousClass33S();
        this.A0X = r24 == null ? new C662733o(r18, r13, r15, r17) : r1;
        this.A0V = r25;
        View findViewById = viewGroup.findViewById(R.id.sticker_store_button);
        this.A0H = super.A0A.getContext().getResources().getDimensionPixelSize(R.dimen.sticker_picker_item);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(R.dimen.sticker_picker_header_height);
        this.A01 = viewGroup.getWidth();
        this.A00 = viewGroup.getHeight() - dimensionPixelSize;
        AnonymousClass3RI[] r12 = new AnonymousClass3RI[0];
        this.A0G = r12;
        this.A0E = new HashMap();
        AnonymousClass3Z2 r0 = new AnonymousClass3Z2(r16, r12);
        this.A03 = r0;
        A02(r0);
        this.A0W = new AnonymousClass3R8(super.A07, r16, viewGroup);
        findViewById.setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 13));
        this.A0J = viewGroup.findViewById(R.id.sticker_store_badge);
        AnonymousClass3R8 r2 = this.A0W;
        AbstractC63962xI r110 = super.A04;
        if (r110 != null) {
            r110.AO6(null);
        }
        super.A04 = r2;
        r2.A04 = this;
        r2.AIH(A00());
    }

    public void A03() {
        C27131Oe r1;
        if (this.A0J.getVisibility() == 0) {
            AnonymousClass00D r8 = this.A0L;
            long j = r8.A00.getLong("sticker_store_update_hidden_time", 0);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j >= 604800000) {
                AnonymousClass008.A0l(r8, "sticker_store_update_hidden_time", currentTimeMillis);
            }
        }
        C03620Gz r0 = this.A0R;
        if (r0 != null) {
            AnonymousClass00E.A01();
            Iterator it = ((AbstractC003401r) r0).A00.iterator();
            while (true) {
                AnonymousClass0AY r12 = (AnonymousClass0AY) it;
                if (r12.hasNext()) {
                    AnonymousClass33L r13 = (AnonymousClass33L) r12.next();
                    if ((r13 instanceof C39551ri) && (r1 = ((C39551ri) r13).A00.A0l) != null && r1.A0P()) {
                        r1.A01();
                    }
                } else {
                    ((AbstractC03660Hd) super.A07).APk(new StickerStoreDialogFragment());
                    return;
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:242:0x0331 */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.3aN, X.3RI] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [X.3aN] */
    /* JADX WARN: Type inference failed for: r7v12, types: [X.3c4] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0486, code lost:
        if (r1 == null) goto L_0x0488;
     */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0519 A[LOOP:11: B:183:0x0517->B:184:0x0519, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x052a  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0578 A[LOOP:12: B:207:0x0576->B:208:0x0578, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x059f  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x05bc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.util.List r30, java.util.HashSet r31, java.util.HashMap r32, java.util.HashMap r33, java.lang.String r34) {
        /*
        // Method dump skipped, instructions count: 1470
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3R6.A04(java.util.List, java.util.HashSet, java.util.HashMap, java.util.HashMap, java.lang.String):void");
    }
}
