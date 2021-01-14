package com.facebook.redex;

import X.AbstractC26941Ng;
import X.AnonymousClass00E;
import X.AnonymousClass0AY;
import X.AnonymousClass0PW;
import X.AnonymousClass1Nh;
import X.AnonymousClass1OV;
import X.AnonymousClass1Y0;
import X.AnonymousClass232;
import X.AnonymousClass3SB;
import X.C27071Nv;
import X.C27131Oe;
import X.C28301Tu;
import X.C40781tp;
import X.C40991uH;
import X.C51902aE;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import com.whatsapp.SettingsHelp;
import com.whatsapp.SettingsNetworkUsage;
import com.whatsapp.SettingsNotifications;
import com.whatsapp.SettingsPrivacy;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.StatusesFragment;
import com.whatsapp.SystemStatusActivity;
import com.whatsapp.TextStatusComposerActivity;
import com.whatsapp.WaInAppBrowsingActivity;
import com.whatsapp.WebImagePicker;
import com.whatsapp.account.delete.DeleteAccountActivity;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.account.delete.DeleteAccountFeedback;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.io.IOException;
import java.util.Iterator;

public class ViewOnClickEBaseShape3S0100000_I1_1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape3S0100000_I1_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ((SettingsHelp) this.A00).lambda$onCreate$1383$SettingsHelp(view);
                return;
            case 1:
                ((SettingsHelp) this.A00).lambda$onCreate$1384$SettingsHelp(view);
                return;
            case 2:
                ((SettingsHelp) this.A00).lambda$onCreate$1382$SettingsHelp(view);
                return;
            case 3:
                ((SettingsNetworkUsage) this.A00).lambda$onCreate$1396$SettingsNetworkUsage(view);
                return;
            case 4:
                ((SettingsNotifications) this.A00).lambda$initScreen$1399$SettingsNotifications(view);
                return;
            case 5:
                ((SettingsNotifications) this.A00).lambda$initScreen$1404$SettingsNotifications(view);
                return;
            case 6:
                ((SettingsNotifications) this.A00).lambda$initScreen$1410$SettingsNotifications(view);
                return;
            case 7:
                ((SettingsNotifications) this.A00).lambda$initScreen$1411$SettingsNotifications(view);
                return;
            case 8:
                ((SettingsNotifications) this.A00).lambda$initScreen$1405$SettingsNotifications(view);
                return;
            case 9:
                ((SettingsNotifications) this.A00).lambda$initScreen$1400$SettingsNotifications(view);
                return;
            case 10:
                ((SettingsNotifications) this.A00).lambda$initScreen$1406$SettingsNotifications(view);
                return;
            case 11:
                ((SettingsNotifications) this.A00).lambda$initScreen$1408$SettingsNotifications(view);
                return;
            case 12:
                ((SettingsNotifications) this.A00).lambda$initScreen$1409$SettingsNotifications(view);
                return;
            case 13:
                ((SettingsNotifications) this.A00).lambda$initScreen$1412$SettingsNotifications(view);
                return;
            case 14:
                ((SettingsNotifications) this.A00).lambda$initScreen$1401$SettingsNotifications(view);
                return;
            case 15:
                ((SettingsNotifications) this.A00).lambda$initScreen$1407$SettingsNotifications(view);
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                ((SettingsNotifications) this.A00).lambda$initScreen$1402$SettingsNotifications(view);
                return;
            case 17:
                ((SettingsNotifications) this.A00).lambda$initScreen$1403$SettingsNotifications(view);
                return;
            case 18:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1422$SettingsPrivacy(view);
                return;
            case 19:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1423$SettingsPrivacy(view);
                return;
            case AnonymousClass0PW.A01:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1428$SettingsPrivacy(view);
                return;
            case 21:
                ((SettingsPrivacy) this.A00).lambda$updateAppSecurityPreference$1429$SettingsPrivacy(view);
                return;
            case 22:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1425$SettingsPrivacy(view);
                return;
            case 23:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1426$SettingsPrivacy(view);
                return;
            case 24:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1424$SettingsPrivacy(view);
                return;
            case 25:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1420$SettingsPrivacy(view);
                return;
            case 26:
                ((SettingsPrivacy) this.A00).lambda$onCreate$1421$SettingsPrivacy(view);
                return;
            case 27:
                CompoundButton compoundButton = (CompoundButton) this.A00;
                compoundButton.setChecked(!compoundButton.isChecked());
                return;
            case 28:
                ((ShareInviteLinkActivity) this.A00).lambda$onCreate$1437$ShareInviteLinkActivity(view);
                return;
            case 29:
                ((ShareInviteLinkActivity) this.A00).lambda$onCreate$1438$ShareInviteLinkActivity(view);
                return;
            case 30:
                AnonymousClass1Nh r2 = (AnonymousClass1Nh) this.A00;
                int[] iArr = r2.A03[((Number) view.getTag()).intValue()];
                AbstractC26941Ng r0 = r2.A01;
                if (r0 != null) {
                    r0.AKD(iArr);
                }
                r2.dismiss();
                return;
            case 31:
                ((C40781tp) this.A00).A02.A0x(true);
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((C40781tp) this.A00).A02.A0x(false);
                return;
            case 33:
                StatusesFragment statusesFragment = ((C27071Nv) this.A00).A0A;
                statusesFragment.A0h(new Intent(statusesFragment.A00(), MyStatusesActivity.class));
                return;
            case 34:
                ((SystemStatusActivity) this.A00).lambda$onCreate$1469$SystemStatusActivity(view);
                return;
            case 35:
                ((Activity) this.A00).finish();
                return;
            case 36:
                ((TextStatusComposerActivity) this.A00).A0V();
                return;
            case 37:
                ((TextStatusComposerActivity) this.A00).lambda$onCreate$1472$TextStatusComposerActivity(view);
                return;
            case 38:
                ((TextStatusComposerActivity) this.A00).lambda$onCreate$1474$TextStatusComposerActivity(view);
                return;
            case 39:
                C27131Oe r3 = (C27131Oe) this.A00;
                if (r3.A0a.A08()) {
                    r3.A03();
                } else {
                    try {
                        r3.A1A.A01();
                        if (r3.A0a.A01() == r3.A0a.A02()) {
                            r3.A0a.A07(0);
                        }
                        if (r3.A0a.A01() == 0) {
                            r3.A0a.A06();
                        } else {
                            AnonymousClass1Y0 r1 = r3.A0a;
                            if (!(r1 instanceof AnonymousClass3SB)) {
                                ((AnonymousClass232) r1).A00.start();
                            } else {
                                ((AnonymousClass3SB) r1).A00.resume();
                            }
                        }
                        r3.A0n.post(r3.A1G);
                        C40991uH r12 = r3.A0w;
                        if (r12 != null) {
                            Log.i("voicenote/voicenotepreviewplay");
                            AnonymousClass00E.A01();
                            Iterator it = r12.A00.iterator();
                            while (true) {
                                AnonymousClass0AY r13 = (AnonymousClass0AY) it;
                                if (r13.hasNext()) {
                                    AnonymousClass1OV r14 = (AnonymousClass1OV) r13.next();
                                    if (r14 instanceof C51902aE) {
                                        C28301Tu r15 = ((C51902aE) r14).A00;
                                        if (r15.A0P()) {
                                            r15.A0A();
                                        }
                                    }
                                }
                            }
                        } else {
                            throw null;
                        }
                    } catch (IOException e) {
                        Log.e("voicenoterecordingui/showvoicenotepreview/ error playing voice note preview ", e);
                    }
                }
                r3.A09();
                return;
            case 40:
                ((C27131Oe) this.A00).A0H(true);
                return;
            case 41:
                ((WaInAppBrowsingActivity) this.A00).onBackPressed();
                return;
            case 42:
                ((WebImagePicker) this.A00).A0W();
                return;
            case 43:
                ((WebImagePicker) this.A00).lambda$onCreate$1505$WebImagePicker(view);
                return;
            case 44:
                ((DeleteAccountActivity) this.A00).lambda$onCreate$1511$DeleteAccountActivity(view);
                return;
            case 45:
                ((DeleteAccountConfirmation) this.A00).lambda$onCreate$1512$DeleteAccountConfirmation(view);
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                ((DeleteAccountFeedback) this.A00).lambda$onCreate$1518$DeleteAccountFeedback(view);
                return;
            case 47:
                ((DeleteAccountFeedback) this.A00).lambda$onCreate$1517$DeleteAccountFeedback(view);
                return;
            case 48:
                ((AppAuthSettingsActivity) this.A00).lambda$onCreate$1527$AppAuthSettingsActivity(view);
                return;
            case 49:
                ((AppAuthSettingsActivity) this.A00).lambda$onCreate$1528$AppAuthSettingsActivity(view);
                return;
            default:
                return;
        }
    }
}
