package X;

import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.0d1  reason: invalid class name and case insensitive filesystem */
public class C09480d1 {
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass0DH A02;
    public final AnonymousClass01A A03;
    public final AbstractC47722Jh A04;
    public final AnonymousClass00S A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass0DG A07;
    public final AnonymousClass01T A08;
    public final AnonymousClass0CG A09;
    public final C04490Ko A0A;
    public final AnonymousClass0EO A0B;
    public final C02360Br A0C;
    public final AnonymousClass0BB A0D;
    public final AnonymousClass00T A0E;

    public C09480d1(AnonymousClass00S r1, AnonymousClass02M r2, AnonymousClass00T r3, AnonymousClass0DG r4, C000300f r5, AnonymousClass0DH r6, AnonymousClass01A r7, C02360Br r8, AnonymousClass01X r9, AnonymousClass0EO r10, AnonymousClass0BB r11, C04490Ko r12, AnonymousClass0CG r13, AnonymousClass01T r14, AbstractC47722Jh r15) {
        this.A05 = r1;
        this.A00 = r2;
        this.A0E = r3;
        this.A07 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
        this.A0C = r8;
        this.A06 = r9;
        this.A0B = r10;
        this.A0D = r11;
        this.A0A = r12;
        this.A09 = r13;
        this.A08 = r14;
        this.A04 = r15;
    }

    public static void A00(C09480d1 r10, AnonymousClass0LW r11, AnonymousClass02N r12, boolean z) {
        C007003k A0A2 = r10.A03.A0A(r12);
        if (r11 == null) {
            return;
        }
        if (A0A2.A09()) {
            StringBuilder sb = new StringBuilder("conversations/delete/group:");
            sb.append(A0A2);
            Log.i(sb.toString());
            if (r10.A0B.A0l) {
                r10.A00.A06(R.string.group_updating, 0);
                return;
            }
            if (!AnonymousClass1VY.A0d(r12)) {
                AnonymousClass01T r4 = r10.A08;
                AnonymousClass02U A022 = AnonymousClass02U.A02(r12);
                if (A022 == null) {
                    throw null;
                } else if (r4.A01(A022).A0A(r4.A01)) {
                    r10.A0E.ANC(new C10710f4(r11, new ConversationsFragment.ExitGroupDialogFragment(), r10.A0A, A0A2, z), new Object[0]);
                    return;
                }
            }
            ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
            ConversationsFragment.A04(A0A2, deleteGroupDialogFragment);
            Bundle bundle = ((AnonymousClass037) deleteGroupDialogFragment).A06;
            if (bundle != null) {
                bundle.putBoolean("chatContainsStarredMessages", z);
                deleteGroupDialogFragment.A0u(r11, null);
                return;
            }
            throw null;
        } else if (AnonymousClass1VY.A0T(A0A2.A09)) {
            ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = new ConversationsFragment.DeleteBroadcastListDialogFragment();
            ConversationsFragment.A04(A0A2, deleteBroadcastListDialogFragment);
            Bundle bundle2 = ((AnonymousClass037) deleteBroadcastListDialogFragment).A06;
            if (bundle2 != null) {
                bundle2.putBoolean("chatContainsStarredMessages", z);
                deleteBroadcastListDialogFragment.A0u(r11, null);
                return;
            }
            throw null;
        } else {
            r10.A0E.ANC(new C10710f4(r11, new ConversationsFragment.DeleteContactDialogFragment(), r10.A0A, A0A2, z), new Object[0]);
        }
    }

    public Long A01(AnonymousClass02N r15) {
        AnonymousClass0DH r4 = this.A02;
        Set A062 = r4.A06(r15, false);
        Long A0C2 = this.A0D.A0C(r15, false, 0);
        if (A0C2 != null) {
            r4.A0J(A062);
            this.A0C.A0C(new AnonymousClass1XZ(r15, 12, 0, 0, 0, null), 0);
            return A0C2;
        }
        r4.A0I(A062);
        return A0C2;
    }

    public void A02(AnonymousClass02N r13, long j) {
        if (!AnonymousClass1VY.A0d(r13)) {
            AnonymousClass0DH r2 = this.A02;
            Set A062 = r2.A06(r13, true);
            if (this.A0D.A0B(r13, j) != null) {
                r2.A0J(A062);
                this.A0C.A0C(new AnonymousClass1XZ(r13, 11, 0, 0, j, null), 0);
                return;
            }
            r2.A0I(A062);
        }
    }
}
