package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.conversation.conversationrow.ConversationRowAudioPreview;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2pG  reason: invalid class name and case insensitive filesystem */
public class C60332pG extends AbstractC59162nB {
    public final View.OnClickListener A00 = new ViewOnClickEBaseShape5S0100000_I1_3(this, 15);
    public final View A01 = findViewById(R.id.conversation_row_root);
    public final TextView A02 = ((TextView) AnonymousClass0Q7.A0D(this, R.id.description));
    public final ConversationRowAudioPreview A03 = ((ConversationRowAudioPreview) findViewById(R.id.conversation_row_audio_preview));
    public final AudioPlayerView A04 = ((AudioPlayerView) AnonymousClass0Q7.A0D(this, R.id.conversation_row_audio_player_view));

    public C60332pG(Context context, AnonymousClass0MP r6) {
        super(context, r6);
        C51582Zh r3 = new C51582Zh(this);
        AnonymousClass2ZZ r2 = new AnonymousClass2ZZ(this);
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlaybackListener(new AnonymousClass311(audioPlayerView, r2, r3));
        AudioPlayerView audioPlayerView2 = this.A04;
        View.OnLongClickListener onLongClickListener = ((AbstractC51572Zg) this).A0M;
        audioPlayerView2.setSeekbarLongClickListener(onLongClickListener);
        this.A04.setOnControlButtonLongClickListener(onLongClickListener);
        A0n();
    }

    @Override // X.AnonymousClass2I2
    public boolean A0C() {
        if ((this instanceof C60782qD) || (this instanceof C60742q3)) {
            return false;
        }
        return AnonymousClass0FI.A0N(this.A0a, super.getFMessage());
    }

    @Override // X.AnonymousClass2I2
    public boolean A0D() {
        if (!(this instanceof C60742q3)) {
            return AnonymousClass0FI.A0j(super.getFMessage());
        }
        return AnonymousClass0FI.A0j((AnonymousClass0MP) super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0e(false);
        A0n();
    }

    @Override // X.AbstractC51572Zg
    public void A0O() {
        A0j(this.A04.A01, super.getFMessage());
    }

    @Override // X.AbstractC51572Zg
    public void A0P() {
        AnonymousClass03S r1 = ((AbstractC59162nB) this).A02;
        if (r1 == null || RequestPermissionActivity.A0N(getContext(), r1)) {
            AnonymousClass0MP r2 = (AnonymousClass0MP) super.getFMessage();
            StringBuilder A0S = AnonymousClass008.A0S("conversationrowvoicenote/viewmessage ");
            A0S.append(r2.A0n);
            Log.i(A0S.toString());
            Context context = getContext();
            AnonymousClass2ZJ r4 = new AnonymousClass2ZJ(this);
            C04370Kc r5 = ((AnonymousClass2I2) this).A0X;
            if (r5 == null) {
                throw null;
            } else if (C28051Sr.A1v(r2, context, r4, r5, ((AbstractC51572Zg) this).A0V, this.A1E)) {
                C28301Tu A0b = C28051Sr.A0b(r2, C02780Dk.A00(getContext()));
                A0b.A0N(r2);
                A0b.A0F = new AnonymousClass2ZI(this);
                A0b.A0D();
                A0K();
            }
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0Y(AnonymousClass02N r6) {
        ImageView imageView;
        if (!(this instanceof C60742q3)) {
            AnonymousClass0M3 fMessage = super.getFMessage();
            if (fMessage.A0n.A02) {
                AnonymousClass01I r0 = ((AbstractC51572Zg) this).A0X;
                r0.A04();
                Object obj = r0.A03;
                if (obj == null) {
                    throw null;
                } else if (r6.equals(obj)) {
                    A0Q();
                }
            } else if (r6.equals(fMessage.A08())) {
                A0Q();
            }
        } else {
            C60742q3 r4 = (C60742q3) this;
            AnonymousClass0MP r2 = (AnonymousClass0MP) super.getFMessage();
            if (r2 != null) {
                C007303n r1 = r2.A0n;
                if (!r1.A02) {
                    AnonymousClass02N r3 = r1.A00;
                    boolean A0Y = AnonymousClass1VY.A0Y(r3);
                    if (A0Y) {
                        r3 = r2.A0G;
                    }
                    if (r6.equals(r3)) {
                        if (A0Y) {
                            imageView = r4.A01;
                        } else {
                            imageView = r4.A02;
                        }
                        r4.A03.A02(r4.A0e.A0A(r3), imageView);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0n();
        } else if (AnonymousClass0FI.A0r(getFMessage())) {
            A0o();
        }
    }

    public final void A0n() {
        File file;
        AnonymousClass0MP r2 = (AnonymousClass0MP) super.getFMessage();
        AnonymousClass0M4 r5 = ((AnonymousClass0M3) r2).A02;
        if (r5 != null) {
            AnonymousClass00S r4 = this.A0l;
            AnonymousClass01A r1 = this.A0e;
            C014308b r0 = this.A0f;
            AnonymousClass01X r3 = this.A0n;
            this.A01.setContentDescription(C28051Sr.A0z(r2, r4, r1, r0, r3));
            TextView textView = this.A02;
            textView.setVisibility(0);
            if (((AnonymousClass0M3) r2).A00 == 0) {
                ((AnonymousClass0M3) r2).A00 = C02230Bd.A08(r5.A0F);
            }
            if (AnonymousClass0FI.A0q(getFMessage())) {
                ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
                if (conversationRowAudioPreview != null) {
                    conversationRowAudioPreview.A00();
                }
                textView.setText(C002001d.A1Y(r3, ((AnonymousClass0M3) r2).A01));
                AudioPlayerView audioPlayerView = this.A04;
                audioPlayerView.setPlayButtonState(4);
                audioPlayerView.setOnControlButtonClickListener(((AbstractC59162nB) this).A06);
                audioPlayerView.setSeekbarProgress(0);
                setDuration(C002001d.A1Y(r3, ((AnonymousClass0M3) r2).A01));
            } else if (AnonymousClass0FI.A0r(getFMessage())) {
                if (C003701u.A0E(((AnonymousClass0M3) r2).A08) && (file = r5.A0F) != null) {
                    ((AnonymousClass0M3) r2).A08 = file.getName();
                }
                if (C003701u.A0E(((AnonymousClass0M3) r2).A08)) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(((AnonymousClass0M3) r2).A08);
                }
                AudioPlayerView audioPlayerView2 = this.A04;
                audioPlayerView2.setSeekbarColor(C004302a.A00(getContext(), R.color.music_scrubber));
                A0o();
                audioPlayerView2.setOnControlButtonClickListener(this.A00);
            } else {
                ConversationRowAudioPreview conversationRowAudioPreview2 = this.A03;
                if (conversationRowAudioPreview2 != null) {
                    conversationRowAudioPreview2.A00();
                }
                textView.setText(C002001d.A1Y(r3, ((AnonymousClass0M3) r2).A01));
                if (!r2.A0n.A02 || r5.A0F == null) {
                    AudioPlayerView audioPlayerView3 = this.A04;
                    audioPlayerView3.setPlayButtonState(3);
                    audioPlayerView3.setOnControlButtonClickListener(((AbstractC59162nB) this).A07);
                } else {
                    AudioPlayerView audioPlayerView4 = this.A04;
                    audioPlayerView4.setPlayButtonState(2);
                    audioPlayerView4.setOnControlButtonClickListener(((AbstractC59162nB) this).A08);
                }
                int i = ((AnonymousClass0M3) r2).A00;
                if (i != 0) {
                    setDuration(C002001d.A1W(r3, (long) i));
                } else {
                    setDuration(C002001d.A1Y(r3, ((AnonymousClass0M3) r2).A01));
                }
            }
            A0O();
            A0l(r2);
            return;
        }
        throw null;
    }

    public final void A0o() {
        AnonymousClass0MP r1 = (AnonymousClass0MP) super.getFMessage();
        if (!C28301Tu.A08(r1)) {
            A0p(r1);
            return;
        }
        C28301Tu r8 = C28301Tu.A0i;
        if (r8 != null) {
            if (!r8.A0P()) {
                A0p(r1);
            } else {
                AudioPlayerView audioPlayerView = this.A04;
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarProgress(r8.A09());
                audioPlayerView.setSeekbarMax(r8.A02);
                audioPlayerView.setSeekbarProgress(r8.A09());
                setDuration(C002001d.A1W(this.A0n, (long) (r8.A09() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
                ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
                if (conversationRowAudioPreview != null) {
                    conversationRowAudioPreview.A01();
                }
            }
            AudioPlayerView audioPlayerView2 = this.A04;
            audioPlayerView2.setSeekbarContentDescription((long) r8.A09());
            r8.A0F = new AnonymousClass2ZI(this);
            r8.A0E = new C59042mx(this, audioPlayerView2, new AnonymousClass2ZP(this), new C51522Zb(this), this.A03, r8);
        }
    }

    public final void A0p(AnonymousClass0MP r4) {
        int intValue;
        Number number = (Number) C28301Tu.A0j.get(r4.A0n);
        if (number == null) {
            intValue = 0;
        } else {
            intValue = number.intValue();
        }
        AudioPlayerView audioPlayerView = this.A04;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass0M3) r4).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        audioPlayerView.setSeekbarProgress(intValue);
        audioPlayerView.setSeekbarContentDescription((long) intValue);
        setDuration(C002001d.A1W(this.A0n, (long) ((AnonymousClass0M3) r4).A00));
        ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.A00();
        }
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_audio_left;
    }

    @Override // X.AbstractC59162nB
    public ViewGroup getExternalAdContentHolder() {
        return (ViewGroup) findViewById(R.id.web_page_preview_holder);
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB, X.AbstractC59162nB
    public AnonymousClass0MP getFMessage() {
        return (AnonymousClass0MP) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_audio_left;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_audio_right;
    }

    public void setDuration(String str) {
        ConversationRowAudioPreview conversationRowAudioPreview = this.A03;
        if (conversationRowAudioPreview != null) {
            conversationRowAudioPreview.setDuration(str);
        }
    }

    @Override // X.AnonymousClass2I2, X.AbstractC59162nB
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof AnonymousClass0MP);
        super.setFMessage(r2);
    }
}
