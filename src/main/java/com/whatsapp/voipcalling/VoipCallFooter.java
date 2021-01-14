package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;

public class VoipCallFooter extends LinearLayout {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageButton A05;
    public ImageButton A06;
    public ImageButton A07;
    public ImageButton A08;
    public ImageButton A09;
    public ImageButton A0A;
    public ImageButton A0B;
    public final C000300f A0C = C000300f.A00();
    public final AnonymousClass01X A0D = AnonymousClass01X.A00();

    public VoipCallFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(C002001d.A3M(this.A0C) ? R.layout.voip_call_control_sheet_footer : R.layout.voip_call_footer, (ViewGroup) this, true);
        this.A0A = (ImageButton) findViewById(R.id.speaker_btn);
        this.A05 = (ImageButton) findViewById(R.id.bluetooth_btn);
        this.A00 = findViewById(R.id.bluetooth_btn_layout);
        this.A0B = (ImageButton) findViewById(R.id.toggle_video_btn);
        this.A04 = findViewById(R.id.toggle_video_btn_layout);
        this.A06 = (ImageButton) findViewById(R.id.chat_btn);
        this.A01 = findViewById(R.id.chat_btn_layout);
        this.A09 = (ImageButton) findViewById(R.id.mute_btn);
        this.A08 = (ImageButton) AnonymousClass0Q7.A0D(this, R.id.info_btn);
        this.A03 = AnonymousClass0Q7.A0D(this, R.id.info_btn_layout);
        this.A07 = (ImageButton) AnonymousClass0Q7.A0D(this, R.id.footer_end_call_btn);
        this.A02 = AnonymousClass0Q7.A0D(this, R.id.end_call_btn_layout);
    }

    public void A00() {
        if (!C002001d.A3M(this.A0C)) {
            setBackgroundColor(getResources().getColor(R.color.primary_voip));
            this.A0A.setImageResource(R.drawable.ic_speaker);
            ImageButton imageButton = this.A0A;
            AnonymousClass01X r2 = this.A0D;
            imageButton.setContentDescription(r2.A06(R.string.voip_call_speakerphone_toggle_description));
            this.A05.setImageResource(R.drawable.ic_bluetooth);
            this.A0B.setImageResource(R.drawable.ic_toggle_video);
            this.A0B.setContentDescription(r2.A06(R.string.voip_call_turn_on_video_btn_description));
            this.A06.setImageResource(R.drawable.ic_chat);
            this.A09.setImageResource(R.drawable.voicecall_mute_footer);
            this.A08.setAlpha(0.7f);
            return;
        }
        this.A0A.setImageResource(R.drawable.ic_voip_speaker_control);
        ImageButton imageButton2 = this.A0A;
        AnonymousClass01X r22 = this.A0D;
        imageButton2.setContentDescription(r22.A06(R.string.voip_call_speakerphone_toggle_description));
        this.A0B.setImageResource(R.drawable.ic_voip_video_control);
        this.A0B.setContentDescription(r22.A06(R.string.voip_call_turn_on_video_btn_description));
    }

    public void A01() {
        if (!C002001d.A3M(this.A0C)) {
            setBackground(C004302a.A03(getContext(), R.drawable.video_call_footer_background));
            this.A0A.setImageResource(R.drawable.videocall_flipcam_v2);
            ImageButton imageButton = this.A0A;
            AnonymousClass01X r2 = this.A0D;
            imageButton.setContentDescription(r2.A06(R.string.voip_call_flip_camera_description));
            this.A05.setImageResource(R.drawable.ic_videocall_bluetooth_normal);
            this.A0B.setImageResource(R.drawable.ic_toggle_video_v2);
            this.A0B.setContentDescription(r2.A06(R.string.voip_call_turn_off_video_btn_description));
            this.A06.setImageResource(R.drawable.videocall_message_v2);
            this.A09.setImageResource(R.drawable.videocall_mute);
            return;
        }
        this.A0A.setImageResource(R.drawable.ic_voip_switch_camera_control);
        ImageButton imageButton2 = this.A0A;
        AnonymousClass01X r22 = this.A0D;
        imageButton2.setContentDescription(r22.A06(R.string.voip_call_flip_camera_description));
        this.A0B.setImageResource(R.drawable.ic_voip_switch_to_voice_control);
        this.A0B.setContentDescription(r22.A06(R.string.voip_call_turn_off_video_btn_description));
    }

    public void A02(int i) {
        float f = (float) i;
        this.A05.setRotation(f);
        this.A0A.setRotation(f);
        this.A06.setRotation(f);
        this.A09.setRotation(f);
        this.A0B.setRotation(f);
        this.A08.setRotation(f);
        this.A07.setRotation(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (com.whatsapp.voipcalling.Voip.getCameraCount() <= 1) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(com.whatsapp.voipcalling.CallInfo r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 212
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipCallFooter.A03(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    public void setCallInfoButtonVisibility(CallInfo callInfo) {
        if (callInfo.isGroupCall) {
            C000300f r1 = this.A0C;
            if (r1.A0D(AbstractC000400g.A1I) && !C002001d.A3M(r1)) {
                this.A03.setVisibility(0);
                return;
            }
        }
        this.A03.setVisibility(8);
    }
}
