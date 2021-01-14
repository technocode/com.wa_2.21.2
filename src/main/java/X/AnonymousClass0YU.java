package X;

import android.hardware.Camera;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.whatsapp.BaseSharedPreviewDialogFragment;
import com.whatsapp.Conversation;
import com.whatsapp.CountryPicker;
import com.whatsapp.HomeActivity;
import com.whatsapp.MentionableEntry;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import com.whatsapp.videoplayback.ExoPlaybackControlView;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.MaximizedParticipantVideoDialogFragment;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.util.Iterator;

/* renamed from: X.0YU  reason: invalid class name */
public abstract class AnonymousClass0YU implements Animation.AnimationListener {
    public void onAnimationEnd(Animation animation) {
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment;
        MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment2;
        if (this instanceof AnonymousClass3UY) {
            AnonymousClass3UY r3 = (AnonymousClass3UY) this;
            AnimationSet animationSet = r3.A01;
            animationSet.setStartOffset(1500);
            r3.A00.startAnimation(animationSet);
        } else if (this instanceof AnonymousClass3UX) {
            AnonymousClass3UX r0 = (AnonymousClass3UX) this;
            r0.A01.setVisibility(r0.A00);
        } else if (this instanceof AnonymousClass3UK) {
            AnonymousClass3UK r2 = (AnonymousClass3UK) this;
            VoipActivityV2 voipActivityV2 = r2.A04;
            int i = 0;
            voipActivityV2.A1E = false;
            voipActivityV2.A12.clearAnimation();
            voipActivityV2.A0J.clearAnimation();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) voipActivityV2.A12.getLayoutParams();
            if (!voipActivityV2.A1O) {
                i = -r2.A00;
            }
            layoutParams.bottomMargin = i;
            voipActivityV2.A12.setLayoutParams(layoutParams);
            voipActivityV2.A1J(r2.A03);
            StringBuilder sb = new StringBuilder("voip/VoipActivityV2/animateCallControlsVideoCall onAnimationEnd showButtons: ");
            sb.append(voipActivityV2.A1O);
            sb.append(" footer top: ");
            sb.append(voipActivityV2.A12.getTop());
            Log.i(sb.toString());
            if (!voipActivityV2.A1O && r2.A01 >= r2.A02 && (maximizedParticipantVideoDialogFragment = voipActivityV2.A0r) != null && !maximizedParticipantVideoDialogFragment.A0U()) {
                maximizedParticipantVideoDialogFragment.A0u(voipActivityV2.A04(), "maximized_video");
            }
        } else if (this instanceof AnonymousClass3UJ) {
            AnonymousClass3UJ r32 = (AnonymousClass3UJ) this;
            VoipActivityV2 voipActivityV22 = r32.A02;
            voipActivityV22.hideView(r32.A01);
            voipActivityV22.A0b.setVisibility(0);
            voipActivityV22.showView(r32.A00);
        } else if (this instanceof AnonymousClass3UI) {
            AnonymousClass3UI r33 = (AnonymousClass3UI) this;
            VoipActivityV2 voipActivityV23 = r33.A02;
            voipActivityV23.hideView(r33.A01);
            voipActivityV23.A0b.setVisibility(0);
            voipActivityV23.showView(r33.A00);
        } else if (this instanceof AnonymousClass3UA) {
            Log.i("voip/VoipActivityV2/shrinkPreviewToPip/onAnimationEnd");
            VoipActivityV2 voipActivityV24 = ((AnonymousClass3UA) this).A01;
            voipActivityV24.A1N = false;
            voipActivityV24.A0a.clearAnimation();
            voipActivityV24.A0a.setVisibility(8);
        } else if (this instanceof AnonymousClass3U8) {
            AnonymousClass3U8 r6 = (AnonymousClass3U8) this;
            VoipActivityV2 voipActivityV25 = r6.A02;
            voipActivityV25.A0S.clearAnimation();
            View view = voipActivityV25.A0S;
            int i2 = 8;
            if (voipActivityV25.A1O) {
                i2 = 0;
            }
            view.setVisibility(i2);
            if (!voipActivityV25.A1O && r6.A00 < r6.A01 && (maximizedParticipantVideoDialogFragment2 = voipActivityV25.A0r) != null && !maximizedParticipantVideoDialogFragment2.A0U()) {
                maximizedParticipantVideoDialogFragment2.A0u(voipActivityV25.A04(), "maximized_video");
            }
        } else if (this instanceof C72373Sp) {
            ExoPlaybackControlView exoPlaybackControlView = ((C72373Sp) this).A00;
            exoPlaybackControlView.setAlpha(1.0f);
            exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0L);
            exoPlaybackControlView.removeCallbacks(exoPlaybackControlView.A0K);
            exoPlaybackControlView.A00 = null;
        } else if (this instanceof AnonymousClass3PZ) {
            AnonymousClass3PZ r22 = (AnonymousClass3PZ) this;
            r22.A01.A00 = null;
            r22.A00.setVisibility(8);
        } else if (this instanceof C71093No) {
            ((C71093No) this).A00.run();
        } else if (this instanceof C70783Mj) {
            RegisterPhone registerPhone = ((C70783Mj) this).A00;
            if (!registerPhone.A0G) {
                registerPhone.A06.setVisibility(8);
            }
        } else if (this instanceof AnonymousClass3IJ) {
            ((AnonymousClass3IJ) this).A00.setVisibility(8);
        } else if (this instanceof C56222iH) {
            AbstractC49792Sd r23 = ((C56222iH) this).A00;
            r23.A0G(r23.A0J.getHeight());
            r23.A0T(true, null);
        } else if (this instanceof C56212iG) {
            AbstractC49792Sd r4 = ((C56212iG) this).A00;
            r4.A0J(r4.A02(), r4.A00(), null, false);
        } else if (this instanceof C56192iE) {
            AbstractC49792Sd r24 = ((C56192iE) this).A00;
            r24.A0J.setVisibility(8);
            r24.A0G(0);
        } else if (this instanceof C56182iD) {
            AnonymousClass2SS r25 = ((C56182iD) this).A00;
            r25.A01.setVisibility(8);
            r25.A02.A00(0.0f);
        } else if (this instanceof C56172iC) {
            C56172iC r34 = (C56172iC) this;
            AnonymousClass2SS r26 = r34.A01;
            r26.A02.A00((float) r26.A01.getHeight());
            r34.A00.onAnimationEnd(animation);
        } else if (this instanceof C55992ht) {
            ((C55992ht) this).A00.A0T.setVisibility(8);
        } else if (this instanceof C55422gW) {
            C55422gW r02 = (C55422gW) this;
            C08840bo r35 = r02.A01;
            r35.A06.setImageBitmap(r02.A00);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(100);
            r35.A06.startAnimation(alphaAnimation);
        } else if (this instanceof C55122g2) {
            C55122g2 r27 = (C55122g2) this;
            r27.A00.A0B.setVisibility(8);
            Runnable runnable = r27.A01;
            if (runnable != null) {
                runnable.run();
            }
        } else if (this instanceof C55112g1) {
            ((C55112g1) this).A00.A03.setVisibility(8);
        } else if (this instanceof C55092fz) {
            IdentityVerificationActivity identityVerificationActivity = ((C55092fz) this).A00.A00;
            Camera camera = identityVerificationActivity.A0B.A04;
            if (camera != null) {
                camera.setOneShotPreviewCallback(identityVerificationActivity.A0E);
            }
        } else if (this instanceof C54992fp) {
            ((C54992fp) this).A00.A0H.A0t();
        } else if (this instanceof C54972fn) {
            ((C54972fn) this).A00.setIconified(false);
        } else if (this instanceof C51742Zx) {
            C51742Zx r36 = (C51742Zx) this;
            View view2 = r36.A00;
            view2.getLayoutParams().width = -2;
            view2.requestLayout();
            view2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass2II(r36));
            view2.clearAnimation();
        } else if (this instanceof C51542Zd) {
            ((C51542Zd) this).A00.A08.setVisibility(4);
        } else if (this instanceof AnonymousClass2ZG) {
            AnonymousClass2ZG r37 = (AnonymousClass2ZG) this;
            TextView textView = r37.A00;
            ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
            layoutParams2.width = -2;
            textView.setLayoutParams(layoutParams2);
            textView.setText(r37.A02);
            textView.clearAnimation();
            ((AnonymousClass2ZC) r37.A01.A01).A0F = true;
        } else if (this instanceof AnonymousClass2ZF) {
            View view3 = ((AnonymousClass2ZF) this).A00;
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            layoutParams3.width = -2;
            view3.setLayoutParams(layoutParams3);
            view3.setVisibility(8);
        } else if (this instanceof AnonymousClass2Z4) {
            AnonymousClass2Z4 r03 = (AnonymousClass2Z4) this;
            r03.A01.A06(r03.A00);
        } else if (this instanceof C51332Yh) {
            SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = ((C51332Yh) this).A00;
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A07.setVisibility(8);
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A02.setVisibility(8);
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A01.setVisibility(8);
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment).A07 = null;
            sharedTextPreviewDialogFragment.A0x();
            sharedTextPreviewDialogFragment.A0y();
            sharedTextPreviewDialogFragment.A0B = false;
        } else if (this instanceof C51322Yg) {
            SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment2 = ((C51322Yg) this).A00;
            sharedTextPreviewDialogFragment2.A0x();
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment2).A02.getHeight(), 0.0f);
            translateAnimation.setDuration(150);
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment2).A02.setVisibility(0);
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment2).A01.setVisibility(0);
            int selectionStart = sharedTextPreviewDialogFragment2.A02.getSelectionStart();
            int selectionEnd = sharedTextPreviewDialogFragment2.A02.getSelectionEnd();
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment2.A02;
            mentionableEntry.setText(mentionableEntry.getStringText());
            sharedTextPreviewDialogFragment2.A02.setSelection(selectionStart, selectionEnd);
            sharedTextPreviewDialogFragment2.A0C = false;
            ((BaseSharedPreviewDialogFragment) sharedTextPreviewDialogFragment2).A07.startAnimation(translateAnimation);
        } else if (this instanceof AnonymousClass2YI) {
            ((AnonymousClass2YI) this).A00.A08.setVisibility(8);
        } else if (this instanceof AnonymousClass2WZ) {
            AnonymousClass0YW r1 = ((AnonymousClass2WZ) this).A00;
            r1.A0P(r1.A0N.AB5());
        } else if (this instanceof C41081uQ) {
            C41081uQ r42 = (C41081uQ) this;
            r42.A01.setVisibility(8);
            if (r42.A04.A0P()) {
                r42.A02.setVisibility(8);
                return;
            }
            AnimationSet animationSet2 = new AnimationSet(true);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, -0.3f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation2.setDuration(160);
            RotateAnimation rotateAnimation = new RotateAnimation(-60.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(160);
            rotateAnimation.setFillAfter(true);
            animationSet2.addAnimation(rotateAnimation);
            animationSet2.addAnimation(translateAnimation2);
            r42.A03.startAnimation(animationSet2);
            View view4 = r42.A02;
            view4.postDelayed(new RunnableEBaseShape2S0300000_I1(r42, view4, r42.A00, 15), 500);
        } else if (this instanceof C41071uP) {
            C41071uP r12 = (C41071uP) this;
            C27131Oe r28 = r12.A01.A04;
            if (!r28.A0P()) {
                r12.A00.setVisibility(0);
                C40991uH r13 = r28.A0w;
                if (r13 != null) {
                    Log.e("voicenote/voicenotecancelled");
                    AnonymousClass00E.A01();
                    Iterator it = r13.A00.iterator();
                    while (true) {
                        AnonymousClass0AY r14 = (AnonymousClass0AY) it;
                        if (r14.hasNext()) {
                            AnonymousClass1OV r15 = (AnonymousClass1OV) r14.next();
                            if (r15 instanceof C39801s8) {
                                Conversation conversation = ((C39801s8) r15).A00;
                                if (conversation.A0f != null) {
                                    conversation.A0E.setVisibility(8);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            }
        } else if (this instanceof C41041uM) {
            C27131Oe r29 = ((C41041uM) this).A00;
            r29.A0I.setEnabled(true);
            r29.A0I.setVisibility(8);
            r29.A0I.setAlpha(1.0f);
            r29.A0I.clearAnimation();
        } else if (this instanceof C41031uL) {
            C41031uL r16 = (C41031uL) this;
            r16.A00.clearAnimation();
            C27131Oe r38 = r16.A01;
            r38.A0E.setFocusable(true);
            r38.A0E.setFocusableInTouchMode(true);
            C40991uH r17 = r38.A0w;
            if (r17 != null) {
                Log.i("voicenote/voicenotepreviewcancelled");
                AnonymousClass00E.A01();
                Iterator it2 = r17.A00.iterator();
                while (true) {
                    AnonymousClass0AY r18 = (AnonymousClass0AY) it2;
                    if (r18.hasNext()) {
                        AnonymousClass1OV r19 = (AnonymousClass1OV) r18.next();
                        if (r19 instanceof C39801s8) {
                            Conversation conversation2 = ((C39801s8) r19).A00;
                            if (conversation2.A0f != null) {
                                conversation2.A0E.setVisibility(8);
                            }
                        }
                    } else {
                        r38.A0E.requestFocus();
                        return;
                    }
                }
            } else {
                throw null;
            }
        } else if (this instanceof C41021uK) {
            View view5 = ((C41021uK) this).A00;
            view5.setEnabled(true);
            view5.clearAnimation();
        } else if (this instanceof C41011uJ) {
            View view6 = ((C41011uJ) this).A00;
            view6.setVisibility(8);
            view6.setEnabled(true);
            view6.clearAnimation();
        } else if (this instanceof C40571tU) {
            ((C40571tU) this).A00.setVisibility(4);
        } else if (this instanceof C40551tS) {
            AnonymousClass0YP r39 = ((C40551tS) this).A00;
            SearchView searchView = r39.A01;
            if (1 != 0) {
                searchView.A05();
            } else {
                searchView.A0G(false);
                SearchView.SearchAutoComplete searchAutoComplete = searchView.A0k;
                searchAutoComplete.requestFocus();
                searchAutoComplete.setImeVisibility(true);
                View.OnClickListener onClickListener = searchView.A07;
                if (onClickListener != null) {
                    onClickListener.onClick(searchView);
                }
            }
            r39.A03.setVisibility(4);
        } else if (this instanceof C40541tR) {
            ((C40541tR) this).A00.A01.setIconified(false);
        } else if (this instanceof AnonymousClass0YY) {
            HomeActivity homeActivity = ((AnonymousClass0YY) this).A00;
            SearchView searchView2 = homeActivity.A0H;
            if (1 != 0) {
                searchView2.A05();
            } else {
                searchView2.A0G(false);
                SearchView.SearchAutoComplete searchAutoComplete2 = searchView2.A0k;
                searchAutoComplete2.requestFocus();
                searchAutoComplete2.setImeVisibility(true);
                View.OnClickListener onClickListener2 = searchView2.A07;
                if (onClickListener2 != null) {
                    onClickListener2.onClick(searchView2);
                }
            }
            homeActivity.A0D.setVisibility(4);
        } else if (this instanceof AnonymousClass0YT) {
            ((AnonymousClass0YT) this).A00.A0H.setIconified(false);
        } else if (this instanceof C39891sH) {
            CountryPicker countryPicker = ((C39891sH) this).A00;
            SearchView searchView3 = countryPicker.A01;
            if (1 != 0) {
                searchView3.A05();
            } else {
                searchView3.A0G(false);
                SearchView.SearchAutoComplete searchAutoComplete3 = searchView3.A0k;
                searchAutoComplete3.requestFocus();
                searchAutoComplete3.setImeVisibility(true);
                View.OnClickListener onClickListener3 = searchView3.A07;
                if (onClickListener3 != null) {
                    onClickListener3.onClick(searchView3);
                }
            }
            countryPicker.A00.setVisibility(8);
            countryPicker.A02.setVisibility(0);
        } else if (this instanceof C39881sG) {
            ((C39881sG) this).A00.A01.setIconified(false);
        } else if (this instanceof C39721rz) {
            C39721rz r310 = (C39721rz) this;
            ImageView imageView = r310.A00.A01;
            imageView.post(new RunnableEBaseShape6S0200000_I1_1(r310, imageView, 4));
        } else if (this instanceof C39641rr) {
            C39641rr r311 = (C39641rr) this;
            Log.i("conversation/hideinputextension/end");
            r311.A02.setVisibility(8);
            Conversation conversation3 = r311.A03;
            conversation3.A0F.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass1L5(r311));
            conversation3.A0j.setClipChildren(true);
            conversation3.A0Y.setTranscriptMode(r311.A00);
        } else if (this instanceof C39631rq) {
            Log.i("conversation/showinputextension/end");
            AnonymousClass1L3 r312 = ((C39631rq) this).A00;
            Conversation conversation4 = r312.A03;
            conversation4.A0j.setClipChildren(true);
            conversation4.A08 = 0;
            conversation4.A0Y.setTranscriptMode(r312.A00);
        } else if (this instanceof C39571rk) {
            ((C39571rk) this).A00.setVisibility(8);
        }
    }

    public void onAnimationRepeat(Animation animation) {
        if (this instanceof AnonymousClass3UK) {
            AnonymousClass008.A1a(AnonymousClass008.A0S("voip/VoipActivityV2/animateCallControlsVideoCall onAnimationRepeat showButtons: "), ((AnonymousClass3UK) this).A04.A1O);
        } else if (this instanceof C51712Zu) {
            animation.setStartOffset(300);
        }
    }

    public void onAnimationStart(Animation animation) {
        if (this instanceof AnonymousClass3UK) {
            StringBuilder A0S = AnonymousClass008.A0S("voip/VoipActivityV2/animateCallControlsVideoCall onAnimationStart showButtons: ");
            VoipActivityV2 voipActivityV2 = ((AnonymousClass3UK) this).A04;
            A0S.append(voipActivityV2.A1O);
            A0S.append(" footer top: ");
            A0S.append(voipActivityV2.A12.getTop());
            Log.i(A0S.toString());
        } else if (this instanceof AnonymousClass3UJ) {
            AnonymousClass3UJ r3 = (AnonymousClass3UJ) this;
            VoipActivityV2 voipActivityV22 = r3.A02;
            voipActivityV22.A0b.setVisibility(4);
            voipActivityV22.hideView(r3.A00);
        } else if (this instanceof AnonymousClass3UI) {
            AnonymousClass3UI r32 = (AnonymousClass3UI) this;
            VoipActivityV2 voipActivityV23 = r32.A02;
            voipActivityV23.A0b.setVisibility(4);
            voipActivityV23.hideView(r32.A00);
        } else if (this instanceof AnonymousClass3UA) {
            AnonymousClass3UA r1 = (AnonymousClass3UA) this;
            Log.i("voip/VoipActivityV2/shrinkPreviewToPip/onAnimationStart");
            r1.A00.setLayoutMode(1);
            VoipActivityV2 voipActivityV24 = r1.A01;
            CallInfo A0W = voipActivityV24.A0W();
            if (A0W != null) {
                voipActivityV24.A1N = false;
                voipActivityV24.A1I(A0W);
                voipActivityV24.A1N = true;
            }
        } else if (this instanceof C56222iH) {
            AbstractC49792Sd r12 = ((C56222iH) this).A00;
            r12.A0F(r12.A0J.getHeight());
            r12.A0Q(true);
        } else if (this instanceof C56212iG) {
            AbstractC49792Sd r4 = ((C56212iG) this).A00;
            r4.A0K(r4.A06, r4.A0A.getHeight(), true, Float.valueOf(-0.5f));
        } else if (this instanceof C56172iC) {
            ((C56172iC) this).A00.onAnimationStart(animation);
        } else if (this instanceof AnonymousClass2Z3) {
            View view = ((AnonymousClass2Z3) this).A00.A00;
            if (view != null) {
                view.setVisibility(0);
                return;
            }
            throw null;
        } else if (this instanceof C41041uM) {
            ((C41041uM) this).A00.A0I.setEnabled(false);
        } else if (this instanceof C41031uL) {
            ((C41031uL) this).A00.setVisibility(0);
        } else if (this instanceof C41021uK) {
            View view2 = ((C41021uK) this).A00;
            view2.setVisibility(0);
            view2.setEnabled(false);
        } else if (this instanceof C41011uJ) {
            ((C41011uJ) this).A00.setEnabled(false);
        } else if (this instanceof C40561tT) {
            ((C40561tT) this).A00.setVisibility(0);
        }
    }
}
