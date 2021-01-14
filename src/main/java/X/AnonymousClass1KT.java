package X;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0400000_I1;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.AudioPickerActivity;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.SelectionCheckView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: X.1KT  reason: invalid class name */
public class AnonymousClass1KT {
    public C39351rM A00;
    public C39361rN A01;
    public final int A02;
    public final View A03 = this.A04.findViewById(R.id.bullet_duration_size);
    public final View A04;
    public final FrameLayout A05;
    public final ImageButton A06;
    public final ImageView A07 = ((ImageView) this.A04.findViewById(R.id.audio_file_thumb));
    public final TextView A08 = ((TextView) this.A04.findViewById(R.id.audio_file_artist));
    public final TextView A09 = ((TextView) this.A04.findViewById(R.id.audio_file_duration));
    public final TextView A0A = ((TextView) this.A04.findViewById(R.id.audio_file_size));
    public final TextView A0B = ((TextView) this.A04.findViewById(R.id.audio_file_title));
    public final CircularProgressBar A0C;
    public final SelectionCheckView A0D = ((SelectionCheckView) this.A04.findViewById(R.id.selection_check));
    public final /* synthetic */ AudioPickerActivity A0E;

    public AnonymousClass1KT(AudioPickerActivity audioPickerActivity, View view, int i) {
        this.A0E = audioPickerActivity;
        this.A02 = i;
        this.A04 = view;
        this.A05 = (FrameLayout) view.findViewById(R.id.audio_file_thumb_frame);
        this.A04.findViewById(R.id.play_button_frame);
        this.A06 = (ImageButton) this.A04.findViewById(R.id.audio_file_play_btn);
        this.A0C = (CircularProgressBar) this.A04.findViewById(R.id.progress_bar);
    }

    public final void A00(long j) {
        AnonymousClass01X r5 = ((AnonymousClass2C0) this.A0E).A01;
        String A1X = C002001d.A1X(r5, j);
        this.A0C.setContentDescription(r5.A0D(R.string.voice_message_time_elapsed, A1X));
    }

    public final void A01(Context context) {
        ImageButton imageButton = this.A06;
        AudioPickerActivity audioPickerActivity = this.A0E;
        AnonymousClass01X r2 = ((AnonymousClass2C0) audioPickerActivity).A01;
        imageButton.setContentDescription(r2.A06(R.string.pause));
        imageButton.setBackgroundDrawable(null);
        imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(context, R.drawable.pause)));
        C002001d.A2m(imageButton, C004302a.A00(audioPickerActivity, R.color.audio_picker_stop_button_tint));
        this.A0C.setVisibility(0);
    }

    public final void A02(Context context, boolean z) {
        ImageButton imageButton = this.A06;
        AudioPickerActivity audioPickerActivity = this.A0E;
        AnonymousClass01X r4 = ((AnonymousClass2C0) audioPickerActivity).A01;
        imageButton.setContentDescription(r4.A06(R.string.play));
        if (z) {
            imageButton.setBackgroundDrawable(new C06470Tj(r4, C004302a.A03(context, R.drawable.audio_picker_row_start_button_background)));
            imageButton.setImageDrawable(new C06470Tj(r4, C004302a.A03(context, R.drawable.play_button_audio)));
            C002001d.A2m(imageButton, C004302a.A00(audioPickerActivity, R.color.audio_picker_default_button_tint));
            this.A0C.setVisibility(8);
            return;
        }
        imageButton.setBackgroundDrawable(null);
        imageButton.setImageDrawable(new C06470Tj(r4, C004302a.A03(context, R.drawable.toggle_play)));
        C002001d.A2m(imageButton, C004302a.A00(audioPickerActivity, R.color.audio_picker_stop_button_tint));
        this.A0C.setVisibility(0);
    }

    public final void A03(View view) {
        String A0A2;
        AudioPickerActivity audioPickerActivity = this.A0E;
        AnonymousClass1KS r1 = audioPickerActivity.A07;
        AnonymousClass1KR A002 = r1.A00((Cursor) r1.getItem(this.A02));
        if (A002 != null) {
            LinkedHashMap linkedHashMap = audioPickerActivity.A0D;
            if (linkedHashMap.size() < 30 || linkedHashMap.containsKey(Integer.valueOf(A002.A00))) {
                C000300f r9 = ((ActivityC004702f) audioPickerActivity).A0G;
                C006003a r8 = AbstractC000400g.A3a;
                if (((long) A002.A01) >= ((long) r9.A06(r8)) * SearchActionVerificationClientService.MS_TO_NS) {
                    ((ActivityC004702f) audioPickerActivity).A0F.A0C(((AnonymousClass2C0) audioPickerActivity).A01.A0D(R.string.max_file_size_to_send_error_message, Integer.valueOf(r9.A06(r8))), 0);
                    return;
                }
                int i = A002.A00;
                LinkedHashMap linkedHashMap2 = audioPickerActivity.A0D;
                Integer valueOf = Integer.valueOf(i);
                boolean containsKey = linkedHashMap2.containsKey(valueOf);
                A05(A002, !containsKey);
                if (containsKey) {
                    audioPickerActivity.A0D.remove(valueOf);
                    view.setSelected(false);
                    view.setBackgroundResource(0);
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A03(false, true);
                } else {
                    audioPickerActivity.A0D.put(valueOf, A002);
                    view.setSelected(true);
                    view.setBackgroundResource(R.color.audio_picker_row_selection);
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A03(true, true);
                }
                int size = audioPickerActivity.A0D.size();
                if (size == 0) {
                    C008805h.A16(audioPickerActivity.A02, false, true);
                    A0A2 = ((AnonymousClass2C0) audioPickerActivity).A01.A06(R.string.tap_to_select);
                } else {
                    C008805h.A16(audioPickerActivity.A02, true, true);
                    A0A2 = ((AnonymousClass2C0) audioPickerActivity).A01.A0A(R.plurals.n_selected, (long) size, Integer.valueOf(size));
                }
                AnonymousClass0S2 A092 = audioPickerActivity.A09();
                AnonymousClass00E.A04(A092, "supportActionBar is null");
                A092.A07(A0A2);
                return;
            }
            ((ActivityC004702f) audioPickerActivity).A0F.A0C(((AnonymousClass2C0) audioPickerActivity).A01.A0A(R.plurals.max_files_to_send_error_message, 30, 30), 0);
        }
    }

    public void A04(AnonymousClass1KR r21, ActivityC004702f r22) {
        TextView textView;
        View view = this.A04;
        view.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(this, 22));
        view.setOnLongClickListener(new AnonymousClass1HQ(this));
        String str = r21.A03;
        File file = null;
        if (str != null) {
            file = new File(str);
        }
        int i = r21.A00;
        C39351rM r2 = new C39351rM(this, (long) i);
        this.A00 = r2;
        C39361rN r1 = new C39361rN(this);
        this.A01 = r1;
        AudioPickerActivity audioPickerActivity = this.A0E;
        audioPickerActivity.A0A.A02(r2, r1);
        if (Build.VERSION.SDK_INT >= 21) {
            this.A07.setClipToOutline(true);
        }
        this.A07.setScaleType(ImageView.ScaleType.CENTER_CROP);
        TextView textView2 = this.A0B;
        String str2 = r21.A07;
        ArrayList arrayList = audioPickerActivity.A0C;
        AnonymousClass01X r3 = ((AnonymousClass2C0) audioPickerActivity).A01;
        textView2.setText(AbstractC11890hA.A02(r22, str2, arrayList, r3));
        String str3 = r21.A02;
        if (str3 != null) {
            TextView textView3 = this.A08;
            textView3.setVisibility(0);
            textView3.setText(AbstractC11890hA.A02(r22, str3, audioPickerActivity.A0C, r3));
        } else {
            this.A08.setVisibility(8);
        }
        String str4 = r21.A05;
        boolean isEmpty = str4.isEmpty();
        if (!isEmpty) {
            TextView textView4 = this.A09;
            textView4.setVisibility(0);
            textView4.setText(str4);
        } else {
            this.A09.setVisibility(8);
        }
        String str5 = r21.A06;
        boolean isEmpty2 = str5.isEmpty();
        if (!isEmpty2) {
            if (((long) r21.A01) >= ((long) ((ActivityC004702f) audioPickerActivity).A0G.A06(AbstractC000400g.A3a)) * SearchActionVerificationClientService.MS_TO_NS) {
                SpannableString spannableString = new SpannableString(str5);
                spannableString.setSpan(new ForegroundColorSpan(-65536), 0, str5.length(), 33);
                textView = this.A0A;
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
                textView2.setAlpha(0.5f);
            } else {
                textView = this.A0A;
                textView.setText(str5);
                textView2.setAlpha(1.0f);
            }
            textView.setVisibility(0);
        } else {
            this.A0A.setVisibility(8);
        }
        if (isEmpty || isEmpty2) {
            this.A03.setVisibility(8);
        } else {
            this.A03.setVisibility(0);
        }
        boolean containsKey = audioPickerActivity.A0D.containsKey(Integer.valueOf(i));
        if (containsKey) {
            view.setSelected(true);
            view.setBackgroundResource(R.color.audio_picker_row_selection);
            SelectionCheckView selectionCheckView = this.A0D;
            selectionCheckView.setVisibility(0);
            selectionCheckView.A03(true, false);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0D;
            selectionCheckView2.A03(false, false);
            selectionCheckView2.setVisibility(4);
        }
        A05(r21, containsKey);
        CircularProgressBar circularProgressBar = this.A0C;
        circularProgressBar.A0B = C004302a.A00(r22, R.color.audio_picker_stop_button_outline);
        circularProgressBar.A0C = C004302a.A00(r22, R.color.audio_picker_stop_button_progress);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        AnonymousClass0MP r23 = new AnonymousClass0MP(new C007303n(null, true, Integer.toString(i)), 0);
        ((AbstractC007503q) r23).A04 = 2;
        AnonymousClass0M4 r5 = new AnonymousClass0M4();
        r5.A0F = file;
        ((AnonymousClass0M3) r23).A02 = r5;
        if (!C28301Tu.A08(r23)) {
            A02(r22, true);
            circularProgressBar.setMax(((AnonymousClass0M3) r23).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
            circularProgressBar.setProgress(0);
            A00(0);
        } else {
            C28301Tu r12 = C28301Tu.A0i;
            if (r12 != null) {
                circularProgressBar.setMax(r12.A02);
                if (r12.A0P()) {
                    A01(r22);
                    circularProgressBar.setProgress(r12.A09());
                } else if (r12.A09() > 0) {
                    A02(r22, false);
                    circularProgressBar.setProgress(r12.A09());
                } else {
                    A02(r22, true);
                    circularProgressBar.setProgress(0);
                }
                circularProgressBar.setMax(r12.A02);
                r12.A0E = new C39341rL(this, r12, r22, r23);
                A00((long) r12.A09());
            }
        }
        this.A06.setOnClickListener(new ViewOnClickEBaseShape1S0400000_I1(this, r23, r21, r22, 0));
    }

    public final void A05(AnonymousClass1KR r11, boolean z) {
        String str = r11.A02;
        if (str != null) {
            View view = this.A04;
            AnonymousClass01X r3 = ((AnonymousClass2C0) this.A0E).A01;
            int i = R.string.audio_picker_row_content_description;
            if (z) {
                i = R.string.audio_picker_selected_row_content_description;
            }
            view.setContentDescription(r3.A0D(i, r11.A07, str, r11.A04, r11.A06));
            return;
        }
        View view2 = this.A04;
        AnonymousClass01X r32 = ((AnonymousClass2C0) this.A0E).A01;
        int i2 = R.string.audio_picker_row_content_description_no_artist;
        if (z) {
            i2 = R.string.audio_picker_selected_row_content_description_no_artist;
        }
        view2.setContentDescription(r32.A0D(i2, r11.A07, r11.A04, r11.A06));
    }
}
