package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.search.IteratingPlayer;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.concurrent.Executors;

/* renamed from: X.3ZP  reason: invalid class name */
public class AnonymousClass3ZP extends AbstractC54572f8 implements AnonymousClass1O0 {
    public RecyclerView A00;
    public String A01 = "";
    public final Activity A02;
    public final AbstractC013907w A03;
    public final C02780Dk A04;
    public final AnonymousClass0GG A05;
    public final C09050cD A06;
    public final AnonymousClass009 A07;
    public final AnonymousClass02M A08;
    public final AnonymousClass01I A09;
    public final AnonymousClass0Z6 A0A;
    public final C000300f A0B;
    public final AnonymousClass0Z7 A0C;
    public final C017009c A0D;
    public final AnonymousClass0HJ A0E;
    public final AnonymousClass01A A0F;
    public final C014308b A0G;
    public final AnonymousClass0YX A0H;
    public final C09030cB A0I = new C09030cB(Executors.newSingleThreadExecutor());
    public final C09610dF A0J;
    public final AnonymousClass03P A0K;
    public final AnonymousClass00S A0L;
    public final AnonymousClass00G A0M;
    public final AnonymousClass03S A0N;
    public final AnonymousClass01X A0O;
    public final C006903j A0P;
    public final AnonymousClass0AQ A0Q;
    public final AnonymousClass0A9 A0R;
    public final AnonymousClass0AP A0S;
    public final C48032Kq A0T;
    public final AnonymousClass0BW A0U;
    public final C02590Cr A0V;
    public final AnonymousClass01S A0W;
    public final C02770Dj A0X;
    public final C02150Av A0Y;
    public final AnonymousClass022 A0Z;
    public final IteratingPlayer A0a;
    public final AnonymousClass3ZO A0b;
    public final C08620bR A0c = new C08620bR();
    public final SearchViewModel A0d;
    public final AnonymousClass0BB A0e;
    public final AnonymousClass31y A0f;
    public final C04370Kc A0g;
    public final AnonymousClass00T A0h;
    public final AnonymousClass3SQ A0i;

    public static boolean A00(int i) {
        return i == 9 || i == 8 || i == 10;
    }

    public AnonymousClass3ZP(AnonymousClass00S r3, Activity activity, AnonymousClass0Z6 r5, AbstractC013907w r6, C04370Kc r7, AnonymousClass02M r8, AnonymousClass009 r9, AnonymousClass00T r10, AnonymousClass01I r11, AnonymousClass00G r12, C006903j r13, C02590Cr r14, C000300f r15, C02780Dk r16, C02770Dj r17, C02150Av r18, AnonymousClass0HJ r19, AnonymousClass01A r20, C09050cD r21, AnonymousClass0A9 r22, AnonymousClass03P r23, C014308b r24, AnonymousClass01X r25, C48032Kq r26, AnonymousClass0GG r27, AnonymousClass0AP r28, AnonymousClass31y r29, AnonymousClass0BB r30, AnonymousClass3SQ r31, AnonymousClass0BW r32, AnonymousClass03S r33, AnonymousClass0YX r34, C017009c r35, AnonymousClass01S r36, AnonymousClass022 r37, AnonymousClass0Z7 r38, SearchViewModel searchViewModel, AnonymousClass0AQ r40, IteratingPlayer iteratingPlayer) {
        this.A0L = r3;
        this.A02 = activity;
        this.A0A = r5;
        this.A03 = r6;
        this.A0g = r7;
        this.A08 = r8;
        this.A07 = r9;
        this.A0h = r10;
        this.A09 = r11;
        this.A0M = r12;
        this.A0P = r13;
        this.A0V = r14;
        this.A0B = r15;
        this.A0X = r17;
        this.A0Y = r18;
        this.A04 = r16;
        this.A0E = r19;
        this.A0F = r20;
        this.A06 = r21;
        this.A0K = r23;
        this.A0G = r24;
        this.A0O = r25;
        this.A0R = r22;
        this.A0T = r26;
        this.A0d = searchViewModel;
        this.A0a = iteratingPlayer;
        this.A05 = r27;
        this.A0S = r28;
        this.A0f = r29;
        this.A0e = r30;
        this.A0H = r34;
        this.A0i = r31;
        this.A0U = r32;
        this.A0N = r33;
        this.A0D = r35;
        this.A0W = r36;
        this.A0Z = r37;
        this.A0C = r38;
        this.A0Q = r40;
        this.A0b = new AnonymousClass3ZO(this, this);
        this.A0J = new C09610dF(r25);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A0c.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == -1) {
            return new C73883Zf(new View(viewGroup.getContext()));
        }
        if (i != 99) {
            if (i == 1) {
                return new C73893Zg(new AnonymousClass31A(viewGroup.getContext()), this.A0O);
            } else if (!(i == 2 || i == 3)) {
                if (i == 4) {
                    return new C73993Zs(new AnonymousClass3ZZ(viewGroup.getContext()));
                }
                switch (i) {
                    case 6:
                        return new C73983Zr(new AnonymousClass3ZY(viewGroup.getContext()));
                    case 7:
                        Context context = viewGroup.getContext();
                        AnonymousClass00S r6 = this.A0L;
                        AnonymousClass01I r7 = this.A09;
                        C02590Cr r8 = this.A0V;
                        C09610dF r9 = this.A0J;
                        AnonymousClass01A r10 = this.A0F;
                        AnonymousClass03P r11 = this.A0K;
                        C014308b r12 = this.A0G;
                        AnonymousClass01X r13 = this.A0O;
                        AnonymousClass31y r14 = this.A0f;
                        AnonymousClass022 r1 = this.A0Z;
                        SearchViewModel searchViewModel = this.A0d;
                        C73863Zc r4 = new C73863Zc(context, r6, r7, r8, r9, r10, r11, r12, r13, r14, this.A0I, r1);
                        r4.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new C73963Zp(r4, searchViewModel);
                    case 8:
                        return new C73943Zl(new C74913bm(viewGroup.getContext()), this.A0d);
                    case 9:
                        return new C73943Zl(new C73853Zb(viewGroup.getContext()), this.A0d);
                    case 10:
                        return new C73943Zl(new C74973bs(viewGroup.getContext()), this.A0d);
                    case 11:
                        AnonymousClass00S r15 = this.A0L;
                        C04370Kc r16 = this.A0g;
                        AnonymousClass02M r17 = this.A08;
                        AnonymousClass009 r18 = this.A07;
                        AnonymousClass01I r19 = this.A09;
                        AnonymousClass00T r152 = this.A0h;
                        C02590Cr r142 = this.A0V;
                        C000300f r122 = this.A0B;
                        C09610dF r112 = this.A0J;
                        C02780Dk r102 = this.A04;
                        AnonymousClass01A r92 = this.A0F;
                        AnonymousClass03P r82 = this.A0K;
                        C014308b r72 = this.A0G;
                        AnonymousClass01X r62 = this.A0O;
                        AnonymousClass31y r5 = this.A0f;
                        AnonymousClass0BW r42 = this.A0U;
                        AnonymousClass03S r3 = this.A0N;
                        AnonymousClass022 r110 = this.A0Z;
                        SearchViewModel searchViewModel2 = this.A0d;
                        C74893bk r162 = new C74893bk(viewGroup.getContext(), r15, r16, r17, r18, r19, r152, r142, r122, r112, r102, r92, r82, r72, r62, r5, r42, r3, this.A0I, r110);
                        r162.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new C73933Zk(r162, searchViewModel2);
                    case 12:
                        return new C73873Ze(new AnonymousClass31A(viewGroup.getContext()));
                    case 13:
                        return new C73903Zh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_no_result, viewGroup, false));
                    case 14:
                        Context context2 = viewGroup.getContext();
                        AnonymousClass00S r63 = this.A0L;
                        AnonymousClass01I r73 = this.A09;
                        C02590Cr r83 = this.A0V;
                        C09610dF r93 = this.A0J;
                        AnonymousClass01A r103 = this.A0F;
                        AnonymousClass03P r113 = this.A0K;
                        C014308b r123 = this.A0G;
                        AnonymousClass01X r132 = this.A0O;
                        AnonymousClass31y r143 = this.A0f;
                        AnonymousClass022 r111 = this.A0Z;
                        SearchViewModel searchViewModel3 = this.A0d;
                        C74873bi r43 = new C74873bi(context2, r63, r73, r83, r93, r103, r113, r123, r132, r143, this.A0I, r111);
                        r43.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new C73923Zj(r43, searchViewModel3);
                    case 15:
                        Context context3 = viewGroup.getContext();
                        AnonymousClass00S r64 = this.A0L;
                        AnonymousClass01I r74 = this.A09;
                        C02590Cr r84 = this.A0V;
                        C09610dF r94 = this.A0J;
                        AnonymousClass01A r104 = this.A0F;
                        AnonymousClass03P r114 = this.A0K;
                        C014308b r124 = this.A0G;
                        AnonymousClass01X r133 = this.A0O;
                        AnonymousClass31y r144 = this.A0f;
                        AnonymousClass022 r115 = this.A0Z;
                        SearchViewModel searchViewModel4 = this.A0d;
                        C74983bt r44 = new C74983bt(context3, r64, r74, r84, r94, r104, r114, r124, r133, r144, this.A0I, r115);
                        r44.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new C73973Zq(r44, searchViewModel4);
                    case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        Context context4 = viewGroup.getContext();
                        AnonymousClass00S r52 = this.A0L;
                        AnonymousClass01I r65 = this.A09;
                        C02590Cr r75 = this.A0V;
                        C09610dF r85 = this.A0J;
                        AnonymousClass01A r95 = this.A0F;
                        AnonymousClass03P r105 = this.A0K;
                        C014308b r116 = this.A0G;
                        AnonymousClass01X r125 = this.A0O;
                        AnonymousClass31y r134 = this.A0f;
                        AnonymousClass022 r153 = this.A0Z;
                        return new C73953Zo(new C74933bo(context4, r52, r65, r75, r85, r95, r105, r116, r125, r134, this.A0I, r153), this.A0d);
                    case 17:
                        Context context5 = viewGroup.getContext();
                        AnonymousClass00S r53 = this.A0L;
                        AnonymousClass01I r66 = this.A09;
                        C02590Cr r76 = this.A0V;
                        C09610dF r86 = this.A0J;
                        AnonymousClass01A r96 = this.A0F;
                        AnonymousClass03P r106 = this.A0K;
                        C014308b r117 = this.A0G;
                        AnonymousClass01X r126 = this.A0O;
                        AnonymousClass31y r135 = this.A0f;
                        AnonymousClass022 r154 = this.A0Z;
                        return new C73953Zo(new C74963br(context5, r53, r66, r76, r86, r96, r106, r117, r126, r135, this.A0I, r154), this.A0d);
                    case 18:
                        Context context6 = viewGroup.getContext();
                        AnonymousClass00S r54 = this.A0L;
                        AnonymousClass01I r67 = this.A09;
                        C02590Cr r77 = this.A0V;
                        C09610dF r87 = this.A0J;
                        AnonymousClass01A r97 = this.A0F;
                        AnonymousClass03P r107 = this.A0K;
                        C014308b r118 = this.A0G;
                        AnonymousClass01X r127 = this.A0O;
                        AnonymousClass31y r136 = this.A0f;
                        AnonymousClass022 r155 = this.A0Z;
                        return new C73953Zo(new C74903bl(context6, r54, r67, r77, r87, r97, r107, r118, r127, r136, this.A0I, r155), this.A0d);
                    case 19:
                        Context context7 = viewGroup.getContext();
                        AnonymousClass00S r68 = this.A0L;
                        AnonymousClass01I r78 = this.A09;
                        C02590Cr r88 = this.A0V;
                        C09610dF r98 = this.A0J;
                        AnonymousClass01A r108 = this.A0F;
                        AnonymousClass03P r119 = this.A0K;
                        C014308b r128 = this.A0G;
                        AnonymousClass01X r137 = this.A0O;
                        C48032Kq r145 = this.A0T;
                        AnonymousClass31y r156 = this.A0f;
                        AnonymousClass022 r120 = this.A0Z;
                        SearchViewModel searchViewModel5 = this.A0d;
                        C74943bp r45 = new C74943bp(context7, r68, r78, r88, r98, r108, r119, r128, r137, r145, r156, this.A0I, r120);
                        r45.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new AnonymousClass3Zm(r45, searchViewModel5);
                    case AnonymousClass0PW.A01:
                        Context context8 = viewGroup.getContext();
                        AnonymousClass00S r121 = this.A0L;
                        AnonymousClass01I r129 = this.A09;
                        C02590Cr r130 = this.A0V;
                        C09610dF r131 = this.A0J;
                        C02770Dj r157 = this.A0X;
                        AnonymousClass0HJ r138 = this.A0E;
                        AnonymousClass01A r109 = this.A0F;
                        SearchViewModel searchViewModel6 = this.A0d;
                        C74953bq r0 = new C74953bq(context8, r121, r129, r130, r131, r157, r138, r109, this.A0K, this.A0G, this.A0O, this.A0f, this.A0H, this.A0W, this.A0Z, this.A0Q, this.A0I);
                        r0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new AnonymousClass3Zn(r0, searchViewModel6);
                    case 21:
                        Context context9 = viewGroup.getContext();
                        AnonymousClass00S r139 = this.A0L;
                        AnonymousClass02M r140 = this.A08;
                        AnonymousClass01I r141 = this.A09;
                        C02590Cr r158 = this.A0V;
                        C09610dF r1310 = this.A0J;
                        AnonymousClass0HJ r1010 = this.A0E;
                        AnonymousClass01A r99 = this.A0F;
                        AnonymousClass03P r89 = this.A0K;
                        C014308b r79 = this.A0G;
                        AnonymousClass01X r69 = this.A0O;
                        AnonymousClass31y r55 = this.A0f;
                        AnonymousClass3SQ r46 = this.A0i;
                        SearchViewModel searchViewModel7 = this.A0d;
                        C74883bj r02 = new C74883bj(context9, r139, r140, r141, r158, r1310, r1010, r99, r89, r79, r69, r55, r46, this.A0H, this.A0I, this.A0Z);
                        r02.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                        return new C73913Zi(r02, searchViewModel7);
                    default:
                        throw new UnsupportedOperationException(AnonymousClass008.A0F("Invalid viewType: ", i));
                }
            }
        }
        AbstractC11890hA r31 = AbstractC11890hA.A03;
        if (i == 99) {
            r31 = AbstractC11890hA.A02;
        }
        ViewHolder viewHolder = new ViewHolder(viewGroup.getContext(), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.conversations_row, viewGroup, false), this.A0L, this.A0A, this.A09, this.A0M, this.A0P, this.A0B, this.A0Y, this.A0E, this.A0F, this.A06, this.A0R, this.A0G, this.A0O, r31, this.A05, this.A0S, this.A0f, this.A0e, this.A0H, this.A0I, this.A0D, this.A0C, this.A0d.A0K);
        this.A03.A00(viewHolder);
        return viewHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02b8, code lost:
        if (((java.lang.Number) ((android.util.Pair) r1.A01()).second).intValue() <= 0) goto L_0x02ba;
     */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r16, int r17) {
        /*
        // Method dump skipped, instructions count: 756
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3ZP.A07(X.0hD, int):void");
    }

    public boolean A09(int i) {
        if (Boolean.TRUE.equals(this.A0d.A08.A01())) {
            int i2 = i - 1;
            if (i2 < 0 || this.A0c.A00(i2) != 6 || !A0A(i)) {
                return false;
            }
            return true;
        } else if (A0A(i)) {
            return true;
        } else {
            if (i != -1 && this.A0c.A00(i) == 4) {
                return true;
            }
            return false;
        }
    }

    public boolean A0A(int i) {
        if (i == -1) {
            return false;
        }
        int A002 = this.A0c.A00(i);
        return A002 == 1 || A002 == 12;
    }
}
