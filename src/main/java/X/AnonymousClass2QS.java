package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2QS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2QS implements DialogInterface.OnClickListener {
    public final /* synthetic */ GroupSettingsActivity.AdminSettingsDialogFragment A00;

    public /* synthetic */ AnonymousClass2QS(GroupSettingsActivity.AdminSettingsDialogFragment adminSettingsDialogFragment) {
        this.A00 = adminSettingsDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        GroupSettingsActivity.AdminSettingsDialogFragment adminSettingsDialogFragment = this.A00;
        if (adminSettingsDialogFragment.A06.A05()) {
            boolean z = adminSettingsDialogFragment.A02[0];
            if (!(adminSettingsDialogFragment instanceof GroupSettingsActivity.SendMessagesDialogFragment)) {
                if (!(adminSettingsDialogFragment instanceof GroupSettingsActivity.RestrictFrequentlyForwardedDialogFragment)) {
                    if (adminSettingsDialogFragment.A00.A0Z != z) {
                        AnonymousClass0AR r3 = adminSettingsDialogFragment.A0B;
                        AnonymousClass02U r8 = adminSettingsDialogFragment.A01;
                        r3.A0I(r8, z, new AnonymousClass21U(adminSettingsDialogFragment.A0C, adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A08, r8, null, null, 159, null));
                    } else {
                        Log.i("EditGroupInfoDialogFragment/onPositiveButtonClick: skip request, values are equal");
                    }
                } else if (adminSettingsDialogFragment.A00.A0Y != z) {
                    AnonymousClass0AR r32 = adminSettingsDialogFragment.A0B;
                    AnonymousClass02U r82 = adminSettingsDialogFragment.A01;
                    r32.A0H(r82, z, new AnonymousClass21U(adminSettingsDialogFragment.A0C, adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A08, r82, null, null, 213, null));
                } else {
                    Log.i("RestrictFrequentlyForwardedDialogFragment/onPositiveButtonClick: skip request, values are equal");
                }
            } else if (!z && adminSettingsDialogFragment.A09.A01(adminSettingsDialogFragment.A01).A01.size() > adminSettingsDialogFragment.A04.A06(AbstractC000400g.A3i) - 1) {
                AnonymousClass0EO.A02(3013, null);
            } else if (adminSettingsDialogFragment.A00.A0Q != z) {
                AnonymousClass0AR r33 = adminSettingsDialogFragment.A0B;
                AnonymousClass02U r83 = adminSettingsDialogFragment.A01;
                r33.A0G(r83, z, new AnonymousClass21U(adminSettingsDialogFragment.A0C, adminSettingsDialogFragment.A0A, adminSettingsDialogFragment.A08, r83, null, null, 161, null));
            } else {
                Log.i("SendMessagesDialogFragment/onPositiveButtonClick: skip request, values are equal");
            }
        } else {
            adminSettingsDialogFragment.A03.A06(R.string.coldsync_no_network, 0);
        }
        adminSettingsDialogFragment.A0w(false, false);
    }
}
