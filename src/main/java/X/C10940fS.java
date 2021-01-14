package X;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0fS  reason: invalid class name and case insensitive filesystem */
public class C10940fS extends AnonymousClass0JW {
    public final AnonymousClass0XN A00;
    public final AnonymousClass09H A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final WeakReference A05;
    public final boolean A06;

    public C10940fS(ContactPickerFragment contactPickerFragment, String str, boolean z, String str2, String str3, AnonymousClass09H r7, AnonymousClass0XN r8) {
        this.A05 = new WeakReference(contactPickerFragment);
        this.A03 = str;
        this.A06 = z;
        this.A02 = str2;
        this.A04 = str3;
        this.A01 = r7;
        this.A00 = r8;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            Log.i("contactpicker/existencecheck/started");
            contactPickerFragment.A0H.APv(0, R.string.searching);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Boolean bool;
        Pair pair = (Pair) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A05.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            String str = this.A03;
            boolean z = this.A06;
            String str2 = this.A02;
            String str3 = this.A04;
            contactPickerFragment.A0K = null;
            if (pair == null) {
                AnonymousClass008.A19("handledeeplink/message-handler/disconnected/", str);
                contactPickerFragment.A0H.APq(0, R.string.directly_entered_number_sync_failed, str);
            } else {
                Object obj2 = pair.first;
                if (obj2 == null) {
                    throw null;
                } else if (obj2 == AnonymousClass0QK.UP_TO_DATE_CHANGED_NO_PHONEBOOK || obj2 == AnonymousClass0QK.UP_TO_DATE_CHANGED_PHONEBOOK) {
                    C47162Gs r7 = (C47162Gs) pair.second;
                    boolean z2 = false;
                    if (r7 != null) {
                        z2 = true;
                    }
                    AnonymousClass00E.A08(z2, "deeplink: user is null");
                    int i = r7.A03;
                    if (i == 1) {
                        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                            contactPickerFragment.A0S = null;
                            contactPickerFragment.A0T = null;
                        } else {
                            contactPickerFragment.A0S = str2;
                            contactPickerFragment.A0T = str3;
                        }
                        C007003k r3 = new C007003k(r7.A07);
                        C44271zm r9 = new C44271zm();
                        r9.A01 = Integer.valueOf(contactPickerFragment.A0o().getInt("source", 1));
                        r9.A02 = 2;
                        UserJid userJid = r7.A07;
                        if (userJid != null) {
                            bool = Boolean.valueOf(contactPickerFragment.A1C.A0S(userJid));
                        } else {
                            bool = null;
                        }
                        r9.A00 = bool;
                        r9.A03 = C002001d.A1L(contactPickerFragment.A1W.A02.A0C(r7.A07));
                        contactPickerFragment.A1b.A0B(r9, null, false);
                        if (contactPickerFragment.A18.A0D(AbstractC000400g.A0s)) {
                            contactPickerFragment.A1l.ANF(new RunnableEBaseShape2S0200000_I0_1(contactPickerFragment, r7, 6));
                        }
                        if (z || contactPickerFragment.A1G(r7.A07)) {
                            contactPickerFragment.A16(r3);
                        } else {
                            Intent intent = new Intent(contactPickerFragment.A00(), Conversation.class);
                            intent.putExtra("jid", r7.A07.getRawString());
                            intent.putExtra("skip_preview", false);
                            intent.putExtra("number_from_url", true);
                            intent.putExtra("text_from_url", false);
                            intent.addFlags(335544320);
                            contactPickerFragment.A0H.A00.A0I(intent, true);
                        }
                    } else if (i == 2) {
                        StringBuilder A0S = AnonymousClass008.A0S("handledeeplink/existencesync/user/not-wa/");
                        A0S.append(r7.A07);
                        Log.e(A0S.toString());
                        UserJid userJid2 = r7.A07;
                        if (userJid2 != null) {
                            contactPickerFragment.A0H.APq(0, R.string.directly_entered_number_not_whatsappable, AnonymousClass0JE.A0C("", userJid2.user));
                        } else {
                            throw null;
                        }
                    } else if (i == 3) {
                        AnonymousClass008.A1T(AnonymousClass008.A0S("handledeeplink/existencesync/user/invalid/"), (String) r7.A0A.get(0));
                        contactPickerFragment.A0H.APq(0, R.string.directly_entered_number_invalid, r7.A0A.get(0));
                    }
                } else if (obj2 == AnonymousClass0QK.NETWORK_UNAVAILABLE) {
                    AnonymousClass008.A19("handledeeplink/existencesync/network-unavailable/", str);
                    contactPickerFragment.A0H.APq(0, R.string.directly_entered_number_not_checked, str);
                } else if (obj2 == AnonymousClass0QK.FAILED) {
                    AnonymousClass008.A19("handledeeplink/existencesync/failed/try-again-later/", str);
                    contactPickerFragment.A0H.APq(0, R.string.directly_entered_number_sync_failed, str);
                } else if (obj2 == AnonymousClass0QK.UP_TO_DATE_UNCHANGED) {
                    AnonymousClass008.A19("handledeeplink/existencesync/exisitng request ongoing/", str);
                } else if (obj2 == AnonymousClass0QK.EXCEPTION) {
                    AnonymousClass008.A19("handledeeplink/existencesync/exception-occurred/", str);
                }
            }
            contactPickerFragment.A0H.AMi();
        }
    }
}
