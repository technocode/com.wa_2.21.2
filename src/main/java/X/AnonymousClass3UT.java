package X;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;
import com.whatsapp.voipcalling.VoipCallControlRingingDotsIndicator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3UT  reason: invalid class name */
public class AnonymousClass3UT extends AbstractC16300pa {
    public UserJid A00;
    public final AbstractC16320pc A01 = new AnonymousClass3US(this);
    public final List A02 = new ArrayList();
    public final /* synthetic */ VoipCallControlBottomSheet A03;

    public AnonymousClass3UT(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A03 = voipCallControlBottomSheet;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A02.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new AnonymousClass3UQ(this.A03.A05().inflate(R.layout.voip_call_control_sheet_add_participant_button_row, viewGroup, false));
        }
        if (i == 2) {
            return new AnonymousClass3UQ(this.A03.A05().inflate(R.layout.voip_call_control_sheet_call_full_info_button_row, viewGroup, false));
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        AnonymousClass00E.A08(z, "Unknown list item type");
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A03;
        return new AnonymousClass3UP(voipCallControlBottomSheet, voipCallControlBottomSheet.A05().inflate(R.layout.voip_call_control_sheet_participant_row, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r18, int i) {
        Object obj = this.A02.get(i);
        if (obj != null) {
            C676139i r2 = (C676139i) obj;
            int i2 = r2.A00;
            if (i2 == 0) {
                View view = r18.A0H;
                view.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 28));
                view.setClickable(true);
                View A0D = AnonymousClass0Q7.A0D(view, R.id.add_participant_icon);
                Dialog dialog = ((DialogFragment) this.A03).A03;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                if (!(dialog == null || dialog.getContext() == null)) {
                    TypedValue typedValue = new TypedValue();
                    dialog.getContext().getTheme().resolveAttribute(R.attr.voipAddParticipantButtonColor, typedValue, true);
                    shapeDrawable.getPaint().setColor(typedValue.data);
                }
                A0D.setBackground(shapeDrawable);
            } else if (i2 != 2) {
                boolean z = false;
                if (i2 == 1) {
                    z = true;
                }
                AnonymousClass00E.A08(z, "Unknown list item type");
                AnonymousClass0QY r10 = r2.A01;
                if (r10 != null) {
                    boolean z2 = r2.A02;
                    AnonymousClass00E.A06(r18 instanceof AnonymousClass3UP);
                    VoipCallControlBottomSheet voipCallControlBottomSheet = this.A03;
                    C007003k A0A = voipCallControlBottomSheet.A0M.A0A(r10.A06);
                    AnonymousClass3UP r4 = (AnonymousClass3UP) r18;
                    r4.A06.setVisibility(8);
                    r4.A04.setVisibility(8);
                    r4.A07.setVisibility(8);
                    AnimatorSet animatorSet = r4.A00;
                    if (animatorSet != null) {
                        animatorSet.removeAllListeners();
                        r4.A00.cancel();
                        r4.A00 = null;
                    }
                    if (r10.A0D) {
                        r4.A05.A00();
                        voipCallControlBottomSheet.A0C.A02(A0A, r4.A03);
                        r4.A03.setOnClickListener(null);
                        AnonymousClass0Q7.A0W(r4.A03, 2);
                        return;
                    }
                    r4.A05.A03(A0A, null);
                    voipCallControlBottomSheet.A0C.A02(A0A, r4.A03);
                    int i3 = r10.A01;
                    if (i3 == 1) {
                        r4.A02.setAlpha(1.0f);
                        r4.A03.setAlpha(1.0f);
                        if (!z2) {
                            ImageView imageView = r4.A04;
                            AnimationSet animationSet = new AnimationSet(true);
                            AlphaAnimation A022 = AnonymousClass008.A02(0.0f, 1.0f, 500);
                            A022.setStartOffset(500);
                            ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f);
                            scaleAnimation.setDuration(500);
                            scaleAnimation.setStartOffset(500);
                            animationSet.addAnimation(scaleAnimation);
                            animationSet.addAnimation(A022);
                            imageView.startAnimation(animationSet);
                            r4.A04.setVisibility(0);
                        }
                    } else if (i3 == 11) {
                        r4.A03.setAlpha(0.3f);
                        r4.A02.setAlpha(0.3f);
                        if (z2) {
                            r4.A06.setVisibility(0);
                            r4.A06.setOnClickListener(new ViewOnClickCListenerShape4S0200000_I1(this, r10, 44));
                            r4.A06.setAlpha(0.0f);
                            r4.A06.animate().setDuration(500).alpha(1.0f).setStartDelay(1500).start();
                        }
                    } else {
                        r4.A07.setVisibility(0);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator = r4.A07;
                        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1100);
                        ofInt.setDuration((long) 1100);
                        ofInt.setInterpolator(new LinearInterpolator());
                        ofInt.addUpdateListener(new AnonymousClass38Y(voipCallControlRingingDotsIndicator));
                        arrayList.add(ofInt);
                        arrayList.add(VoipCallControlBottomSheet.A00(r4.A02, 0.2f, 0.5f));
                        arrayList.add(VoipCallControlBottomSheet.A00(r4.A03, 0.25f, 0.75f));
                        animatorSet2.playTogether(arrayList);
                        animatorSet2.addListener(new AnonymousClass39h(voipCallControlBottomSheet, animatorSet2));
                        r4.A00 = animatorSet2;
                        animatorSet2.start();
                    }
                } else {
                    throw null;
                }
            } else {
                VoipCallControlBottomSheet voipCallControlBottomSheet2 = this.A03;
                if (voipCallControlBottomSheet2 != null) {
                    View view2 = r18.A0H;
                    view2.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(voipCallControlBottomSheet2, 27));
                    view2.setClickable(true);
                    return;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }

    public void A08(UserJid userJid) {
        UserJid userJid2;
        this.A00 = userJid;
        int i = 0;
        while (true) {
            List list = this.A02;
            if (i < list.size()) {
                AnonymousClass0QY r0 = ((C676139i) list.get(i)).A01;
                if (!(r0 == null || (userJid2 = this.A00) == null || r0.A06 != userJid2)) {
                    VoipCallControlBottomSheet.A01(this.A03, i);
                }
                i++;
            } else {
                return;
            }
        }
    }
}
