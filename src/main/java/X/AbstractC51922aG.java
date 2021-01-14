package X;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2aG  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC51922aG implements AbstractC06100Rs {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public MenuItem A0E;
    public final ActivityC004802g A0F;
    public final C02780Dk A0G;
    public final AnonymousClass02M A0H;
    public final AnonymousClass01I A0I;
    public final AnonymousClass0Z6 A0J;
    public final C09020cA A0K = new C09020cA();
    public final C000300f A0L;
    public final C04360Kb A0M;
    public final AnonymousClass0DH A0N;
    public final AnonymousClass01A A0O;
    public final C014308b A0P;
    public final AnonymousClass03P A0Q;
    public final AnonymousClass01X A0R;
    public final AnonymousClass01T A0S;
    public final AnonymousClass0CG A0T;
    public final AnonymousClass00Y A0U;
    public final AnonymousClass0EO A0V;
    public final C04420Kh A0W;
    public final AnonymousClass0CH A0X;
    public final AnonymousClass022 A0Y;
    public final AbstractC658531u A0Z;
    public final AnonymousClass31y A0a;
    public final AnonymousClass320 A0b;
    public final AnonymousClass322 A0c;
    public final AnonymousClass325 A0d;
    public final AnonymousClass00T A0e;

    public AbstractC51922aG(ActivityC004802g r2, AnonymousClass02M r3, AnonymousClass0Z6 r4, AnonymousClass320 r5, AnonymousClass01I r6, AnonymousClass00T r7, AnonymousClass325 r8, AnonymousClass00Y r9, C000300f r10, AnonymousClass0DH r11, C04360Kb r12, AbstractC658531u r13, C02780Dk r14, AnonymousClass01A r15, AnonymousClass03P r16, C014308b r17, AnonymousClass01X r18, AnonymousClass0EO r19, AnonymousClass31y r20, AnonymousClass322 r21, AnonymousClass0CG r22, AnonymousClass0CH r23, C04420Kh r24, AnonymousClass01T r25, AnonymousClass022 r26) {
        this.A0F = r2;
        this.A0H = r3;
        this.A0J = r4;
        this.A0b = r5;
        this.A0I = r6;
        this.A0e = r7;
        this.A0d = r8;
        this.A0U = r9;
        this.A0L = r10;
        this.A0N = r11;
        this.A0M = r12;
        this.A0Z = r13;
        this.A0G = r14;
        this.A0O = r15;
        this.A0Q = r16;
        this.A0P = r17;
        this.A0R = r18;
        this.A0V = r19;
        this.A0a = r20;
        this.A0c = r21;
        this.A0T = r22;
        this.A0X = r23;
        this.A0W = r24;
        this.A0S = r25;
        this.A0Y = r26;
    }

    public static void A00(Collection collection, Context context, AnonymousClass02M r13, AnonymousClass0Z6 r14, AnonymousClass01I r15, AnonymousClass01A r16, AnonymousClass01X r17, AnonymousClass03P r18, C014308b r19, AnonymousClass022 r20) {
        String A0D2;
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC007503q r2 = (AbstractC007503q) it.next();
            byte b = r2.A0m;
            if (b == 0 || b == 32 || b == 46) {
                A0D2 = r2.A0D();
            } else if (r2 instanceof AnonymousClass0M3) {
                A0D2 = ((AnonymousClass0M3) r2).A0v();
            } else if (r2 instanceof AnonymousClass28G) {
                A0D2 = ((AnonymousClass28G) r2).A0z();
            } else {
                A0D2 = null;
                if (r2 instanceof AnonymousClass0ZN) {
                    AnonymousClass0ZN r9 = (AnonymousClass0ZN) r2;
                    A0D2 = "";
                    if (!TextUtils.isEmpty(r9.A0v())) {
                        StringBuilder A0S2 = AnonymousClass008.A0S(A0D2);
                        A0S2.append(r9.A0v());
                        A0D2 = A0S2.toString();
                    }
                    if (!TextUtils.isEmpty(r9.A0u())) {
                        if (A0D2.length() > 0) {
                            A0D2 = AnonymousClass008.A0K(A0D2, "\n");
                        }
                        StringBuilder A0S3 = AnonymousClass008.A0S(A0D2);
                        A0S3.append(r9.A0u());
                        A0D2 = A0S3.toString();
                    }
                }
            }
            if (!TextUtils.isEmpty(A0D2)) {
                StringBuilder sb3 = new StringBuilder();
                if (sb.length() != 0) {
                    sb3.append('\n');
                }
                if (collection.size() > 1) {
                    sb3.append('[');
                    sb3.append(DateUtils.formatDateTime(context, r2.A0E, 655377));
                    sb3.append("] ");
                    if (r2.A0n.A02) {
                        sb3.append(r15.A02());
                    } else {
                        sb3.append(r19.A08(r16.A0A(r2.A08()), false));
                    }
                    sb3.append(": ");
                }
                sb.append((CharSequence) sb3);
                sb2.append((CharSequence) sb3);
                sb2.append(A0D2);
                List list = r2.A0c;
                if (list != null) {
                    sb.append(r14.A01(context, A0D2, list));
                    hashSet.addAll(r2.A0c);
                } else {
                    sb.append(A0D2);
                }
            }
        }
        String obj = sb.toString();
        SharedPreferences.Editor edit = r20.A01(AnonymousClass020.A02).edit();
        if (!hashSet.isEmpty()) {
            edit.putString("copied_message", obj);
            edit.putString("copied_message_without_mentions", sb2.toString());
            edit.putString("copied_message_jids", C006803i.A0M(hashSet));
        } else {
            edit.remove("copied_message");
            edit.remove("copied_message_without_mentions");
            edit.remove("copied_message_jids");
        }
        edit.apply();
        try {
            r18.A05().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                r13.A06(R.string.message_copied, 0);
                return;
            }
            r13.A0C(r17.A0A(R.plurals.messages_copied, (long) collection.size(), Integer.valueOf(collection.size())), 0);
        } catch (NullPointerException e) {
            Log.e("conversation/copymessage/npe", e);
            r13.A06(R.string.view_contact_unsupport, 0);
        }
    }

    public AbstractC007503q A01() {
        Map A022 = A02();
        if (A022 != null) {
            return (AbstractC007503q) ((Map.Entry) A022.entrySet().iterator().next()).getValue();
        }
        throw null;
    }

    public Map A02() {
        if (this instanceof C74243aQ) {
            return ((C74243aQ) this).A00.A09;
        }
        if (this instanceof C74083a4) {
            return ((C74083a4) this).A00.A0s;
        }
        if (this instanceof C59582nx) {
            return ((C59582nx) this).A00.A08;
        }
        if (this instanceof C59302nQ) {
            return ((AnonymousClass2DW) ((C59302nQ) this).A00).A03;
        }
        if (!(this instanceof C59282nO)) {
            return ((AnonymousClass2DW) ((AnonymousClass27J) this).A00).A03;
        }
        return ((AnonymousClass2DW) ((C59282nO) this).A00).A03;
    }

    public void A03() {
        if (this instanceof C74243aQ) {
            AbstractC06110Rt r0 = ((C74243aQ) this).A00.A06;
            if (r0 != null) {
                r0.A00();
            }
        } else if (this instanceof C74083a4) {
            AbstractC06110Rt r02 = ((C74083a4) this).A00.A01;
            if (r02 != null) {
                r02.A00();
            }
        } else if (this instanceof C59582nx) {
            AbstractC06110Rt r03 = ((C59582nx) this).A00.A07;
            if (r03 != null) {
                r03.A00();
            }
        } else if (this instanceof C59302nQ) {
            AbstractC06110Rt r04 = ((AnonymousClass2DW) ((C59302nQ) this).A00).A00;
            if (r04 != null) {
                r04.A00();
            }
        } else if (!(this instanceof C59282nO)) {
            AbstractC06110Rt r05 = ((AnonymousClass2DW) ((AnonymousClass27J) this).A00).A00;
            if (r05 != null) {
                r05.A00();
            }
        } else {
            AbstractC06110Rt r06 = ((AnonymousClass2DW) ((C59282nO) this).A00).A00;
            if (r06 != null) {
                r06.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0104, code lost:
        if (r9 != false) goto L_0x0106;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    @Override // X.AbstractC06100Rs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ACa(X.AbstractC06110Rt r20, android.view.MenuItem r21) {
        /*
        // Method dump skipped, instructions count: 1162
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51922aG.ACa(X.0Rt, android.view.MenuItem):boolean");
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r6, Menu menu) {
        AnonymousClass01X r3 = this.A0R;
        this.A0A = menu.add(0, R.id.menuitem_reply, 0, r3.A06(R.string.notification_quick_reply)).setIcon(R.drawable.ic_action_reply);
        this.A00 = menu.add(0, R.id.menuitem_star, 0, r3.A06(R.string.add_star)).setIcon(R.drawable.ic_action_star);
        this.A09 = menu.add(0, R.id.menuitem_unstar, 0, r3.A06(R.string.remove_star)).setIcon(R.drawable.ic_action_unstar);
        this.A06 = menu.add(0, R.id.menuitem_details, 0, r3.A06(R.string.info)).setIcon(R.drawable.ic_action_info);
        this.A05 = menu.add(0, R.id.menuitem_delete, 0, r3.A06(R.string.delete)).setIcon(R.drawable.ic_action_delete);
        this.A04 = menu.add(0, R.id.menuitem_copy, 0, r3.A06(R.string.copy)).setIcon(R.drawable.ic_action_copy);
        this.A0C = menu.add(0, R.id.menuitem_share, 0, r3.A06(R.string.share)).setIcon(R.drawable.ic_action_share);
        this.A03 = menu.add(0, R.id.menuitem_cancel_upload, 0, r3.A06(R.string.cancel)).setIcon(R.drawable.ic_action_cancel);
        this.A02 = menu.add(0, R.id.menuitem_cancel_download, 0, r3.A06(R.string.cancel)).setIcon(R.drawable.ic_action_cancel);
        this.A07 = menu.add(0, R.id.menuitem_forward, 0, r3.A06(R.string.conversation_menu_forward)).setIcon(R.drawable.ic_action_forward);
        this.A0B = menu.add(0, R.id.menuitem_reply_privately, 0, r3.A06(R.string.reply_privately));
        this.A01 = menu.add(0, R.id.menuitem_add_to_contacts, 0, r3.A06(R.string.add_contact));
        this.A08 = menu.add(0, R.id.menuitem_message_contact, 0, r3.A06(R.string.message_contact_name));
        this.A0D = menu.add(0, R.id.menuitem_share_third_party, 0, r3.A06(R.string.menuitem_status_share));
        this.A0E = menu.add(0, R.id.menuitem_share_cross, 0, r3.A06(R.string.menuitem_status_share_with_fb));
        C09020cA r1 = this.A0K;
        r1.A00(R.id.menuitem_reply_privately);
        r1.A00(R.id.menuitem_add_to_contacts);
        r1.A00(R.id.menuitem_message_contact);
        r1.A00(R.id.menuitem_share_third_party);
        r1.A00(R.id.menuitem_share_cross);
        Set set = r1.A01;
        set.add(Integer.valueOf((int) R.id.menuitem_forward));
        set.add(Integer.valueOf((int) R.id.menuitem_delete));
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d3, code lost:
        if (r1.A02 != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fe, code lost:
        if (X.C12080hW.A00(r4.A08, 4) < 0) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
        if (r9 != false) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x019b, code lost:
        if (r9 != false) goto L_0x019d;
     */
    @Override // X.AbstractC06100Rs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AIh(X.AbstractC06110Rt r12, android.view.Menu r13) {
        /*
        // Method dump skipped, instructions count: 929
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC51922aG.AIh(X.0Rt, android.view.Menu):boolean");
    }
}
