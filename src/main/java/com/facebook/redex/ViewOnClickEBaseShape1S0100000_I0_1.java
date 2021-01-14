package com.facebook.redex;

import X.AnonymousClass0PW;
import android.view.View;
import com.whatsapp.inappsupport.ui.ContactUsActivity;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.registration.RegisterName;
import com.whatsapp.registration.VerifySms;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.search.SearchViewModel;
import com.whatsapp.search.views.TokenizedSearchInput;
import com.whatsapp.voipcalling.CallsFragment;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import com.whatsapp.voipcalling.VoipActivityV2;

public class ViewOnClickEBaseShape1S0100000_I0_1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public ViewOnClickEBaseShape1S0100000_I0_1(TokenizedSearchInput tokenizedSearchInput, int i) {
        this.A01 = i;
        switch (i) {
            case 15:
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
            case 17:
            case 18:
                this.A00 = tokenizedSearchInput;
                return;
            default:
                this.A00 = tokenizedSearchInput;
                return;
        }
    }

    public ViewOnClickEBaseShape1S0100000_I0_1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        switch (this.A01) {
            case 0:
                ((ContactUsActivity) this.A00).lambda$onCreate$1380$ContactUsActivity(view);
                return;
            case 1:
                ((ContactUsActivity) this.A00).A0T(1);
                return;
            case 2:
                ((ContactUsActivity) this.A00).onBackPressed();
                return;
            case 3:
                ((PopupNotification) this.A00).lambda$onCreate$2312$PopupNotification(view);
                return;
            case 4:
                ((PopupNotification) this.A00).lambda$onCreate$2313$PopupNotification(view);
                return;
            case 5:
                ((PopupNotification) this.A00).lambda$onCreate$2314$PopupNotification(view);
                return;
            case 6:
                ((PopupNotification) this.A00).A0V();
                return;
            case 7:
                ((PopupNotification) this.A00).lambda$onCreate$2316$PopupNotification(view);
                return;
            case 8:
                ((PopupNotification) this.A00).lambda$onCreate$2315$PopupNotification(view);
                return;
            case 9:
                ((RegisterName) this.A00).lambda$onCreate$1238$RegisterName(view);
                return;
            case 10:
                ((RegisterName) this.A00).lambda$onCreate$1234$RegisterName(view);
                return;
            case 11:
                ((VerifySms) this.A00).lambda$onCreate$2430$VerifySms(view);
                return;
            case 12:
                ((VerifySms) this.A00).lambda$onCreate$2429$VerifySms(view);
                return;
            case 13:
                ((VerifySms) this.A00).A1D(true);
                return;
            case 14:
                ((SearchFragment) this.A00).A0B.A0K(true);
                return;
            case 15:
                SearchViewModel searchViewModel = ((TokenizedSearchInput) this.A00).A0C;
                if (searchViewModel != null) {
                    searchViewModel.A0d.A02("user_grid_view_choice", Boolean.valueOf(!searchViewModel.A0N()));
                    return;
                }
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 1);
                return;
            case 17:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 2);
                return;
            case 18:
                TokenizedSearchInput.setFocus((TokenizedSearchInput) this.A00, 0);
                return;
            case 19:
                SearchViewModel searchViewModel2 = ((TokenizedSearchInput) this.A00).A0C;
                searchViewModel2.A0A();
                searchViewModel2.A0L(true);
                return;
            case AnonymousClass0PW.A01:
                View view2 = (View) this.A00;
                if (view2.isSelected()) {
                    view2.setSelected(false);
                }
                view2.setSelected(true);
                return;
            case 21:
                ((Runnable) this.A00).run();
                return;
            case 22:
                CallsFragment callsFragment = (CallsFragment) this.A00;
                callsFragment.A0H.A02(callsFragment.A0A(), 1);
                return;
            case 23:
                ((GroupCallParticipantPicker) this.A00).lambda$createRoomView$2711$GroupCallParticipantPicker(view);
                return;
            case 24:
                ((GroupCallParticipantPickerSheet) this.A00).A0m();
                return;
            case 25:
                ((VoipActivityV2) this.A00).lambda$onCreate$2782$VoipActivityV2(view);
                return;
            case 26:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2788$VoipActivityV2(view);
                return;
            case 27:
                ((VoipActivityV2) this.A00).lambda$onCreate$2771$VoipActivityV2(view);
                return;
            case 28:
                ((VoipActivityV2) this.A00).A0m();
                return;
            case 29:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2794$VoipActivityV2(view);
                return;
            case 30:
                ((VoipActivityV2) this.A00).A0l();
                return;
            case 31:
            default:
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                ((VoipActivityV2) this.A00).lambda$onCreate$2776$VoipActivityV2(view);
                return;
            case 33:
                ((VoipActivityV2) this.A00).A0s();
                return;
            case 34:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2791$VoipActivityV2(view);
                return;
            case 35:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2789$VoipActivityV2(view);
                return;
            case 36:
                ((VoipActivityV2) this.A00).lambda$onCreate$2774$VoipActivityV2(view);
                return;
            case 37:
                ((VoipActivityV2) this.A00).lambda$onCreate$2770$VoipActivityV2(view);
                return;
            case 38:
                ((VoipActivityV2) this.A00).lambda$onCreate$2783$VoipActivityV2(view);
                return;
            case 39:
                ((VoipActivityV2) this.A00).lambda$showCallFailedScreen$2803$VoipActivityV2(view);
                return;
            case 40:
                ((VoipActivityV2) this.A00).lambda$setupCallFooter$2792$VoipActivityV2(view);
                return;
            case 41:
                ((VoipActivityV2) this.A00).A0l();
                return;
            case 42:
                ((VoipActivityV2) this.A00).lambda$onCreate$2775$VoipActivityV2(view);
                return;
        }
    }
}
