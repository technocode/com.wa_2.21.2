package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.FaceDetector;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.material.chip.Chip;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.WaImageView;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.net.tls13.WtCachedPsk;
import com.whatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.search.views.itemviews.AudioPlayerView;
import com.whatsapp.util.ViewOnClickCListenerShape1S0500000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape2S0400000_I1;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: X.1Sr  reason: invalid class name and case insensitive filesystem */
public final class C28051Sr {
    public static long A00;
    public static C42911xU A01;
    public static HashMap A02;

    public static int A02(int i) {
        switch (i) {
            case 57345:
                return 128102;
            case 57346:
                return 128103;
            case 57347:
                return 128139;
            case 57348:
                return 128104;
            case 57349:
                return 128105;
            case 57350:
                return 128085;
            case 57351:
                return 128095;
            case 57352:
                return 128247;
            case 57353:
                return 9742;
            case 57354:
                return 128241;
            case 57355:
                return 128224;
            case 57356:
                return 128187;
            case 57357:
                return 128074;
            case 57358:
                return 128077;
            case 57359:
                return 9757;
            case 57360:
                return 9994;
            case 57361:
                return 9996;
            case 57362:
                return 9995;
            case 57363:
                return 127935;
            case 57364:
                return 9971;
            case 57365:
                return 127934;
            case 57366:
                return 9918;
            case 57367:
                return 127940;
            case 57368:
                return 9917;
            case 57369:
                return 128031;
            case 57370:
                return 128052;
            case 57371:
                return 128663;
            case 57372:
                return 9973;
            case 57373:
                return 9992;
            case 57374:
                return 128643;
            case 57375:
                return 128645;
            case 57376:
                return 10067;
            case 57377:
                return 10071;
            case 57378:
                return 10084;
            case 57379:
                return 128148;
            case 57380:
                return 128336;
            case 57381:
                return 128337;
            case 57382:
                return 128338;
            case 57383:
                return 128339;
            case 57384:
                return 128340;
            case 57385:
                return 128341;
            case 57386:
                return 128342;
            case 57387:
                return 128343;
            case 57388:
                return 128344;
            case 57389:
                return 128345;
            case 57390:
                return 128346;
            case 57391:
                return 128347;
            case 57392:
                return 127800;
            case 57393:
                return 128305;
            case 57394:
                return 127801;
            case 57395:
                return 127876;
            case 57396:
                return 128141;
            case 57397:
                return 128142;
            case 57398:
                return 127968;
            case 57399:
                return 9962;
            case 57400:
                return 127970;
            case 57401:
                return 128649;
            case 57402:
                return 9981;
            case 57403:
                return 128507;
            case 57404:
                return 127908;
            case 57405:
                return 127909;
            case 57406:
                return 127925;
            case 57407:
                return 128273;
            case 57408:
                return 127927;
            case 57409:
                return 127928;
            case 57410:
                return 127930;
            case 57411:
                return 127860;
            case 57412:
                return 127864;
            case 57413:
                return 9749;
            case 57414:
                return 127856;
            case 57415:
                return 127866;
            case 57416:
                return 9924;
            case 57417:
                return 9729;
            case 57418:
                return 9728;
            case 57419:
                return 9748;
            case 57420:
                return 127769;
            case 57421:
                return 127748;
            case 57422:
                return 128124;
            case 57423:
                return 128049;
            case 57424:
                return 128047;
            case 57425:
                return 128059;
            case 57426:
                return 128054;
            case 57427:
                return 128045;
            case 57428:
                return 128051;
            case 57429:
                return 128039;
            case 57430:
                return 128522;
            case 57431:
                return 128515;
            case 57432:
                return 128542;
            case 57433:
                return 128544;
            case 57434:
                return 128169;
            default:
                switch (i) {
                    case 57601:
                        return 128235;
                    case 57602:
                        return 128238;
                    case 57603:
                        return 128233;
                    case 57604:
                        return 128242;
                    case 57605:
                        return 128540;
                    case 57606:
                        return 128525;
                    case 57607:
                        return 128561;
                    case 57608:
                        return 128531;
                    case 57609:
                        return 128053;
                    case 57610:
                        return 128025;
                    case 57611:
                        return 128055;
                    case 57612:
                        return 128125;
                    case 57613:
                        return 128640;
                    case 57614:
                        return 128081;
                    case 57615:
                        return 128161;
                    case 57616:
                        return 127808;
                    case 57617:
                        return 128143;
                    case 57618:
                        return 127873;
                    case 57619:
                        return 128299;
                    case 57620:
                        return 128269;
                    case 57621:
                        return 127939;
                    case 57622:
                        return 128296;
                    case 57623:
                        return 127878;
                    case 57624:
                        return 127809;
                    case 57625:
                        return 127810;
                    case 57626:
                        return 128127;
                    case 57627:
                        return 128123;
                    case 57628:
                        return 128128;
                    case 57629:
                        return 128293;
                    case 57630:
                        return 128188;
                    case 57631:
                        return 128186;
                    case 57632:
                        return 127828;
                    case 57633:
                        return 9970;
                    case 57634:
                        return 9978;
                    case 57635:
                        return 9832;
                    case 57636:
                        return 127905;
                    case 57637:
                        return 127915;
                    case 57638:
                        return 128191;
                    case 57639:
                        return 128192;
                    case 57640:
                        return 128251;
                    case 57641:
                        return 128252;
                    case 57642:
                        return 128250;
                    case 57643:
                        return 128126;
                    case 57644:
                        return 12349;
                    case 57645:
                        return 126980;
                    case 57646:
                        return 127386;
                    case 57647:
                        return 128176;
                    case 57648:
                        return 127919;
                    case 57649:
                        return 127942;
                    case 57650:
                        return 127937;
                    case 57651:
                        return 127920;
                    case 57652:
                        return 128014;
                    case 57653:
                        return 128676;
                    case 57654:
                        return 128690;
                    case 57655:
                        return 128679;
                    case 57656:
                        return 128697;
                    case 57657:
                        return 128698;
                    case 57658:
                        return 128700;
                    case 57659:
                        return 128137;
                    case 57660:
                        return 128164;
                    case 57661:
                        return 9889;
                    case 57662:
                        return 128096;
                    case 57663:
                        return 128704;
                    case 57664:
                        return 128701;
                    case 57665:
                        return 128266;
                    case 57666:
                        return 128226;
                    case 57667:
                        return 127884;
                    case 57668:
                        return 128274;
                    case 57669:
                        return 128275;
                    case 57670:
                        return 127750;
                    case 57671:
                        return 127859;
                    case 57672:
                        return 128214;
                    case 57673:
                        return 128177;
                    case 57674:
                        return 128185;
                    case 57675:
                        return 128225;
                    case 57676:
                        return 128170;
                    case 57677:
                        return 127974;
                    case 57678:
                        return 128677;
                    case 57679:
                        return 127359;
                    case 57680:
                        return 128655;
                    case 57681:
                        return 128699;
                    case 57682:
                        return 128110;
                    case 57683:
                        return 127971;
                    case 57684:
                        return 127975;
                    case 57685:
                        return 127973;
                    case 57686:
                        return 127978;
                    case 57687:
                        return 127979;
                    case 57688:
                        return 127976;
                    case 57689:
                        return 128652;
                    case 57690:
                        return 128661;
                    default:
                        switch (i) {
                            case 57857:
                                return 128694;
                            case 57858:
                                return 128674;
                            case 57859:
                                return 127489;
                            case 57860:
                                return 128159;
                            case 57861:
                                return 10036;
                            case 57862:
                                return 10035;
                            case 57863:
                                return 128286;
                            case 57864:
                                return 128685;
                            case 57865:
                                return 128304;
                            case 57866:
                                return 9855;
                            case 57867:
                                return 128246;
                            case 57868:
                                return 9829;
                            case 57869:
                                return 9830;
                            case 57870:
                                return 9824;
                            case 57871:
                                return 9827;
                            default:
                                switch (i) {
                                    case 57873:
                                        return 10175;
                                    case 57874:
                                        return 127381;
                                    case 57875:
                                        return 127385;
                                    case 57876:
                                        return 127378;
                                    case 57877:
                                        return 127542;
                                    case 57878:
                                        return 127514;
                                    case 57879:
                                        return 127543;
                                    case 57880:
                                        return 127544;
                                    case 57881:
                                        return 128308;
                                    case 57882:
                                        return 128306;
                                    case 57883:
                                        return 128307;
                                    default:
                                        switch (i) {
                                            case 57894:
                                                return 127568;
                                            case 57895:
                                                return 127545;
                                            case 57896:
                                                return 127490;
                                            case 57897:
                                                return 127380;
                                            case 57898:
                                                return 127541;
                                            case 57899:
                                                return 127539;
                                            case 57900:
                                                return 127535;
                                            case 57901:
                                                return 127546;
                                            case 57902:
                                                return 128070;
                                            case 57903:
                                                return 128071;
                                            case 57904:
                                                return 128072;
                                            case 57905:
                                                return 128073;
                                            case 57906:
                                                return 11014;
                                            case 57907:
                                                return 11015;
                                            case 57908:
                                                return 10145;
                                            case 57909:
                                                return 11013;
                                            case 57910:
                                                return 8599;
                                            case 57911:
                                                return 8598;
                                            case 57912:
                                                return 8600;
                                            case 57913:
                                                return 8601;
                                            case 57914:
                                                return 9654;
                                            case 57915:
                                                return 9664;
                                            case 57916:
                                                return 9193;
                                            case 57917:
                                                return 9194;
                                            case 57918:
                                                return 128303;
                                            case 57919:
                                                return 9800;
                                            case 57920:
                                                return 9801;
                                            case 57921:
                                                return 9802;
                                            case 57922:
                                                return 9803;
                                            case 57923:
                                                return 9804;
                                            case 57924:
                                                return 9805;
                                            case 57925:
                                                return 9806;
                                            case 57926:
                                                return 9807;
                                            case 57927:
                                                return 9808;
                                            case 57928:
                                                return 9809;
                                            case 57929:
                                                return 9810;
                                            case 57930:
                                                return 9811;
                                            case 57931:
                                                return 9934;
                                            case 57932:
                                                return 128285;
                                            case 57933:
                                                return 127383;
                                            case 57934:
                                                return 169;
                                            case 57935:
                                                return 174;
                                            case 57936:
                                                return 128243;
                                            case 57937:
                                                return 128244;
                                            case 57938:
                                                return 9888;
                                            case 57939:
                                                return 128129;
                                            default:
                                                switch (i) {
                                                    case 58113:
                                                        return 128221;
                                                    case 58114:
                                                        return 128084;
                                                    case 58115:
                                                        return 127802;
                                                    case 58116:
                                                        return 127799;
                                                    case 58117:
                                                        return 127803;
                                                    case 58118:
                                                        return 128144;
                                                    case 58119:
                                                        return 127796;
                                                    case 58120:
                                                        return 127797;
                                                    case 58121:
                                                        return 128702;
                                                    case 58122:
                                                        return 127911;
                                                    case 58123:
                                                        return 127862;
                                                    case 58124:
                                                        return 127867;
                                                    case 58125:
                                                        return 12951;
                                                    case 58126:
                                                        return 128684;
                                                    case 58127:
                                                        return 128138;
                                                    case 58128:
                                                        return 127880;
                                                    case 58129:
                                                        return 128163;
                                                    case 58130:
                                                        return 127881;
                                                    case 58131:
                                                        return 9986;
                                                    case 58132:
                                                        return 127872;
                                                    case 58133:
                                                        return 12953;
                                                    case 58134:
                                                        return 128189;
                                                    case 58135:
                                                        return 128227;
                                                    case 58136:
                                                        return 128082;
                                                    case 58137:
                                                        return 128087;
                                                    case 58138:
                                                        return 128097;
                                                    case 58139:
                                                        return 128098;
                                                    case 58140:
                                                        return 128132;
                                                    case 58141:
                                                        return 128133;
                                                    case 58142:
                                                        return 128134;
                                                    case 58143:
                                                        return 128135;
                                                    case 58144:
                                                        return 128136;
                                                    case 58145:
                                                        return 128088;
                                                    case 58146:
                                                        return 128089;
                                                    case 58147:
                                                        return 128092;
                                                    case 58148:
                                                        return 127916;
                                                    case 58149:
                                                        return 128276;
                                                    case 58150:
                                                        return 127926;
                                                    case 58151:
                                                        return 128147;
                                                    case 58152:
                                                        return 128151;
                                                    case 58153:
                                                        return 128152;
                                                    case 58154:
                                                        return 128153;
                                                    case 58155:
                                                        return 128154;
                                                    case 58156:
                                                        return 128155;
                                                    case 58157:
                                                        return 128156;
                                                    case 58158:
                                                        return 10024;
                                                    case 58159:
                                                        return 11088;
                                                    case 58160:
                                                        return 128168;
                                                    case 58161:
                                                        return 128166;
                                                    case 58162:
                                                        return 11093;
                                                    case 58163:
                                                        return 10060;
                                                    case 58164:
                                                        return 128162;
                                                    case 58165:
                                                        return 127775;
                                                    case 58166:
                                                        return 10068;
                                                    case 58167:
                                                        return 10069;
                                                    case 58168:
                                                        return 127861;
                                                    case 58169:
                                                        return 127838;
                                                    case 58170:
                                                        return 127846;
                                                    case 58171:
                                                        return 127839;
                                                    case 58172:
                                                        return 127841;
                                                    case 58173:
                                                        return 127832;
                                                    case 58174:
                                                        return 127834;
                                                    case 58175:
                                                        return 127837;
                                                    case 58176:
                                                        return 127836;
                                                    case 58177:
                                                        return 127835;
                                                    case 58178:
                                                        return 127833;
                                                    case 58179:
                                                        return 127842;
                                                    case 58180:
                                                        return 127843;
                                                    case 58181:
                                                        return 127822;
                                                    case 58182:
                                                        return 127818;
                                                    case 58183:
                                                        return 127827;
                                                    case 58184:
                                                        return 127817;
                                                    case 58185:
                                                        return 127813;
                                                    case 58186:
                                                        return 127814;
                                                    case 58187:
                                                        return 127874;
                                                    case 58188:
                                                        return 127857;
                                                    case 58189:
                                                        return 127858;
                                                    default:
                                                        switch (i) {
                                                            case 58369:
                                                                return 128549;
                                                            case 58370:
                                                                return 128527;
                                                            case 58371:
                                                                return 128532;
                                                            case 58372:
                                                                return 128513;
                                                            case 58373:
                                                                return 128521;
                                                            case 58374:
                                                                return 128547;
                                                            case 58375:
                                                                return 128534;
                                                            case 58376:
                                                                return 128554;
                                                            case 58377:
                                                                return 128541;
                                                            case 58378:
                                                                return 128524;
                                                            case 58379:
                                                                return 128552;
                                                            case 58380:
                                                                return 128567;
                                                            case 58381:
                                                                return 128563;
                                                            case 58382:
                                                                return 128530;
                                                            case 58383:
                                                                return 128560;
                                                            case 58384:
                                                                return 128562;
                                                            case 58385:
                                                                return 128557;
                                                            case 58386:
                                                                return 128514;
                                                            case 58387:
                                                                return 128546;
                                                            case 58388:
                                                                return 9786;
                                                            case 58389:
                                                                return 128516;
                                                            case 58390:
                                                                return 128545;
                                                            case 58391:
                                                                return 128538;
                                                            case 58392:
                                                                return 128536;
                                                            case 58393:
                                                                return 128064;
                                                            case 58394:
                                                                return 128067;
                                                            case 58395:
                                                                return 128066;
                                                            case 58396:
                                                                return 128068;
                                                            case 58397:
                                                                return 128591;
                                                            case 58398:
                                                                return 128075;
                                                            case 58399:
                                                                return 128079;
                                                            case 58400:
                                                                return 128076;
                                                            case 58401:
                                                                return 128078;
                                                            case 58402:
                                                                return 128080;
                                                            case 58403:
                                                                return 128581;
                                                            case 58404:
                                                                return 128582;
                                                            case 58405:
                                                                return 128145;
                                                            case 58406:
                                                                return 128583;
                                                            case 58407:
                                                                return 128588;
                                                            case 58408:
                                                                return 128107;
                                                            case 58409:
                                                                return 128111;
                                                            case 58410:
                                                                return 127936;
                                                            case 58411:
                                                                return 127944;
                                                            case 58412:
                                                                return 127921;
                                                            case 58413:
                                                                return 127946;
                                                            case 58414:
                                                                return 128665;
                                                            case 58415:
                                                                return 128666;
                                                            case 58416:
                                                                return 128658;
                                                            case 58417:
                                                                return 128657;
                                                            case 58418:
                                                                return 128659;
                                                            case 58419:
                                                                return 127906;
                                                            case 58420:
                                                                return 128647;
                                                            case 58421:
                                                                return 128644;
                                                            case 58422:
                                                                return 127885;
                                                            case 58423:
                                                                return 128157;
                                                            case 58424:
                                                                return 127886;
                                                            case 58425:
                                                                return 127891;
                                                            case 58426:
                                                                return 127890;
                                                            case 58427:
                                                                return 127887;
                                                            case 58428:
                                                                return 127746;
                                                            case 58429:
                                                                return 128146;
                                                            case 58430:
                                                                return 127754;
                                                            case 58431:
                                                                return 127847;
                                                            case 58432:
                                                                return 127879;
                                                            case 58433:
                                                                return 128026;
                                                            case 58434:
                                                                return 127888;
                                                            case 58435:
                                                                return 127744;
                                                            case 58436:
                                                                return 127806;
                                                            case 58437:
                                                                return 127875;
                                                            case 58438:
                                                                return 127889;
                                                            case 58439:
                                                                return 127811;
                                                            case 58440:
                                                                return 127877;
                                                            case 58441:
                                                                return 127749;
                                                            case 58442:
                                                                return 127751;
                                                            case 58443:
                                                                return 127747;
                                                            case 58444:
                                                                return 127752;
                                                            default:
                                                                switch (i) {
                                                                    case 58625:
                                                                        return 127977;
                                                                    case 58626:
                                                                        return 127912;
                                                                    case 58627:
                                                                        return 127913;
                                                                    case 58628:
                                                                        return 127980;
                                                                    case 58629:
                                                                        return 127983;
                                                                    case 58630:
                                                                        return 127984;
                                                                    case 58631:
                                                                        return 127910;
                                                                    case 58632:
                                                                        return 127981;
                                                                    case 58633:
                                                                        return 128508;
                                                                    default:
                                                                        switch (i) {
                                                                            case 58645:
                                                                                return 128113;
                                                                            case 58646:
                                                                                return 128114;
                                                                            case 58647:
                                                                                return 128115;
                                                                            case 58648:
                                                                                return 128116;
                                                                            case 58649:
                                                                                return 128117;
                                                                            case 58650:
                                                                                return 128118;
                                                                            case 58651:
                                                                                return 128119;
                                                                            case 58652:
                                                                                return 128120;
                                                                            case 58653:
                                                                                return 128509;
                                                                            case 58654:
                                                                                return 128130;
                                                                            case 58655:
                                                                                return 128131;
                                                                            case 58656:
                                                                                return 128044;
                                                                            case 58657:
                                                                                return 128038;
                                                                            case 58658:
                                                                                return 128032;
                                                                            case 58659:
                                                                                return 128036;
                                                                            case 58660:
                                                                                return 128057;
                                                                            case 58661:
                                                                                return 128027;
                                                                            case 58662:
                                                                                return 128024;
                                                                            case 58663:
                                                                                return 128040;
                                                                            case 58664:
                                                                                return 128018;
                                                                            case 58665:
                                                                                return 128017;
                                                                            case 58666:
                                                                                return 128058;
                                                                            case 58667:
                                                                                return 128046;
                                                                            case 58668:
                                                                                return 128048;
                                                                            case 58669:
                                                                                return 128013;
                                                                            case 58670:
                                                                                return 128020;
                                                                            case 58671:
                                                                                return 128023;
                                                                            case 58672:
                                                                                return 128043;
                                                                            case 58673:
                                                                                return 128056;
                                                                            case 58674:
                                                                                return 127344;
                                                                            case 58675:
                                                                                return 127345;
                                                                            case 58676:
                                                                                return 127374;
                                                                            case 58677:
                                                                                return 127358;
                                                                            case 58678:
                                                                                return 128099;
                                                                            case 58679:
                                                                                return 8482;
                                                                            default:
                                                                                return i;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static String A0m(byte b) {
        if (b == 0) {
            return "close_notify";
        }
        if (b == 10) {
            return "unexpected_message";
        }
        if (b == 20) {
            return "bad_record_mac";
        }
        if (b == 22) {
            return "record_overflow";
        }
        if (b == 40) {
            return "handshake_failure";
        }
        if (b == 80) {
            return "internal_error";
        }
        if (b == 86) {
            return "inappropriate_fallback";
        }
        if (b == 90) {
            return "user_cancelled";
        }
        if (b == 120) {
            return "no_application_protocol";
        }
        if (b == 70) {
            return "protocol_version";
        }
        if (b == 71) {
            return "insufficient_security";
        }
        if (b == 109) {
            return "missing_extension";
        }
        if (b == 110) {
            return "unsupported_version";
        }
        if (b == 112) {
            return "unrecognized_name";
        }
        if (b == 113) {
            return "bad_certificate_status_response";
        }
        if (b == 115) {
            return "unknown_psk_identity";
        }
        if (b == 116) {
            return "certificate_required";
        }
        switch (b) {
            case 42:
                return "bad_certificate";
            case 43:
                return "unsupported_certificate";
            case 44:
                return "certificate_revoked";
            case 45:
                return "certificate_expired";
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                return "certificate_unknown";
            case 47:
                return "illegal_parameter";
            case 48:
                return "unknown_ca";
            case 49:
                return "access_denied";
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                return "decode_error";
            case 51:
                return "decrypt_error";
            default:
                return "invalid description";
        }
    }

    public static boolean A1n(int i) {
        if (!(i == 9792 || i == 9794)) {
            switch (i) {
                case 9877:
                case 9878:
                case 9992:
                case 127806:
                case 127859:
                case 127868:
                case 127891:
                case 127908:
                case 127912:
                case 127979:
                case 127981:
                case 128187:
                case 128188:
                case 128295:
                case 128300:
                case 128640:
                case 128658:
                case 129455:
                case 129468:
                case 129469:
                    break;
                default:
                    return i == 129456 || i == 129459 || i == 129457 || i == 129458;
            }
        }
    }

    public static boolean A1o(int i) {
        return i >= 126980 && i <= 129750;
    }

    public static float A00(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static int A01(int i) {
        if (i == R.drawable.ic_call_incoming) {
            return R.color.voipIncomingCallIconTint;
        }
        if (i == R.drawable.ic_call_outgoing) {
            return R.color.voipOutgoingCallIconTint;
        }
        return R.color.voipMissedCallIconTint;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r2 != r8) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r8 == -1) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(int r14, int r15, int r16, long r17) {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A03(int, int, int, long):int");
    }

    public static int A04(int i, List list, List list2, List list3) {
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return list2.size() - 1;
        }
        for (int size = list3.size() - 1; size >= 0; size--) {
            if (((Number) list3.get(size)).intValue() <= i) {
                return size;
            }
        }
        return 0;
    }

    public static int A05(Resources resources, AnonymousClass1M5 r3) {
        int[] intArray = resources.getIntArray(R.array.group_participant_name_colors);
        return intArray[r3.A00 % intArray.length];
    }

    public static int A06(AnonymousClass1VI r3) {
        String str;
        EnumC449622i r2 = r3.A06;
        String str2 = r3.A07;
        if (str2 != null) {
            str = str2.toLowerCase(Locale.US);
        } else {
            str = null;
        }
        switch (r2.ordinal()) {
            case 0:
                return R.drawable.device_list_ic_unknown_browser;
            case 1:
                return R.drawable.device_list_ic_chrome;
            case 2:
                return R.drawable.device_list_ic_firefox;
            case 3:
                return R.drawable.device_list_ic_ie;
            case 4:
                return R.drawable.device_list_ic_opera;
            case 5:
                return R.drawable.device_list_ic_safari;
            case 6:
                return R.drawable.device_list_ic_edge;
            case 7:
                if ("windows".equals(str)) {
                    return R.drawable.device_list_ic_windows;
                }
                if ("mac os".equals(str)) {
                    return R.drawable.device_list_ic_mac;
                }
                return R.drawable.device_list_ic_desktop_fallback;
            case 8:
                return R.drawable.device_list_ic_unknown_device;
            case 9:
                return R.drawable.device_list_ic_unknown_device;
            case 10:
            case 11:
            case 12:
                return R.drawable.device_list_ic_portal;
            default:
                return R.drawable.device_list_ic_unknown_browser;
        }
    }

    public static int A07(C43761yu r2) {
        int i = r2.A01;
        if (i == 1) {
            return R.drawable.av_visa;
        }
        if (i == 2) {
            return R.drawable.av_mc;
        }
        if (i == 3) {
            return R.drawable.av_amex;
        }
        if (i != 4) {
            return R.drawable.av_card;
        }
        return R.drawable.av_discover;
    }

    public static int A08(C04420Kh r7, ProgressBar progressBar, AnonymousClass0M3 r9) {
        AnonymousClass0M4 r6 = r9.A02;
        if (r6 != null) {
            boolean z = false;
            if (!r6.A0a || r6.A0Y) {
                progressBar.setVisibility(8);
                return 0;
            }
            progressBar.setVisibility(0);
            long j = r6.A0C;
            if (j == 0 || j == 100) {
                z = true;
            }
            progressBar.setIndeterminate(z);
            int i = (int) r6.A0C;
            if (r7.A08(r9)) {
                i >>= 1;
                if (r7.A09(r9)) {
                    i += 50;
                }
            }
            progressBar.setProgress(i);
            return i;
        }
        throw null;
    }

    public static int A09(AnonymousClass0M2 r7, C04370Kc r8, AnonymousClass02M r9, AnonymousClass009 r10, AnonymousClass00T r11, C000300f r12, C02780Dk r13, AnonymousClass0BW r14, ActivityC004702f r15, AnonymousClass03S r16) {
        if (!RequestPermissionActivity.A0N(r15, r16)) {
            return 0;
        }
        AnonymousClass0M4 r1 = ((AnonymousClass0M3) r7).A02;
        if (r1 == null) {
            throw null;
        } else if (!r7.A0n.A02 && !r1.A0P) {
            return 1;
        } else {
            File file = r1.A0F;
            if (file == null || !file.exists()) {
                return 2;
            }
            AnonymousClass0ZD.A07(r8, r9, r10, r11, r14, r15, r7, r13);
            return 3;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A0A(X.AnonymousClass0K4 r4) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A0A(X.0K4):int");
    }

    public static int A0B(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        return A0C(charSequence, 0, charSequence.length());
    }

    public static int A0C(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        if (i < 0 || i2 > length || i > i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = 0;
        if (length == 0) {
            return 0;
        }
        AnonymousClass0M6 r1 = new AnonymousClass0M6(charSequence);
        while (i < i2) {
            r1.A00 = i;
            i += r1.A01(i, EmojiDescriptor.A00(r1, false));
            i3++;
        }
        return i3;
    }

    public static int A0D(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (((AnonymousClass1VM) list.get(i)).A01 == 2) {
                return i;
            }
        }
        return 0;
    }

    public static int A0E(byte[] bArr) {
        if (bArr.length == 3) {
            return (bArr[2] & 255) | 0 | ((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8);
        }
        throw new C29001Wo((byte) 80, new SSLException("Invalid argument. Byte array is null or length != 3"));
    }

    public static int A0F(byte[] bArr) {
        if (bArr == null || bArr.length != 2) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid argument. Byte array is null or length != 2"));
        }
        return (bArr[1] & 255) | 0 | ((bArr[0] & 255) << 8);
    }

    public static int A0G(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round(f4 * 255.0f);
                break;
            case 2:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs + f4) * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = Math.round(f4 * 255.0f);
                round2 = Math.round((abs2 + f4) * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f4) * 255.0f);
                round2 = Math.round(f4 * 255.0f);
                round3 = Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(Math.max(0, Math.min(255, round)), Math.max(0, Math.min(255, round2)), Math.max(0, Math.min(255, round3)));
    }

    public static long A0H(AnonymousClass088 r6, AnonymousClass348 r7) {
        long A03 = C006803i.A03(r6.A09(), null);
        C73193Vv r4 = r7.A01;
        r4.A0E("STORAGE_USAGE_MEDIA_SIZE", String.valueOf(A03));
        r4.A0E("STORAGE_USAGE_MEDIA_SIZE_CACHE_TIME", String.valueOf(r7.A00.A05()));
        return A03;
    }

    public static long A0I(AnonymousClass00S r4, String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            i = Integer.parseInt(str);
        } else {
            i = 60;
        }
        return (long) Math.ceil(((double) (r4.A05() + ((long) (i * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)))) / 1000.0d);
    }

    public static long A0J(byte[] bArr) {
        if (bArr != null && bArr.length == 4) {
            return (((long) (bArr[0] & 255)) << 24) | (((long) (bArr[1] & 255)) << 16) | (((long) (bArr[2] & 255)) << 8) | ((long) (bArr[3] & 255));
        }
        throw new C29001Wo((byte) 80, new SSLException("Invalid argument. byte array is null or length != 4"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0108, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x010c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor A0K(int r7, int r8, X.AnonymousClass02N r9, X.AnonymousClass0BV r10) {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A0K(int, int, X.02N, X.0BV):android.database.Cursor");
    }

    public static Bitmap A0L(int i, long j, ParcelFileDescriptor parcelFileDescriptor) {
        int i2;
        int i3;
        if (parcelFileDescriptor == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
            options.inJustDecodeBounds = true;
            C49072Ox.A00().A02(fileDescriptor, options);
            if (options.mCancel || (i2 = options.outWidth) == -1 || (i3 = options.outHeight) == -1) {
                try {
                    parcelFileDescriptor.close();
                } catch (Throwable unused) {
                }
                return null;
            }
            options.inSampleSize = A03(i2, i3, i, j);
            options.inJustDecodeBounds = false;
            options.inDither = false;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap A022 = C49072Ox.A00().A02(fileDescriptor, options);
            try {
                parcelFileDescriptor.close();
            } catch (Throwable unused2) {
            }
            return A022;
        } catch (OutOfMemoryError e) {
            Log.e("Util", "Got oom exception ", e);
            parcelFileDescriptor.close();
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static Bitmap A0M(Bitmap bitmap, int i) {
        if (i != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
            } catch (OutOfMemoryError unused) {
            }
        }
        return bitmap;
    }

    public static Drawable A0N(Context context) {
        Drawable A03 = C004302a.A03(context, R.drawable.balloon_incoming_frame);
        int A002 = C004302a.A00(context, R.color.bubbleIncomingTint);
        if (A03 == null) {
            throw null;
        } else if (A002 != 0) {
            return C002001d.A0e(A03, A002);
        } else {
            return A03;
        }
    }

    public static Drawable A0O(Context context) {
        Drawable A03 = C004302a.A03(context, R.drawable.balloon_outgoing_frame);
        int A002 = C004302a.A00(context, R.color.bubbleOutgoingTint);
        if (A03 == null) {
            throw null;
        } else if (A002 != 0) {
            return C002001d.A0e(A03, A002);
        } else {
            return A03;
        }
    }

    public static Drawable A0P(AnonymousClass0MP r1, Context context) {
        boolean z = r1.A0n.A02;
        int i = ((AbstractC007503q) r1).A08;
        if (z) {
            if (i == 8) {
                return C002001d.A0b(context, R.drawable.msg_status_mic, R.color.msgStatusReadTint);
            }
            return C002001d.A0b(context, R.drawable.msg_status_mic, R.color.msgStatusTint);
        } else if (i == 9 || i == 10) {
            return C002001d.A0b(context, R.drawable.msg_status_mic, R.color.msgStatusReadTint);
        } else {
            return C002001d.A0b(context, R.drawable.msg_status_mic, R.color.msgStatusUnplayedTint);
        }
    }

    public static SpannableString A0Q(Context context, String str, boolean z, AnonymousClass3S0 r19) {
        Spanned fromHtml = Html.fromHtml(str);
        String obj = fromHtml.toString();
        SpannableString spannableString = new SpannableString(obj);
        Object[] spans = fromHtml.getSpans(0, obj.length(), Object.class);
        for (Object obj2 : spans) {
            int spanStart = fromHtml.getSpanStart(obj2);
            int spanEnd = fromHtml.getSpanEnd(obj2);
            int spanFlags = fromHtml.getSpanFlags(obj2);
            if (obj2 instanceof URLSpan) {
                URLSpan uRLSpan = (URLSpan) obj2;
                if (r19 != null) {
                    String url = uRLSpan.getURL();
                    obj2 = new C72103Rn(context, url, A13(url), A1C(url), r19);
                }
            } else if (z && (obj2 instanceof StyleSpan) && ((StyleSpan) obj2).getStyle() == 1) {
                obj2 = new C29261Xt(context);
            }
            spannableString.setSpan(obj2, spanStart, spanEnd, spanFlags);
        }
        return spannableString;
    }

    public static Pair A0R(File file) {
        com.whatsapp.util.Log.d("mediafileutils/detection/start");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        AnonymousClass02L A0n = C002001d.A0n(file, new AnonymousClass02K(400, 400, null, true, options));
        Bitmap bitmap = A0n.A02;
        Pair pair = null;
        if (bitmap == null) {
            return null;
        }
        if ((bitmap.getWidth() & 1) == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth() - 1, bitmap.getHeight());
            if (bitmap != createBitmap) {
                bitmap.recycle();
            }
            bitmap = createBitmap;
        }
        FaceDetector faceDetector = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 1);
        FaceDetector.Face[] faceArr = new FaceDetector.Face[1];
        com.whatsapp.util.Log.d("mediafileutils/detection/find");
        if (faceDetector.findFaces(bitmap, faceArr) > 0 && faceArr[0].confidence() > 0.3f) {
            PointF pointF = new PointF();
            faceArr[0].getMidPoint(pointF);
            pair = new Pair(Integer.valueOf((int) ((pointF.x * ((float) A0n.A01)) / ((float) bitmap.getWidth()))), Integer.valueOf((int) ((pointF.y * ((float) A0n.A00)) / ((float) bitmap.getHeight()))));
        }
        bitmap.recycle();
        com.whatsapp.util.Log.d("mediafileutils/detectFace/finish");
        return pair;
    }

    public static Pair A0S(List list, AnonymousClass01X r9) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        String str = "";
        for (int i = 0; i < size; i++) {
            C007003k A5O = ((AnonymousClass2GM) list.get(i)).A5O();
            if (A5O != null) {
                String str2 = A5O.A0F;
                if (!TextUtils.isEmpty(str2)) {
                    String upperCase = C003701u.A07(str2, 1).toUpperCase(r9.A0I());
                    if (Character.isDigit(upperCase.codePointAt(0)) || "+".equals(upperCase)) {
                        upperCase = "#";
                    }
                    if (!str.equals(upperCase)) {
                        arrayList.add(upperCase);
                        arrayList2.add(Integer.valueOf(i));
                        str = upperCase;
                    }
                }
            }
        }
        return new Pair(arrayList, arrayList2);
    }

    public static SparseArray A0T() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(AnonymousClass0PW.A03, new C655630j(R.id.search_media_filter_link, R.string.search_links, R.drawable.ic_link, 9.0f, 4.0f, 2.0f));
        sparseArray.put(105, new C655630j(R.id.search_media_filter_image, R.string.search_images, R.drawable.msg_status_image, 9.0f, 4.0f, 0.0f));
        sparseArray.put(97, new C655630j(R.id.search_media_filter_audio, R.string.search_audio, R.drawable.msg_status_audio, 8.0f, 4.0f, 0.0f));
        sparseArray.put(103, new C655630j(R.id.search_media_filter_gif, R.string.search_gifs, R.drawable.msg_status_gif, 10.0f, 6.0f, 0.2f));
        sparseArray.put(118, new C655630j(R.id.search_media_filter_video, R.string.search_videos, R.drawable.msg_status_video, 9.0f, 5.0f, 0.0f));
        sparseArray.put(100, new C655630j(R.id.search_media_filter_doc, R.string.search_docs, R.drawable.msg_status_doc, 7.0f, 3.0f, 0.0f));
        return sparseArray;
    }

    public static View.OnClickListener A0U(C02850Ds r7, boolean z, Context context, AnonymousClass01I r10, C02770Dj r11) {
        UserJid A08 = r7.A08();
        boolean z2 = r7.A0n.A02;
        UserJid userJid = A08;
        if (z2) {
            userJid = null;
        }
        if (z) {
            return new ViewOnClickCListenerShape2S0400000_I1(context, userJid, r11, r7, 1);
        }
        return new ViewOnClickCListenerShape1S0500000_I1(context, r10, r7, r11, A08, 0);
    }

    public static AnimationSet A0V(View view) {
        Animation loadAnimation = AnimationUtils.loadAnimation(view.getContext(), R.anim.up);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(view.getContext(), R.anim.down);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(view.getContext(), R.anim.shake);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(loadAnimation);
        animationSet.addAnimation(loadAnimation3);
        animationSet.addAnimation(loadAnimation2);
        animationSet.setRepeatMode(1);
        animationSet.setRepeatCount(-1);
        animationSet.setStartOffset(750);
        animationSet.setAnimationListener(new AnonymousClass3UY(animationSet, view));
        return animationSet;
    }

    public static ImageView A0W(Context context, int i) {
        Resources resources = context.getResources();
        WaImageView waImageView = new WaImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics()));
        layoutParams.gravity = 17;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        layoutParams.topMargin = applyDimension;
        layoutParams.bottomMargin = applyDimension;
        waImageView.setLayoutParams(layoutParams);
        waImageView.setImageDrawable(resources.getDrawable(R.drawable.bhim_upi_logo));
        return waImageView;
    }

    public static AnonymousClass0MB A0X(Context context, AnonymousClass01X r9, String str, AnonymousClass35T r11, boolean z, int i) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_clear_messages, (ViewGroup) null);
        inflate.findViewById(R.id.delete_media_container);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.delete_media_checkbox);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.delete_starred_checkbox);
        checkBox.setChecked(z);
        ((TextView) inflate.findViewById(R.id.delete_media_checkbox_text)).setText(A0n(i, r9));
        inflate.findViewById(R.id.delete_media_container).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(checkBox, 26));
        inflate.findViewById(R.id.delete_starred_container).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(checkBox2, 25));
        AnonymousClass0MB r3 = new AnonymousClass0MB(context);
        AnonymousClass0MC r5 = r3.A01;
        r5.A0C = inflate;
        r5.A01 = 0;
        r3.A07(r9.A06(R.string.clear_all_chats_dialog_positive_button), new DialogInterface$OnClickListenerC27981Sj(r11, checkBox2, checkBox));
        r3.A05(r9.A06(R.string.cancel), new DialogInterface$OnClickListenerC27941Sf(r11));
        if (!TextUtils.isEmpty(null)) {
            r5.A0I = null;
        } else {
            r5.A0I = r9.A06(R.string.clear_all_chats_dialog_prompt);
        }
        if (!TextUtils.isEmpty(str)) {
            ((TextView) inflate.findViewById(R.id.clear_messages_dialog_message)).setText(str);
        }
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0031, code lost:
        if (r10 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0MB A0Y(android.content.Context r12, X.C02590Cr r13, X.AnonymousClass01X r14, X.AnonymousClass00D r15, X.AnonymousClass35S r16, java.lang.String r17, boolean r18, int r19, int r20) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A0Y(android.content.Context, X.0Cr, X.01X, X.00D, X.35S, java.lang.String, boolean, int, int):X.0MB");
    }

    public static AnonymousClass02R A0Z(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List asList = Arrays.asList(str.split("\\|"));
        if (asList.size() != 2) {
            return null;
        }
        return new AnonymousClass02R(asList.get(0), TextUtils.join(".", asList));
    }

    public static C43241y1 A0a(String str, int i, int i2, Map map, List list) {
        boolean z = false;
        if (list.size() % 4 == 0) {
            z = true;
        }
        StringBuilder A0S = AnonymousClass008.A0S("BloksFieldStatParser/parseFieldStat/invalid serialization/length=");
        A0S.append(list.size());
        AnonymousClass00E.A09(z, A0S.toString());
        int size = list.size() >> 2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = i3 << 2;
            int intValue = ((Number) list.get(i4 + 2)).intValue();
            AbstractC011306t r1 = (AbstractC011306t) list.get(i4 + 3);
            Object A0l = A0l(intValue, r1, false);
            if (A0l != null) {
                arrayList.add(new AnonymousClass1TK(((Number) list.get(i4)).intValue(), (String) C008805h.A0b((AbstractC011306t) list.get(i4 + 1)), A0l, A0l(intValue, r1, true)));
            }
        }
        return new C43241y1(str, i, i2, new AnonymousClass00Z(C006803i.A02((String) map.get("sample_rate_debug"), 1), C006803i.A02((String) map.get("sample_rate_beta"), 20), C006803i.A02((String) map.get("sample_rate_release"), 20), "1".equals(map.get("log_all_for_debug"))), (AnonymousClass1TK[]) arrayList.toArray(new AnonymousClass1TK[0]));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r2 == 10) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28301Tu A0b(X.AnonymousClass0MP r2, android.app.Activity r3) {
        /*
            boolean r0 = X.C28301Tu.A08(r2)
            if (r0 == 0) goto L_0x000d
            X.1Tu r0 = X.C28301Tu.A0i
            if (r0 == 0) goto L_0x000b
            return r0
        L_0x000b:
            r0 = 0
            throw r0
        L_0x000d:
            r0 = 1
            X.1Tu r3 = X.C28301Tu.A01(r3, r0)
            r3.A0G = r2
            X.03n r0 = r2.A0n
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0028
            int r2 = r2.A08
            r0 = 9
            if (r2 == r0) goto L_0x0025
            r1 = 10
            r0 = 0
            if (r2 != r1) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r3.A0N = r0
        L_0x0028:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A0b(X.0MP, android.app.Activity):X.1Tu");
    }

    public static AnonymousClass2KK A0c(byte[] bArr) {
        int length = bArr.length;
        if (length == 80) {
            byte[] bArr2 = new byte[16];
            System.arraycopy(bArr, 0, bArr2, 0, 16);
            byte[] bArr3 = new byte[32];
            System.arraycopy(bArr, 16, bArr3, 0, 32);
            byte[] bArr4 = new byte[32];
            System.arraycopy(bArr, 48, bArr4, 0, 32);
            return new AnonymousClass2KK(bArr3, bArr4, bArr2);
        }
        StringBuilder A0S = AnonymousClass008.A0S("Invalid length of derived secret; length=");
        A0S.append(length);
        throw new AssertionError(A0S.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r2 != 29) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AbstractC53892e0 A0d(X.AnonymousClass0M3 r10, X.C02580Cq r11) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A0d(X.0M3, X.0Cq):X.2e0");
    }

    public static AnonymousClass02N A0e(AbstractC007503q r4, C007003k r5) {
        int i;
        if (r4 == null) {
            return null;
        }
        if ((!r5.A09() && !AnonymousClass1VY.A0T(r5.A09)) || (i = r4.A08) == 6) {
            return null;
        }
        AnonymousClass02N A07 = r4.A07();
        if (A07 != null && (!r4.A0n.A02 || i == 6)) {
            return A07;
        }
        if (r4.A0n.A02) {
            return null;
        }
        StringBuilder A0S = AnonymousClass008.A0S("conversations_row/missing_rmt_src:");
        A0S.append(AnonymousClass0FI.A0B(r4));
        com.whatsapp.util.Log.e(A0S.toString());
        return null;
    }

    public static AnonymousClass02P A0f(AnonymousClass0M5 r4) {
        int i;
        String A0G = r4.A0G("v", null);
        if ("1".equals(A0G) || "2".equals(A0G)) {
            int parseInt = Integer.parseInt(A0G);
            String A0G2 = r4.A0G("type", null);
            if ("msg".equals(A0G2)) {
                i = 0;
            } else if ("pkmsg".equals(A0G2)) {
                i = 1;
            } else if ("skmsg".equals(A0G2)) {
                i = 2;
            } else if ("frskmsg".equals(A0G2)) {
                i = 3;
            } else {
                throw new AnonymousClass1XC(AnonymousClass008.A0K("invalid encrypted node type provided: ", A0G2));
            }
            return new AnonymousClass02P(parseInt, i, r4.A01);
        }
        throw new AnonymousClass1XC(AnonymousClass008.A0K("invalid encrypted node version provided: ", A0G));
    }

    public static AnonymousClass34B A0g(List list, Integer num, Long l, C02580Cq r9, AnonymousClass01K r10) {
        if (num == null || l == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC007503q A012 = r10.A0J.A01(((Number) it.next()).longValue());
                if (A012 instanceof AnonymousClass0M3) {
                    AnonymousClass0M3 r1 = (AnonymousClass0M3) A012;
                    if (!r1.A10()) {
                        return null;
                    }
                    arrayList.add(A0d(r1, r9));
                }
            }
        }
        return new AnonymousClass34B(arrayList, num.intValue(), l.longValue());
    }

    public static CharSequence A0h(C007003k r3, boolean z, AnonymousClass01I r5, C014308b r6, AnonymousClass01X r7) {
        String A06;
        Jid jid;
        if (z) {
            A06 = r7.A06(R.string.group_subject_changed_you_pronoun);
        } else if (r3 == null || (jid = r3.A09) == null || r5.A09(jid)) {
            A06 = "";
        } else {
            A06 = r6.A04(r3);
        }
        if (TextUtils.isEmpty(A06)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) A06);
        sb.append(": ");
        String obj = sb.toString();
        if (r7.A0M()) {
            return TextUtils.concat("‎", obj, String.valueOf((char) 8206));
        }
        return TextUtils.concat("‏", obj, String.valueOf((char) 8207));
    }

    public static CharSequence A0i(AnonymousClass0MP r1, AnonymousClass01X r2) {
        if (AnonymousClass0FI.A0q(r1) || AnonymousClass0FI.A0r(r1)) {
            return C002001d.A1W(r2, (long) ((AnonymousClass0M3) r1).A00);
        }
        int i = ((AnonymousClass0M3) r1).A00;
        if (i != 0) {
            return C002001d.A1W(r2, (long) i);
        }
        return C002001d.A1Y(r2, ((AnonymousClass0M3) r1).A01);
    }

    public static CharSequence A0j(CharSequence charSequence, C007003k r8, boolean z, AnonymousClass01I r10, C014308b r11, AnonymousClass01X r12) {
        CharSequence A0h = A0h(r8, z, r10, r11, r12);
        if (TextUtils.isEmpty(A0h)) {
            return charSequence;
        }
        if (AnonymousClass0SE.A0D(charSequence)) {
            return TextUtils.concat(A0h, "‎", charSequence, String.valueOf((char) 8206));
        }
        return TextUtils.concat(A0h, "‏", charSequence, String.valueOf((char) 8207));
    }

    public static CharSequence A0k(CharSequence charSequence, CharSequence charSequence2) {
        if (TextUtils.isEmpty(charSequence2)) {
            return charSequence;
        }
        if (AnonymousClass0SE.A0D(charSequence2)) {
            return TextUtils.concat(charSequence, "‎", charSequence2, String.valueOf((char) 8206));
        }
        return TextUtils.concat(charSequence, "‏", charSequence2, String.valueOf((char) 8207));
    }

    public static Object A0l(int i, AbstractC011306t r7, boolean z) {
        if (r7 == null || r7 == AnonymousClass1H5.A00) {
            return null;
        }
        boolean z2 = false;
        if (i == 1) {
            if (1 == ((Number) r7).intValue()) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        } else if (i == 2) {
            return Long.valueOf(((Number) r7).longValue());
        } else {
            if (i == 3) {
                return Float.valueOf(((Number) r7).floatValue());
            }
            if (i == 4) {
                return C008805h.A0b(r7);
            }
            if (i != 5) {
                AnonymousClass008.A0u("BloksFieldStatParser/parseValue/unknown type/type=", i);
                return null;
            }
            String str = (String) C008805h.A0b(r7);
            if (str == null) {
                return null;
            }
            String[] split = TextUtils.split(str, "\\|");
            int length = split.length;
            if (length == 2) {
                return z ? split[1] : Integer.valueOf(C006803i.A02(split[0], -1));
            }
            StringBuilder A0S = AnonymousClass008.A0S("BloksFieldStatParser/parseValue/invalid enum format/length=");
            A0S.append(length);
            com.whatsapp.util.Log.e(A0S.toString());
            return null;
        }
    }

    public static String A0n(int i, AnonymousClass01X r7) {
        if (i == -1) {
            return r7.A06(R.string.delete_all_media);
        }
        return r7.A0A(R.plurals.delete_medias, (long) i, Integer.valueOf(i));
    }

    public static String A0o(int i, AnonymousClass00Y r5) {
        String obj = UUID.randomUUID().toString();
        AnonymousClass21G r2 = new AnonymousClass21G();
        A1b(r2, 1, obj, i);
        r5.A0B(r2, null, false);
        return obj;
    }

    public static String A0p(Context context, AnonymousClass01X r10) {
        return r10.A0D(R.string.storage_usage_large_files_title, r10.A09(280, 5, String.format(context.getResources().getConfiguration().locale, "%d", 5L)));
    }

    public static String A0q(Uri uri) {
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append("-gallery_thumb");
        return sb.toString();
    }

    public static String A0r(AnonymousClass01X r2) {
        if (new AnonymousClass0R1(r2.A0I(), "#,#0.00").A00(1.0d).contains(",")) {
            return ",";
        }
        return ".";
    }

    public static String A0s(AnonymousClass01X r4, int i) {
        return r4.A0D(R.string.share_too_many_items_with_placeholder, Integer.valueOf(i));
    }

    public static String A0t(AnonymousClass01X r5, C014308b r6, AnonymousClass0AQ r7, AnonymousClass0ML r8, AnonymousClass34N r9) {
        int i;
        synchronized (r9) {
            i = r9.A02;
        }
        if (r9.A08()) {
            return r5.A06(R.string.unable_to_finish_download);
        }
        if (i == 9) {
            return r5.A06(R.string.unable_to_finish_download);
        }
        if (i == 4) {
            boolean A012 = AnonymousClass00C.A01();
            int i2 = R.string.insufficient_space_for_download_shared_storage;
            if (A012) {
                i2 = R.string.insufficient_space_for_download;
            }
            return r5.A06(i2);
        } else if (i == 5) {
            AnonymousClass02N r1 = r8.A0n.A00;
            if (AnonymousClass1VY.A0Y(r1) || AnonymousClass1VY.A0b(r1)) {
                r1 = r8.A0G;
            }
            if (r1 == null) {
                return r5.A06(R.string.invalid_url_for_download);
            }
            return r5.A0D(R.string.too_old_for_download, r6.A08(r7.A02(r1), false));
        } else if (i == 8) {
            return r5.A06(R.string.invalid_url_for_download);
        } else {
            if (i != 0) {
                return r5.A06(R.string.unable_to_finish_download);
            }
            return null;
        }
    }

    public static String A0u(AnonymousClass01X r4, C43761yu r5) {
        String str;
        String A06 = r4.A06(R.string.unknown);
        int i = r5.A01;
        if (i != 1) {
            str = i != 2 ? i != 3 ? i != 4 ? null : "Discover" : "American Express" : "MasterCard";
        } else {
            str = "Visa";
        }
        if (str == null) {
            return A06;
        }
        String A022 = AnonymousClass1VM.A02(r5.A00);
        if (A022 == null) {
            A022 = "";
        }
        String str2 = r5.A0A;
        if (str2 == null) {
            return str;
        }
        return AnonymousClass008.A0O(AnonymousClass008.A0a(str, " ", A022, " ", "•"), "•", A14(str2));
    }

    public static String A0v(AnonymousClass01X r3, AnonymousClass1VM r4) {
        if (r4 == null) {
            throw null;
        } else if (TextUtils.isEmpty(null) && r4.A01 == 2) {
            return r3.A06(R.string.payments_primary_payment_method);
        } else {
            return null;
        }
    }

    public static String A0w(AnonymousClass01X r2, AnonymousClass0ZC r3) {
        File file;
        AnonymousClass0M4 r0 = ((AnonymousClass0M3) r3).A02;
        if (r0 == null || (file = r0.A0F) == null) {
            return "";
        }
        int i = ((AnonymousClass0M3) r3).A00;
        if (i == 0) {
            i = C02230Bd.A08(file);
            ((AnonymousClass0M3) r3).A00 = i;
        }
        if (i != 0) {
            return C002001d.A1W(r2, (long) i);
        }
        return C002001d.A1Y(r2, ((AnonymousClass0M3) r3).A01);
    }

    public static String A0x(AnonymousClass1VI r4, AnonymousClass01X r5) {
        switch (r4.A06.ordinal()) {
            case 1:
                return r5.A0D(R.string.linked_device_name_platform_chrome, r4.A07);
            case 2:
                return r5.A0D(R.string.linked_device_name_platform_firefox, r4.A07);
            case 3:
                return r5.A0D(R.string.linked_device_name_platform_ie, r4.A07);
            case 4:
                return r5.A0D(R.string.linked_device_name_platform_opera, r4.A07);
            case 5:
                return r5.A0D(R.string.linked_device_name_platform_safari, r4.A07);
            case 6:
                return r5.A0D(R.string.linked_device_name_platform_edge, r4.A07);
            default:
                return r4.A07;
        }
    }

    public static String A0y(C01970Ad r4, AnonymousClass01X r5, AnonymousClass1VM r6) {
        if (r6 instanceof C43761yu) {
            return A0u(r5, (C43761yu) r6);
        }
        if (r6 instanceof C43801yy) {
            String A06 = r5.A06(R.string.unknown);
            String str = r6.A0A;
            String str2 = r6.A08;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return A06;
        }
        String A062 = r5.A06(R.string.unknown);
        String str3 = r6.A08;
        if (str3 != null) {
            String str4 = r6.A0A;
            if (str4 != null) {
                A062 = AnonymousClass008.A0L(str3, " ••", A14(str4));
            } else {
                A062 = str3;
            }
        }
        return r5.A0D(R.string.transaction_payment_method_info, A062, r5.A06(r4.A03().A86()));
    }

    public static String A0z(AnonymousClass0MP r11, AnonymousClass00S r12, AnonymousClass01A r13, C014308b r14, AnonymousClass01X r15) {
        String A1X = C002001d.A1X(r15, (long) Math.max(0, ((AnonymousClass0M3) r11).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        String A002 = AnonymousClass0OZ.A00(r15, r12.A06(r11.A0E));
        boolean z = false;
        if (((AbstractC007503q) r11).A04 == 1) {
            z = true;
        }
        if (r11.A0n.A02) {
            int i = ((AbstractC007503q) r11).A08;
            if (i == 1) {
                int i2 = R.string.audio_message_description_sent_pending;
                if (z) {
                    i2 = R.string.voice_message_description_sent_pending;
                }
                return r15.A0D(i2, A1X, A002);
            } else if (i == 5) {
                int i3 = R.string.audio_message_description_sent_delivered;
                if (z) {
                    i3 = R.string.voice_message_description_sent_delivered;
                }
                return r15.A0D(i3, A1X, A002);
            } else if (i == 13) {
                int i4 = R.string.audio_message_description_sent_read;
                if (z) {
                    i4 = R.string.voice_message_description_sent_read;
                }
                return r15.A0D(i4, A1X, A002);
            } else if (i == 8) {
                return r15.A0D(R.string.voice_message_description_sent_played, A1X, A002);
            } else {
                int i5 = R.string.audio_message_description_sent;
                if (z) {
                    i5 = R.string.voice_message_description_sent;
                }
                return r15.A0D(i5, A1X, A002);
            }
        } else {
            UserJid A08 = r11.A08();
            if (A08 != null) {
                String A06 = r14.A06(r13.A0A(A08));
                int i6 = ((AbstractC007503q) r11).A08;
                if (i6 == 9 || i6 == 10) {
                    int i7 = R.string.audio_message_description_played;
                    if (z) {
                        i7 = R.string.voice_message_description_played;
                    }
                    return r15.A0D(i7, A06, A1X, A002);
                } else if (z) {
                    if (((AnonymousClass0M3) r11).A02.A0F == null) {
                        return r15.A0D(R.string.voice_message_download_description, A06, A1X, A002, AnonymousClass0FI.A0A(r15, ((AnonymousClass0M3) r11).A01));
                    }
                    return r15.A0D(R.string.voice_message_description, A06, A1X, A002);
                } else if (((AnonymousClass0M3) r11).A02.A0F == null) {
                    return r15.A0D(R.string.audio_message_download_description, A06, A1X, A002, AnonymousClass0FI.A0A(r15, ((AnonymousClass0M3) r11).A01));
                } else {
                    return r15.A0D(R.string.audio_message_description, A06, A1X, A002);
                }
            } else {
                throw null;
            }
        }
    }

    public static String A10(C02850Ds r8, boolean z, AnonymousClass00S r10, AnonymousClass01X r11, AnonymousClass01S r12) {
        long A05;
        if (!z) {
            return r11.A06(R.string.live_location_sharing_ended);
        }
        long j = r8.A0E + ((long) (r8.A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        if (r8.A0n.A02) {
            A05 = r12.A06(r8);
        } else {
            A05 = r12.A05(r8);
        }
        long A06 = r10.A06(A05);
        int i = (A05 > r10.A05() ? 1 : (A05 == r10.A05() ? 0 : -1));
        Object[] objArr = new Object[1];
        if (i > 0) {
            objArr[0] = AnonymousClass0OZ.A00(r11, A06);
            return AnonymousClass0OZ.A01(r11, r11.A0D(R.string.live_location_live_until, objArr), A06);
        }
        objArr[0] = AnonymousClass0OZ.A00(r11, j);
        return AnonymousClass0OZ.A01(r11, r11.A0D(R.string.live_location_live_until, objArr), j);
    }

    public static String A11(AnonymousClass0K4 r4, AnonymousClass01X r5) {
        String str = r4.A08;
        if (str == null) {
            return r4.A09;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        switch (lowerCase.hashCode()) {
            case -1361128838:
                if (lowerCase.equals("chrome")) {
                    return r5.A0D(R.string.linked_device_name_platform_chrome, r4.A09);
                }
                break;
            case -909897856:
                if (lowerCase.equals("safari")) {
                    return r5.A0D(R.string.linked_device_name_platform_safari, r4.A09);
                }
                break;
            case -849452327:
                if (lowerCase.equals("firefox")) {
                    return r5.A0D(R.string.linked_device_name_platform_firefox, r4.A09);
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    return r5.A0D(R.string.linked_device_name_platform_ie, r4.A09);
                }
                break;
            case 3108285:
                if (lowerCase.equals("edge")) {
                    return r5.A0D(R.string.linked_device_name_platform_edge, r4.A09);
                }
                break;
            case 105948115:
                if (lowerCase.equals("opera")) {
                    return r5.A0D(R.string.linked_device_name_platform_opera, r4.A09);
                }
                break;
        }
        return r4.A09;
    }

    public static String A12(String str) {
        MessageFormat messageFormat;
        String[] strArr;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String replaceAll = str.replaceAll("[^\\d]", "");
        int length = replaceAll.length();
        int i = 4;
        if (replaceAll.startsWith("0800") && length == 11) {
            messageFormat = new MessageFormat("{0}-{1}-{2}");
            strArr = new String[]{replaceAll.substring(0, 4), replaceAll.substring(4, 7), replaceAll.substring(7)};
        } else if (length == 10 || length == 11) {
            messageFormat = new MessageFormat("{0} {1}-{2}");
            strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 6), replaceAll.substring(6)};
        } else if (length == 12) {
            messageFormat = new MessageFormat("{0}-{1}-{2}-{3}");
            strArr = new String[]{replaceAll.substring(0, 2), replaceAll.substring(2, 4), replaceAll.substring(4, 8), replaceAll.substring(8)};
        } else if (length != 8 && length != 9) {
            return str;
        } else {
            messageFormat = new MessageFormat("{0}-{1}");
            strArr = new String[2];
            int i2 = 4;
            if (length == 9) {
                i2 = 5;
            }
            strArr[0] = replaceAll.substring(0, i2);
            if (length == 9) {
                i = 5;
            }
            strArr[1] = replaceAll.substring(i);
        }
        return messageFormat.format(strArr);
    }

    public static String A13(String str) {
        if (!str.startsWith("whatsapp:user-notice")) {
            return "open-link";
        }
        StringBuilder sb = new StringBuilder("h://");
        sb.append(str);
        String queryParameter = Uri.parse(sb.toString()).getQueryParameter("action");
        return queryParameter == null ? "" : queryParameter;
    }

    public static String A14(String str) {
        int length = str.length();
        if (length > 4) {
            str = str.substring(length - 4);
        }
        int i = 0;
        int length2 = str.length();
        int i2 = length2 - 1;
        while (i2 >= 0 && Character.isDigit(str.charAt(i2))) {
            i++;
            i2--;
        }
        if (i == length2) {
            return str;
        }
        return str.substring(length2 - i);
    }

    public static String A15(String str) {
        if (str == null) {
            return null;
        }
        try {
            return A19(new URL(str));
        } catch (MalformedURLException e) {
            com.whatsapp.util.Log.w("redactedversion/not-url", e);
            int length = str.length();
            if (length <= 25) {
                return "***";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, length - 25));
            sb.append("***");
            return sb.toString();
        }
    }

    public static String A16(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        return AnonymousClass008.A0N(AnonymousClass008.A0S("[data localized "), str.getBytes().length, " bytes]");
    }

    public static String A17(String str) {
        return (TextUtils.isEmpty(str) || !str.contains("@")) ? "" : "SCRUBBED-VPA";
    }

    public static String A18(StringBuilder sb, Formatter formatter, long j) {
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j2 = (j + 500) / 1000;
        long j3 = j2 % 60;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 / 3600;
        sb.setLength(0);
        if (j5 > 0) {
            return formatter.format("%d:%02d:%02d", Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString();
        }
        return formatter.format("%02d:%02d", Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String A19(URL url) {
        String str;
        int length;
        if (url == null) {
            return null;
        }
        String path = url.getPath();
        if (path == null || (length = path.length()) <= 25) {
            str = "";
        } else {
            str = path.substring(0, length - 25);
        }
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder authority = builder.scheme(url.getProtocol()).authority(url.getHost());
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("***");
        if (path != null) {
            sb.append(path.substring(path.length() - 4));
            authority.path(sb.toString()).encodedQuery(url.getQuery());
            return builder.build().toString();
        }
        throw null;
    }

    public static String A1A(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            formatter.format("%02x ", Byte.valueOf(bArr[i]));
        }
        return formatter.toString();
    }

    public static Date A1B(String str) {
        AnonymousClass00E.A03(str);
        try {
            return new SimpleDateFormat("dd/MM/yyyy", Locale.US).parse(str);
        } catch (ParseException e) {
            com.whatsapp.util.Log.e("Couldn't parse the date", e);
            return null;
        }
    }

    public static Map A1C(String str) {
        HashMap hashMap = new HashMap();
        if (!str.startsWith("whatsapp:user-notice")) {
            hashMap.put("link", str);
            return hashMap;
        }
        StringBuilder sb = new StringBuilder("h://");
        sb.append(str);
        Uri parse = Uri.parse(sb.toString());
        for (String str2 : parse.getQueryParameterNames()) {
            if (!"action".equals(str2)) {
                hashMap.put(str2, parse.getQueryParameter(str2));
            }
        }
        return hashMap;
    }

    public static Cipher A1D(byte[] bArr, byte[] bArr2, int i) {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr));
            return instance;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            throw new AssertionError(e);
        }
    }

    public static Mac A1E(byte[] bArr, byte[] bArr2) {
        try {
            Mac instance = Mac.getInstance("HmacSHA256");
            instance.init(new SecretKeySpec(bArr2, "HmacSHA256"));
            instance.update(bArr);
            return instance;
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public static SSLSocketFactory A1F() {
        SSLContext sSLContext;
        if (Build.VERSION.SDK_INT >= 21) {
            return (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
        try {
            sSLContext = SSLContext.getInstance("Default");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = null;
        }
        if (sSLContext != null) {
            return sSLContext.getSocketFactory();
        }
        com.whatsapp.util.Log.i("socketfactoryutil/failed to create clean sslcontext for prelollipop devices");
        return (SSLSocketFactory) SSLSocketFactory.getDefault();
    }

    public static short A1G(byte[] bArr, int i) {
        byte b = bArr[i];
        return (short) ((bArr[i + 1] & 255) | ((b << 8) & 65280));
    }

    public static void A1H() {
        if (A02 == null || A01 == null) {
            C42901xT r2 = C42901xT.A00;
            A01 = C42911xU.A00;
            HashMap hashMap = new HashMap();
            A02 = hashMap;
            hashMap.put(AnonymousClass05n.class, r2);
        }
    }

    public static void A1I() {
        C04700Lk.A01(new int[]{R.plurals.app_auth_enabled_values, 0, R.plurals.app_auth_timeout_values, 1, R.plurals.broadcast_n_recipients, 2, R.plurals.broadcast_reach_limit, 3, R.plurals.bulk_archive, 4, R.plurals.bulk_conversations_archived_confirmation, 5, R.plurals.bulk_delete, 6, R.plurals.bulk_delete_conversations, 7, R.plurals.bulk_exit, 8, R.plurals.bulk_leave_conversations, 9, R.plurals.bulk_pin, 10, R.plurals.bulk_unarchive, 11, R.plurals.bulk_unpin, 12, R.plurals.cannot_pin, 13, R.plurals.catalog_send_product_message, 14, R.plurals.change_number_n_contacts, 15, R.plurals.confirm_send_audios, 16, R.plurals.confirm_send_documents_title, 17, R.plurals.confirm_sharing_multiple_title, 18, R.plurals.contact_array_message_reach_limit, 19, R.plurals.contact_info_live_location_description, 20, R.plurals.contact_info_live_location_description_you_and_other_people_are_sharing, 21, R.plurals.contact_name_and_number_of_messages, 22, R.plurals.contact_too_large, 23, R.plurals.contacts_array_title, 24, R.plurals.delete_confirmation_multiple, 25, R.plurals.delete_contact_with_unsent_dialog_title, 26, R.plurals.delete_medias, 27, R.plurals.delete_status_confirmation_multiple, 28, R.plurals.description_reach_limit, 29, R.plurals.ephemeral_more_info_content_in_days, 30, R.plurals.ephemeral_more_info_content_in_hours, 31, R.plurals.ephemeral_more_info_content_in_minutes, 32, R.plurals.ephemeral_more_info_content_in_seconds, 33, R.plurals.ephemeral_setting_enabled_by_name_in_days, 34, R.plurals.ephemeral_setting_enabled_by_name_in_days_tap_to_change, 35, R.plurals.ephemeral_setting_enabled_by_name_in_hours, 36, R.plurals.ephemeral_setting_enabled_by_name_in_hours_tap_to_change, 37, R.plurals.ephemeral_setting_enabled_by_name_in_minutes, 38, R.plurals.ephemeral_setting_enabled_by_name_in_minutes_tap_to_change, 39, R.plurals.ephemeral_setting_enabled_by_name_in_seconds, 40, R.plurals.ephemeral_setting_enabled_by_name_in_seconds_tap_to_change, 41, R.plurals.ephemeral_setting_enabled_by_you_in_days, 42, R.plurals.ephemeral_setting_enabled_by_you_in_days_tap_to_change, 43, R.plurals.ephemeral_setting_enabled_by_you_in_hours, 44, R.plurals.ephemeral_setting_enabled_by_you_in_hours_tap_to_change, 45, R.plurals.ephemeral_setting_enabled_by_you_in_minutes, 46, R.plurals.ephemeral_setting_enabled_by_you_in_minutes_tap_to_change, 47, R.plurals.ephemeral_setting_enabled_by_you_in_seconds, 48, R.plurals.ephemeral_setting_enabled_by_you_in_seconds_tap_to_change, 49, R.plurals.ephemeral_setting_enabled_in_days, 50, R.plurals.ephemeral_setting_enabled_in_days_tap_to_change, 51, R.plurals.ephemeral_setting_enabled_in_hours, 52, R.plurals.ephemeral_setting_enabled_in_hours_tap_to_change, 53, R.plurals.ephemeral_setting_enabled_in_minutes, 54, R.plurals.ephemeral_setting_enabled_in_minutes_tap_to_change, 55, R.plurals.ephemeral_setting_enabled_in_seconds, 56, R.plurals.ephemeral_setting_enabled_in_seconds_tap_to_change, 57, R.plurals.ephemeral_setting_in_days, 58, R.plurals.ephemeral_setting_in_hours, 59, R.plurals.ephemeral_setting_in_minutes, 60, R.plurals.ephemeral_setting_in_seconds, 61, R.plurals.error_adding_participant_408_multi, 62, R.plurals.error_image_dimensions_too_small, 63, R.plurals.exit_group_with_unsent_dialog_title, 64, R.plurals.failed_announcement_group_revert, 65, R.plurals.failed_statuses, 66, R.plurals.fanout_group_voip_call_subtitle_invited, 67, R.plurals.fanout_group_voip_call_subtitle_joined, 68, R.plurals.file_was_removed, 69, R.plurals.first_status_excluded_contacts, 70, R.plurals.first_status_selected_contacts, 71, R.plurals.gdpr_report_footer, 72, R.plurals.gdrive_messages_restored_with_media_to_restore, 73, R.plurals.gdrive_messages_restored_with_no_media_to_restore, 74, R.plurals.group_add_blacklist_contacts_excluded, 75, R.plurals.group_add_privacy_failure_prompt_invite, 76, R.plurals.group_call_participant_picker_sheet_title, 77, R.plurals.group_confirm_send_audios, 78, R.plurals.group_confirm_send_documents_title, 79, R.plurals.group_confirm_sharing_multiple_title, 80, R.plurals.group_invites_sent, 81, R.plurals.group_members_not_shown_message, 82, R.plurals.group_participant_demoted_names, 83, R.plurals.group_participant_promoted_names, 84, R.plurals.group_participants_you_invited_names, 85, R.plurals.group_voip_call_participants_label, 86, R.plurals.groupcall_reach_limit, 87, R.plurals.groupchat_reach_limit, 88, R.plurals.have_vcard_for_sender, 89, R.plurals.hfm_multicast_limit_reached_with_faq, 90, R.plurals.hfm_multicast_limit_reached_with_faq_updated, 91, R.plurals.invite_expires_days, 92, R.plurals.invite_used_from_admin_user_plural, 93, R.plurals.list_recipients_added, 94, R.plurals.list_recipients_removed, 95, R.plurals.live_location_currently_sharing, 96, R.plurals.live_location_marker_content_description, 97, R.plurals.live_location_marker_title, 98, R.plurals.live_location_stopped_sharing_count, 99, R.plurals.location_accuracy, 100, R.plurals.max_files_to_send_error_message, 101, R.plurals.message_forward_count, 102, R.plurals.messages_copied, 103, R.plurals.messages_deleted, 104, R.plurals.missed_calls, 105, R.plurals.missed_voice_calls, 106, R.plurals.multicast_reach_limit, 107, R.plurals.n_contacts, 108, R.plurals.n_contacts_message_title, 109, R.plurals.n_contacts_must_be_selected, 110, R.plurals.n_contacts_selected, 111, R.plurals.n_items_selected, 112, R.plurals.n_more, 113, R.plurals.n_of_m_contacts_selected, 114, R.plurals.n_selected, 115, R.plurals.names_others, 116, R.plurals.network_usage_message_count, 117, R.plurals.network_usage_status_count, 118, R.plurals.network_usage_voip_call_count, 119, R.plurals.notification_new_message, 120, R.plurals.notification_new_message_from_multiple_contacts_1, 121, R.plurals.notification_new_message_from_multiple_contacts_2, 122, R.plurals.notification_new_payment_method_update, 123, R.plurals.notify_contacts_change_number_reach_limit, 124, R.plurals.number_of_items, 125, R.plurals.number_of_pages, 126, R.plurals.number_of_photos, 127, R.plurals.number_of_sheets, 128, R.plurals.number_of_slides, 129, R.plurals.number_of_videos, 130, R.plurals.number_of_views, 131, R.plurals.nux_abbreviated_prompt, 132, R.plurals.nux_one_more_contact_prompt, 133, R.plurals.nux_three_more_contact_prompt, 134, R.plurals.nux_two_more_contact_prompt, 135, R.plurals.participants_remaining, 136, R.plurals.participants_title, 137, R.plurals.payments_message_bubble_status_label_desc_expiration, 138, R.plurals.payments_request_message_generic_success, 139, R.plurals.payments_request_message_generic_success_sent_by_you, 140, R.plurals.payments_request_message_generic_success_to_you, 141, R.plurals.payments_request_received_notif_without_mentioning_sender, 142, R.plurals.payments_request_received_to_you_notif_without_mentioning_sender, 143, R.plurals.payments_transaction_message_generic_success, 144, R.plurals.payments_transaction_message_generic_success_from_you, 145, R.plurals.payments_transaction_message_generic_success_to_you, 146, R.plurals.payments_transaction_message_to_me, 147, R.plurals.payments_transaction_message_to_me_needs_accept, 148, R.plurals.payments_transaction_received_notif_pending_setup_without_mentioning_sender, 149, R.plurals.payments_transaction_received_notif_without_mentioning_sender, 150, R.plurals.payments_transaction_received_notif_without_mentioning_sender_to_you, 151, R.plurals.payments_transaction_system_message_to_me_pending_setup, 152, R.plurals.pin_toast, 153, R.plurals.products_total_quantity, 154, R.plurals.pushname_blacklisted_emoji_error, 155, R.plurals.recipients_title, 156, R.plurals.register_voice_input_error_length_error, 157, R.plurals.reporting_flow_with_specified_messages_for_1_on_1, 158, R.plurals.reporting_flow_with_specified_messages_for_1_on_1_with_business, 159, R.plurals.reporting_flow_with_specified_messages_for_group, 160, R.plurals.resend_messages_from_date, 161, R.plurals.resend_messages_from_yesterday, 162, R.plurals.send_contacts, 163, R.plurals.send_status_contacts_excluded, 164, R.plurals.send_status_contacts_selected, 165, R.plurals.sending_audios_to_contact, 166, R.plurals.sending_audios_to_contacts, 167, R.plurals.sending_files_to_contact, 168, R.plurals.sending_files_to_contacts, 169, R.plurals.sending_gifs_to_contact, 170, R.plurals.sending_gifs_to_contacts, 171, R.plurals.sending_statuses, 172, R.plurals.sending_videos_to_contact, 173, R.plurals.sending_videos_to_contacts, 174, R.plurals.settings_gdrive_video_size_already_uploaded_plural, 175, R.plurals.settings_gdrive_video_size_to_be_uploaded_plural, 176, R.plurals.settings_network_usage_calls_info_incoming, 177, R.plurals.settings_network_usage_calls_info_outgoing, 178, R.plurals.settings_network_usage_messages_info_received, 179, R.plurals.settings_network_usage_messages_info_sent, 180, R.plurals.settings_network_usage_status_info_received, 181, R.plurals.settings_network_usage_status_info_sent, 182, R.plurals.software_about_to_expire, 183, R.plurals.status_contacts_excluded, 184, R.plurals.status_contacts_selected, 185, R.plurals.status_update_exceeds_character_limit, 186, R.plurals.statuses_deleted, 187, R.plurals.stop_share_btn_label, 188, R.plurals.storage_usage_chats_taking_less_space, 189, R.plurals.storage_usage_delete_completed_text, 190, R.plurals.storage_usage_delete_dialog_duplicate_item_subtitle, 191, R.plurals.storage_usage_delete_dialog_subtitle, 192, R.plurals.storage_usage_delete_messages_title, 193, R.plurals.storage_usage_detail_clear_messages_confirmation, 195, R.plurals.storage_usage_detail_clear_messages_confirmation_title, 196, R.plurals.storage_usage_detail_delete_items, 197, R.plurals.storage_usage_detail_delete_items_confirmation, 198, R.plurals.storage_usage_detail_delete_items_confirmation_title, 199, R.plurals.storage_usage_free_space, 200, R.plurals.storage_usage_used_space, 201, R.plurals.subject_reach_limit, 202, R.plurals.suspicious_links_label, 203, R.plurals.tb_ephemeral_chat_expiration_in_days, 204, R.plurals.tb_ephemeral_chat_expiration_in_hours, 205, R.plurals.tb_ephemeral_chat_expiration_in_minutes, 206, R.plurals.tb_ephemeral_chat_expiration_in_seconds, 207, R.plurals.text_limit_characters_remaining_description, 208, R.plurals.text_status_truncation_info, 209, R.plurals.time_left, 210, R.plurals.total_items, 211, R.plurals.transaction_status_collect_success_receiver, 212, R.plurals.transaction_status_collect_success_sender, 213, R.plurals.transaction_status_pending_receiver_setup, 214, R.plurals.transaction_status_pending_setup, 215, R.plurals.unpin_toast, 216, R.plurals.unread_message_count, 217, R.plurals.unsent_messages_in_selection, 218, R.plurals.unstar_while_clearing_error, 219, R.plurals.verify_identity_tip_both_multiple_device, 220, R.plurals.verify_identity_tip_contact_multiple_device, 221, R.plurals.verify_resend_sms_button_disabled_hours, 222, R.plurals.verify_voice_call_button_disabled_hours, 223, R.plurals.video_missed_calls, 224, R.plurals.video_status_truncation_info, 225, R.plurals.view_contacts_title, 226, R.plurals.viewed_by, 227, R.plurals.voip_call_info_invited_participants_title, 228, R.plurals.voip_call_info_joined_participants_title, 229, R.plurals.voip_error_add_four_or_more_participant_failed_dialog_title, 230, R.plurals.voip_error_add_participant_failed_dialog_title, 231, R.plurals.voip_error_group_call_size_not_supported, 232, R.plurals.voip_error_multiple_participant_group_call_size_not_supported, 233, R.plurals.voip_error_one_participant_group_call_size_not_supported, 234, R.plurals.voip_group_call_not_supported_plural, 235, R.plurals.voip_group_call_reach_maximum, 236, R.plurals.voip_not_allowed_at_this_time_plural, 237, R.plurals.you_created_list, 238, R.plurals.you_created_list_unnamed, 239, R.plurals.your_invite_used_by_user_plural, 240, R.string.about_business_title, 241, R.string.about_logo_content_description, 242, R.string.about_update_no_network, 243, R.string.accept_button_description, 244, R.string.accept_button_label, 245, R.string.accept_invite_link_already_in_group, 246, R.string.accept_upgrade_button_description, 247, R.string.accepted_on_another_device, 248, R.string.accessibility_action_camera_focus, 249, R.string.accessibility_action_click_change_group_subject, 250, R.string.accessibility_action_click_change_mute_settings, 251, R.string.accessibility_action_click_conversation_title_for_broadcast_list_info, 252, R.string.accessibility_action_click_conversation_title_for_contact_info, 253, R.string.accessibility_action_click_conversation_title_for_group_info, 254, R.string.accessibility_action_click_more_actions_on_participant, 255, R.string.accessibility_action_click_remove, 256, R.string.accessibility_action_click_selected_contact_to_deselect, 257, R.string.accessibility_action_contact_picker_profile_photo_click, 258, R.string.accessibility_action_long_click_record_voice_message, 259, R.string.accessibility_action_long_click_select_messages, 260, R.string.accessibility_action_long_click_selected_chat_to_deselect, 261, R.string.accessibility_action_long_click_sticker_store_reorder_pack, 262, R.string.accessibility_announcement_business_category_item_deselected, 263, R.string.accessibility_announcement_business_category_item_selected, 264, R.string.accessibility_announcement_chat_deselected, 265, R.string.accessibility_contact_long_press, 266, R.string.accessibility_content_description_message_information, 267, R.string.accessibility_description_mute_notification, 268, R.string.accessibility_description_video_preview_timeline_edit, 269, R.string.accessibility_forwarded_many_times, 270, R.string.accessibility_hide_muted_statuses_prompt, 271, R.string.accessibility_my_qr_code, 272, R.string.accessibility_role_button, 273, R.string.accessibility_show_muted_statuses_prompt, 274, R.string.accessible_welcome_calls_message, 275, R.string.account_settings_description, 276, R.string.account_sync_acct_added, 277, R.string.account_sync_add, 278, R.string.account_sync_authenticating, 279, R.string.account_sync_message_detail_format, 280, R.string.account_sync_video_call_detail_format, 281, R.string.account_sync_voip_call_detail_format, 282, R.string.action_open_image, 283, R.string.action_open_photo_album, 284, R.string.action_search_web, 285, R.string.activity_gdrive_media_will_be_downloaded_later_notice, 286, R.string.activity_gdrive_restore_messages_paused_message, 287, R.string.activity_gdrive_restore_messages_preparation_message, 288, R.string.activity_google_drive_restore_title, 289, R.string.activity_google_drive_title, 290, R.string.activity_not_found, 291, R.string.add_broadcast_recipient, 292, R.string.add_caption, 293, R.string.add_contact, 294, R.string.add_contact_as_new_or_existing, 295, R.string.add_contact_button, 296, R.string.add_contact_description, 297, R.string.add_contact_short, 298, R.string.add_contacts_to_notify_change_number, 299, R.string.add_exist, 300, R.string.add_group_description, 301, R.string.add_info, 302, R.string.add_media, 303, R.string.add_more, 304, R.string.add_paticipants, 305, R.string.add_shortcut, 306, R.string.add_shortcut_short, 307, R.string.add_star, 308, R.string.add_subject, 309, R.string.add_third_party_sticker_pack_positive, 310, R.string.add_third_party_sticker_pack_with_app, 311, R.string.add_to_status, 312, R.string.additional_participant_count, 313, R.string.adjust_date, 314, R.string.alert, 315, R.string.all_gifs, 316, R.string.all_images, 317, R.string.all_media, 318, R.string.all_videos, 319, R.string.allow, 320, R.string.android_wear_cant_talk, 321, R.string.android_wear_haha, 322, R.string.android_wear_lol, 323, R.string.android_wear_nice, 324, R.string.android_wear_no, 325, R.string.android_wear_ok, 326, R.string.android_wear_on_my_way, 327, R.string.android_wear_see_you_soon, 328, R.string.android_wear_thanks, 329, R.string.android_wear_yes, 330, R.string.answer_the_call, 331, R.string.app_auth_disabled, 332, R.string.app_auth_enabled_immediately, 333, R.string.app_auth_locked_title, 334, R.string.app_auth_lockout_error, 335, R.string.app_auth_lockout_error_short, 336, R.string.app_auth_timeout_immediately, 337, R.string.app_locked_biometric_prompt_title, 338, R.string.approach_nfc_tag, 339, R.string.archive_all_chats_ask, 340, R.string.archive_broadcast, 341, R.string.archive_conversation, 342, R.string.archived, 343, R.string.archived_chats, 344, R.string.archived_chats_count, 345, R.string.ask_for_price, 346, R.string.ask_for_total, 347, R.string.attach, 348, R.string.attach_audio, 349, R.string.attach_camera, 350, R.string.attach_contact, 351, R.string.attach_document, 352, R.string.attach_invoice, 353, R.string.attach_location, 354, R.string.attach_picture_from_gallery, 355, R.string.attach_product, 356, R.string.audio_call, 357, R.string.audio_call_confirmation_text, 358, R.string.audio_icon_description, 359, R.string.audio_message_description, 360, R.string.audio_message_description_played, 361, R.string.audio_message_description_sent, 362, R.string.audio_message_description_sent_delivered, 363, R.string.audio_message_description_sent_pending, 364, R.string.audio_message_description_sent_read, 365, R.string.audio_message_download_description, 366, R.string.audio_nothing_found, 367, R.string.audio_picker_row_content_description, 368, R.string.audio_picker_row_content_description_no_artist, 369, R.string.audio_picker_selected_row_content_description, 370, R.string.audio_picker_selected_row_content_description_no_artist, 371, R.string.audio_video_selector_label, 372, R.string.back, 373, R.string.background_color_description, 374, R.string.backspace, 375, R.string.backup, 376, R.string.backup_gdrive_no_account_selected_error, 377, R.string.biometric_prompt_negative_button, 378, R.string.biometric_prompt_title, 379, R.string.biz_app_education_data_info, 380, R.string.biz_app_education_description_1, 381, R.string.biz_app_education_description_2, 382, R.string.biz_app_education_install_button, 383, R.string.biz_app_education_sub_heading_1, 384, R.string.biz_app_education_sub_heading_2, 385, R.string.biz_app_education_subtitle, 386, R.string.biz_app_education_title, 387, R.string.biz_block_reason_did_not_sign_up, 388, R.string.biz_block_reason_no_longer_interested, 389, R.string.biz_block_reason_offensive, 390, R.string.biz_block_reason_spam, 391, R.string.biz_profile_education_description_1, 392, R.string.biz_profile_education_description_2, 393, R.string.biz_profile_education_title, 394, R.string.biz_profile_education_title_upsell_description, 395, R.string.biz_profile_education_upsell_button, 396, R.string.biz_profile_education_upsell_title, 397, R.string.block, 398, R.string.block_ask, 399, R.string.block_ask_business, 400, R.string.block_biz_with_reason, 401, R.string.block_confirmation, 402, R.string.block_description, 403, R.string.block_dialog_loading, 404, R.string.block_list_businesses_header, 405, R.string.block_list_contacts_header, 406, R.string.block_list_desc, 407, R.string.block_list_header, 408, R.string.block_list_help, 409, R.string.block_list_info, 410, R.string.block_list_menu_unblock, 411, R.string.block_list_payments_header, 412, R.string.block_timeout, 413, R.string.blocked_business_system_message, 414, R.string.blocked_business_system_message_conversation_list, 415, R.string.blocked_contact_system_message, 416, R.string.blocked_contact_system_message_conversation_list, 417, R.string.blocked_title, 418, R.string.blue_alert_bsp_premise, 419, R.string.blue_alert_consumer_to_self_premise_unverified, 420, R.string.blue_alert_self_fb_or_fb_and_other_verified, 421, R.string.blue_alert_self_premise_unverified, 422, R.string.blue_alert_self_premise_verified, 423, R.string.blue_alert_self_premise_verified_contact_mismatch, 424, R.string.blue_alert_verified, 425, R.string.blue_alert_verified_contact_mismatch, 426, R.string.blue_alert_verified_to_unverified, 427, R.string.blue_msg_bsp_fb_to_bsp_premise, 428, R.string.blue_msg_bsp_fb_to_self_fb, 429, R.string.blue_msg_bsp_fb_to_self_premise, 430, R.string.blue_msg_bsp_fb_unverified, 431, R.string.blue_msg_bsp_fb_unverified_to_bsp_premise_verified, 432, R.string.blue_msg_bsp_fb_unverified_to_bsp_premise_verified_contact_mismatch, 433, R.string.blue_msg_bsp_fb_unverified_to_self_fb_verified, 434, R.string.blue_msg_bsp_fb_unverified_to_self_fb_verified_contact_mismatch, 435, R.string.blue_msg_bsp_fb_unverified_to_self_premise_verified, 436, R.string.blue_msg_bsp_fb_verified, 437, R.string.blue_msg_bsp_fb_verified_contact_mismatch, 438, R.string.blue_msg_bsp_fb_verified_to_bsp_premise_unverified, 439, R.string.blue_msg_bsp_fb_verified_to_self_fb_unverified, 440, R.string.blue_msg_bsp_fb_verified_to_self_premise_unverified, 441, R.string.blue_msg_bsp_premise_to_self_premise, 442, R.string.blue_msg_bsp_premise_unverified, 443, R.string.blue_msg_bsp_premise_unverified_to_self_premise_verified, 444, R.string.blue_msg_bsp_premise_verified, 445, R.string.blue_msg_bsp_premise_verified_contact_mismatch, 446, R.string.blue_msg_bsp_premise_verified_to_self_premise_unverified, 447, R.string.blue_msg_consumer_to_bsp_fb_unverified, 448, R.string.blue_msg_consumer_to_bsp_premise_unverified, 449, R.string.blue_msg_consumer_to_self_fb_unverified, 450, R.string.blue_msg_consumer_to_self_premise_unverified, 451, R.string.blue_msg_self_fb_to_bsp_premise, 452, R.string.blue_msg_self_fb_to_self_premise, 453, R.string.blue_msg_self_fb_unverified, 454, R.string.blue_msg_self_fb_unverified_to_bsp_premise_verified, 455, R.string.blue_msg_self_fb_unverified_to_bsp_premise_verified_contact_mismatch, 456, R.string.blue_msg_self_fb_unverified_to_self_premise_verified, 457, R.string.blue_msg_self_fb_verified, 458, R.string.blue_msg_self_fb_verified_contact_mismatch, 459, R.string.blue_msg_self_fb_verified_to_bsp_premise_unverified, 460, R.string.blue_msg_self_fb_verified_to_self_premise_unverified, 461, R.string.blue_msg_self_premise_to_bsp_premise, 462, R.string.blue_msg_self_premise_unverified, 463, R.string.blue_msg_self_premise_verified, 464, R.string.blue_msg_to_bsp_fb, 465, R.string.blue_msg_to_consumer, 466, R.string.blue_msg_to_self_fb, 467, R.string.blue_msg_unverified_to_bsp_fb_verified, 468, R.string.blue_msg_unverified_to_bsp_fb_verified_contact_mismatch, 469, R.string.blue_msg_unverified_to_bsp_premise_verified, 470, R.string.blue_msg_unverified_to_bsp_premise_verified_contact_mismatch, 471, R.string.blue_msg_unverified_to_self_fb_verified, 472, R.string.blue_msg_unverified_to_self_fb_verified_contact_mismatch, 473, R.string.blue_msg_unverified_to_verified, 474, R.string.blue_msg_verified_to_bsp_fb_unverified, 475, R.string.blue_msg_verified_to_bsp_premise_unverified, 476, R.string.blue_msg_verified_to_self_fb_unverified, 477, R.string.blue_msg_verified_to_unverified, 478, R.string.broadcast_to_recipients_note, 480, R.string.broadcasts, 481, R.string.browse_documents, 482, R.string.btn_continue, 483, R.string.btn_play_store, 484, R.string.btn_storage_settings, 485, R.string.btn_uninstall, 486, R.string.business_account_syncing_from_fb_page, 487, R.string.business_category_separator, 488, R.string.business_details, 489, R.string.business_details_subtitle_address, 490, R.string.business_details_subtitle_category, 491, R.string.business_details_subtitle_email, 492, R.string.business_details_subtitle_hours, 493, R.string.business_details_subtitle_instagram, 494, R.string.business_details_subtitle_website, 495, R.string.business_details_subtitle_websites, 496, R.string.business_edit_profile_loading, 497, R.string.business_hours_day_closed, 498, R.string.business_hours_day_mode_appointment_only, 499, R.string.business_hours_day_mode_open_24h, 500, R.string.business_info_address_book_name_verification_status_verified, 501, R.string.business_info_confirmed_address_book_missing, 502, R.string.business_info_confirmed_address_book_no_match, 503, R.string.business_info_official_business_account, 504, R.string.business_info_verification_status_confirmed, 505, R.string.business_info_verification_status_confirmed_as, 506, R.string.business_info_verification_status_standard, 507, R.string.business_info_verification_status_verified, 508, R.string.business_info_verified_address_book_missing, 509, R.string.business_info_verified_address_book_no_match, 510, R.string.business_opt_in_ui_title, 511, R.string.business_product_catalog_detail_title, 512, R.string.business_product_catalog_end_of_results_button, 513, R.string.business_product_catalog_end_of_results_title, 514, R.string.business_product_catalog_image_description, 515, R.string.business_product_catalog_overlay_text, 516, R.string.business_product_catalog_section_title, 517, R.string.business_product_catalog_see_all, 518, R.string.business_vertical_automotive, 519, R.string.business_vertical_beauty_spa_salon, 520, R.string.business_vertical_clothing_apparel, 521, R.string.business_vertical_education, 522, R.string.business_vertical_entertainment, 523, R.string.business_vertical_event_planning_service, 524, R.string.business_vertical_finance_banking, 525, R.string.business_vertical_food_grocery, 526, R.string.business_vertical_hotel_lodging, 527, R.string.business_vertical_medical_health, 528, R.string.business_vertical_non_profit, 529, R.string.business_vertical_not_a_biz, 530, R.string.business_vertical_other, 531, R.string.business_vertical_professional_services, 532, R.string.business_vertical_public_service, 533, R.string.business_vertical_restaurant, 534, R.string.business_vertical_shopping_retail, 535, R.string.business_vertical_travel_transportation, 536, R.string.button_download, 537, R.string.button_invite_to_group, 538, R.string.button_upload, 539, R.string.calculating, 540, R.string.call, 541, R.string.call_audio_not_clear, 542, R.string.call_canceled, 543, R.string.call_charges, 544, R.string.call_contact_name, 545, R.string.call_details, 546, R.string.call_icon_content_description, 547, R.string.call_peer_battery_low, 548, R.string.call_problem_distortion, 549, R.string.call_problem_echo, 550, R.string.call_problem_no_sound, 551, R.string.call_problems_title, 552, R.string.call_rating_title, 553, R.string.call_self_battery_low, 554, R.string.call_spam_title, 555, R.string.call_video_not_clear, 556, R.string.call_video_pause, 557, R.string.caller_not_a_contact, 558, R.string.calling, 559, R.string.calls, 560, R.string.calls_row_action_click, 561, R.string.calls_tab_section_older, 562, R.string.calls_tab_section_today, 563, R.string.calls_tab_section_yesterday, 564, R.string.camera_button_description, 565, R.string.camera_button_talkback, 566, R.string.camera_failed, 567, R.string.camera_tip, 568, R.string.camera_zoom_value, 569, R.string.can_not_start_video_call_without_camera_permission, 570, R.string.can_not_start_video_call_without_mic_and_camera_permission, 571, R.string.can_not_start_voip_call_in_airplane_mode, 572, R.string.can_not_start_voip_call_in_phone_call, 573, R.string.can_not_start_voip_call_when_active_elsewhere_message, 574, R.string.can_not_start_voip_call_when_active_elsewhere_positive_action, 575, R.string.can_not_start_voip_call_without_record_permission, 576, R.string.cancel_discarding_status_privacy_changes, 577, R.string.cannot_play_gif_wait_until_processed, 578, R.string.cannot_play_video_wait_until_processed, 579, R.string.cannot_send_chat_has_been_closed, 580, R.string.cannot_send_empty_text_message, 581, R.string.cannot_send_not_a_group_participant, 582, R.string.cannot_send_to_blocked_contact_1, 583, R.string.cannot_send_to_group_has_been_closed, 584, R.string.cannot_send_to_group_not_member, 585, R.string.cannot_share_selected_file, 586, R.string.cannot_start_camera, 587, R.string.cannot_start_camera_no_permission, 588, R.string.cannot_view_invite_link, 589, R.string.cant_add_more_items, 590, R.string.cant_send_message_too_long_with_placeholder, 591, R.string.cant_send_official_announcements, 592, R.string.capture_photo, 593, R.string.carousel_from_product_message_title, 594, R.string.cart_item_updated, 595, R.string.cart_max_total_quantity, 596, R.string.cart_sending, 597, R.string.catalog_error_missing_product, 598, R.string.catalog_error_no_products, 599, R.string.catalog_error_retrieving_products, 600, R.string.catalog_hidden, 601, R.string.catalog_not_exist, 602, R.string.catalog_product_add_to_cart, 603, R.string.catalog_product_message_biz, 604, R.string.catalog_product_report_complete_content, 605, R.string.catalog_product_report_complete_error, 606, R.string.catalog_product_report_complete_title, 607, R.string.catalog_product_report_content, 608, R.string.catalog_product_report_details_title, 609, R.string.catalog_product_report_dialog_title, 610, R.string.catalog_product_report_reason_illegal, 611, R.string.catalog_product_report_reason_knockoff, 612, R.string.catalog_product_report_reason_no_match, 613, R.string.catalog_product_report_reason_other, 614, R.string.catalog_product_report_reason_regulated, 615, R.string.catalog_product_report_reason_scam, 616, R.string.catalog_product_report_reason_spam, 617, R.string.catalog_product_report_select_reason_toast, 618, R.string.catalog_product_report_sending, 619, R.string.catalog_product_send_message_failed, 620, R.string.catalog_share_description, 621, R.string.catalog_share_email_subject, 622, R.string.catalog_share_text_template, 623, R.string.catalog_share_title, 624, R.string.catalog_something_went_wrong_error, 625, R.string.category_chat_history_backup, 626, R.string.category_critial_app_alerts, 627, R.string.category_failure_notifications, 628, R.string.category_media_playback, 629, R.string.category_other_notifications, 630, R.string.category_sending_media, 631, R.string.category_silent_notifications, 632, R.string.category_voip, 633, R.string.change_number_check_connectivity, 634, R.string.change_number_confirm_old_new, 635, R.string.change_number_dialog_text_already_added, 636, R.string.change_number_generic_fail_message, 637, R.string.change_number_icon_description, 638, R.string.change_number_message_new_number, 639, R.string.change_number_new_country_code_suggestion, 640, R.string.change_number_new_number, 641, R.string.change_number_notification, 642, R.string.change_number_notification_alert_new, 643, R.string.change_number_notification_alert_old, 644, R.string.change_number_notification_text_new, 645, R.string.change_number_notification_text_old, 646, R.string.change_number_notify_none, 647, R.string.change_number_notify_recipients_all, 648, R.string.change_number_notify_recipients_chat, 649, R.string.change_number_notify_recipients_custom, 650, R.string.change_number_notify_toggle, 651, R.string.change_number_notify_toggle_short, 652, R.string.change_number_old_number, 653, R.string.change_number_overview, 654, R.string.change_number_overview_one, 655, R.string.change_number_overview_payments, 656, R.string.change_number_overview_payments_one, 657, R.string.change_number_overview_payments_three, 658, R.string.change_number_overview_payments_two, 659, R.string.change_number_overview_three, 660, R.string.change_number_overview_two, 661, R.string.change_number_same_number, 662, R.string.change_number_success, 663, R.string.change_number_title, 664, R.string.change_number_your_new_phone_number, 665, R.string.change_number_your_new_phone_number_capped, 666, R.string.change_number_your_old_phone_number, 667, R.string.change_number_your_old_phone_number_capped, 668, R.string.change_privacy_settings, 669, R.string.change_registration_btn_description, 670, R.string.change_subject, 671, R.string.chat_changed_number_new, 672, R.string.chat_changed_number_old, 673, R.string.chat_encryption_state_change, 674, R.string.chat_encryption_state_change_for_in_app_support_chat, 675, R.string.chat_media_visibility_inquiry, 676, R.string.chat_settings_description_with_theme, 677, R.string.chat_settings_section_title, 678, R.string.chat_support_dialog_message, 679, R.string.chats, 680, R.string.check_for_internet_connection, 681, R.string.check_system_status, 682, R.string.checked_icon_label, 683, R.string.clear, 684, R.string.clear_all, 685, R.string.clear_all_chats_ask, 686, R.string.clear_all_chats_dialog_message, 687, R.string.clear_all_chats_dialog_positive_button, 688, R.string.clear_all_chats_dialog_prompt, 689, R.string.clear_all_chats_dialog_starred_messages, 690, R.string.clear_all_messages_ask, 691, R.string.clear_call_log, 692, R.string.clear_call_log_ask, 693, R.string.clear_chat, 694, R.string.clear_except_starred, 695, R.string.clear_single_log, 696, R.string.clock_wrong, 697, R.string.clock_wrong_report_current_date_time, 698, R.string.clock_wrong_title, 699, R.string.coldsync_failed_msg, 700, R.string.coldsync_no_network, 701, R.string.coldsync_nochange_msg, 702, R.string.color_blue, 703, R.string.color_cyan, 704, R.string.color_green, 705, R.string.color_name_bali_hai, 706, R.string.color_name_bittersweet, 707, R.string.color_name_bittersweet_orange, 708, R.string.color_name_brandy_rose, 709, R.string.color_name_breaker_bay, 710, R.string.color_name_bright_sun, 711, R.string.color_name_brook_green, 712, R.string.color_name_buccaneer_brown, 713, R.string.color_name_canary_yellow, 714, R.string.color_name_cape_honey_yellow, 715, R.string.color_name_caramel_yellow, 716, R.string.color_name_ce_soir, 717, R.string.color_name_cinder_black, 718, R.string.color_name_cruise_green, 719, R.string.color_name_downy_green, 720, R.string.color_name_earls_green, 721, R.string.color_name_elephant, 722, R.string.color_name_emerald, 723, R.string.color_name_fjord_gray, 724, R.string.color_name_flamingo_red, 725, R.string.color_name_hawkes_blue, 726, R.string.color_name_mandarian_orange, 727, R.string.color_name_maya_blue, 728, R.string.color_name_maya_blue_1, 729, R.string.color_name_medium_red_violet, 730, R.string.color_name_midnight_express, 731, R.string.color_name_mona_lisa, 732, R.string.color_name_monte_carlo, 733, R.string.color_name_monte_carlo_green, 734, R.string.color_name_orinoco_green, 735, R.string.color_name_pelorus_blue, 736, R.string.color_name_polo_blue, 737, R.string.color_name_prelude, 738, R.string.color_name_quartz_blue, 739, R.string.color_name_radical_red, 740, R.string.color_name_rose_bud, 741, R.string.color_name_scandal_green, 742, R.string.color_name_scarlett, 743, R.string.color_name_scorpion, 744, R.string.color_name_seagull_blue, 745, R.string.color_name_solitude_gray, 746, R.string.color_name_summer_sky, 747, R.string.color_name_sundance, 748, R.string.color_name_tory_blue, 749, R.string.color_name_tusk_green, 750, R.string.color_name_very_light_gray, 751, R.string.color_name_vivid_violet, 752, R.string.color_name_wasabi, 753, R.string.color_none, 754, R.string.color_purple, 755, R.string.color_red, 756, R.string.color_white, 757, R.string.color_yellow, 758, R.string.confirm_forward_msg, 759, R.string.confirm_send_document_title, 760, R.string.confirm_send_single_audio, 761, R.string.confirm_sharing_title, 762, R.string.confirmation_delete_all_qr, 763, R.string.confirmation_delete_qr, 764, R.string.connectivity_check_connection, 765, R.string.connectivity_self_help_instructions, 766, R.string.contact, 767, R.string.contact1, 768, R.string.contact2, 769, R.string.contact_already_in_call, 770, R.string.contact_already_in_group, 771, R.string.contact_business, 772, R.string.contact_encryption, 773, R.string.contact_info, 774, R.string.contact_info_and_phone, 775, R.string.contact_info_encrypted, 776, R.string.contact_info_live_location, 777, R.string.contact_info_live_location_description_friend_is_sharing, 778, R.string.contact_info_live_location_description_you_and_friend_are_sharing, 779, R.string.contact_info_live_location_description_you_are_sharing, 780, R.string.contact_info_security, 781, R.string.contact_info_security_modal_bsp, 782, R.string.contact_info_security_modal_fb_and_bsp, 783, R.string.contact_info_security_modal_in_app_support, 784, R.string.contact_other_phones, 785, R.string.contact_phone, 786, R.string.contact_picker_choose_chat, 787, R.string.contact_picker_choose_group, 788, R.string.contact_picker_no_wa_contacts, 789, R.string.contact_picker_no_wa_groups, 790, R.string.contact_picker_section_frequent_chats, 791, R.string.contact_picker_section_groups, 792, R.string.contact_picker_section_invite_to_whatsapp, 793, R.string.contact_picker_section_other_contacts, 794, R.string.contact_picker_section_recent_chats, 795, R.string.contact_picker_section_status, 796, R.string.contact_qr_add_contact_add, 797, R.string.contact_qr_contact_message, 798, R.string.contact_qr_email_body_with_link, 799, R.string.contact_qr_email_subject, 800, R.string.contact_qr_failed_go_back, 801, R.string.contact_qr_failed_title, 802, R.string.contact_qr_main_camera_loading, 803, R.string.contact_qr_my_code, 804, R.string.contact_qr_prompt, 805, R.string.contact_qr_reciprocal_footer_dismiss, 806, R.string.contact_qr_revoke, 807, R.string.contact_qr_revoke_cancel_button, 808, R.string.contact_qr_revoke_failure, 809, R.string.contact_qr_revoke_ok_button, 810, R.string.contact_qr_revoke_subtitle, 811, R.string.contact_qr_revoke_success, 812, R.string.contact_qr_revoke_title, 813, R.string.contact_qr_scan_code, 814, R.string.contact_qr_scan_invalid_dialog, 815, R.string.contact_qr_scan_no_connection, 816, R.string.contact_qr_scan_toast_no_valid_code, 817, R.string.contact_qr_share, 818, R.string.contact_qr_share_my_contact_button, 819, R.string.contact_qr_share_my_contact_header, 820, R.string.contact_qr_share_prompt, 821, R.string.contact_qr_share_subtitle, 822, R.string.contact_qr_title, 823, R.string.contact_qr_try_again, 824, R.string.contact_qr_valid_unsupported_subtitle_market, 825, R.string.contact_qr_valid_unsupported_subtitle_website, 826, R.string.contact_qr_valid_unsupported_title, 827, R.string.contact_qr_wait, 828, R.string.contact_reported, 829, R.string.contact_sim, 830, R.string.contact_support_via, 831, R.string.contact_us_email, 832, R.string.contact_us_faq_search_dialog_message, 833, R.string.contact_us_faqs_not_helpful_button, 834, R.string.contact_us_icon_description, 835, R.string.contact_us_send_info, 836, R.string.contact_us_send_info_description, 837, R.string.contact_us_support_response_info, 838, R.string.contact_us_topic_section_title, 839, R.string.contacts, 840, R.string.contacts_help, 841, R.string.contacts_help_instructions, 842, R.string.contacts_help_step_1, 843, R.string.contacts_help_step_2, 844, R.string.contacts_row_action_click, 845, R.string.contacts_to_send, 846, R.string.continue_shopping, 847, R.string.conversation_app_update_banner_text, 848, R.string.conversation_archived, 849, R.string.conversation_archived_confirmation, 850, R.string.conversation_cannot_download_media_no_media_card, 851, R.string.conversation_cannot_download_media_no_media_card_shared_storage, 852, R.string.conversation_cannot_download_media_read_only_media_card, 853, R.string.conversation_cannot_download_media_read_only_media_card_shared_storage, 854, R.string.conversation_contact_online, 855, R.string.conversation_is_composing, 856, R.string.conversation_is_recording, 857, R.string.conversation_last_seen_fri_with_placeholder, 858, R.string.conversation_last_seen_mon_with_placeholder, 859, R.string.conversation_last_seen_sat_with_placeholder, 860, R.string.conversation_last_seen_sun_with_placeholder, 861, R.string.conversation_last_seen_thu_with_placeholder, 862, R.string.conversation_last_seen_today_with_placeholder, 863, R.string.conversation_last_seen_tue_with_placeholder, 864, R.string.conversation_last_seen_wed_with_placeholder, 865, R.string.conversation_last_seen_with_placeholder, 866, R.string.conversation_last_seen_yesterday_with_placeholder, 867, R.string.conversation_menu_forward, 868, R.string.conversation_name_is_composing, 869, R.string.conversation_name_is_recording, 870, R.string.conversation_row_gif_not_downloaded_content_description, 871, R.string.conversation_row_image_not_downloaded_content_description, 872, R.string.conversation_row_live_location_button, 873, R.string.conversation_row_video_not_downloaded_content_description, 874, R.string.conversation_sharing_live_location, 875, R.string.conversation_shortcut_added, 876, R.string.conversations_most_recent_audio, 877, R.string.conversations_most_recent_audio_with_time, 878, R.string.conversations_most_recent_call, 879, R.string.conversations_most_recent_cart, 880, R.string.conversations_most_recent_contact, 881, R.string.conversations_most_recent_contact_array, 882, R.string.conversations_most_recent_decryption_failure, 883, R.string.conversations_most_recent_document, 884, R.string.conversations_most_recent_gif, 885, R.string.conversations_most_recent_group_invite, 886, R.string.conversations_most_recent_group_video_call_missed, 887, R.string.conversations_most_recent_group_voice_call_missed, 888, R.string.conversations_most_recent_image, 889, R.string.conversations_most_recent_live_location, 890, R.string.conversations_most_recent_location, 891, R.string.conversations_most_recent_product, 892, R.string.conversations_most_recent_sticker, 893, R.string.conversations_most_recent_unknown, 894, R.string.conversations_most_recent_video, 895, R.string.conversations_most_recent_video_call_incoming_length, 896, R.string.conversations_most_recent_video_call_missed, 897, R.string.conversations_most_recent_video_call_outgoing_length, 898, R.string.conversations_most_recent_voice, 899, R.string.conversations_most_recent_voice_call_incoming_length, 900, R.string.conversations_most_recent_voice_call_missed, 901, R.string.conversations_most_recent_voice_call_outgoing_length, 902, R.string.conversations_most_recent_voice_with_time, 903, R.string.conversations_unsupported_message, 904, R.string.conversations_unsupported_payment_preview, 905, R.string.copy, 906, R.string.copy_caption, 907, R.string.copy_link, 908, R.string.corrupt_installation_contact_support_prompt, 909, R.string.corrupt_installation_description, 910, R.string.corrupt_installation_description_website_distribution, 911, R.string.country, 912, R.string.create, 913, R.string.create_contact, 914, R.string.creating_group, 915, R.string.creator, 916, R.string.crop_image_terms_of_service, 917, R.string.crop_rotate, 918, R.string.current_info, 919, R.string.current_location_marker_content_description, 920, R.string.currently_logged_into, 921, R.string.custom_notifications, 922, R.string.custom_notifications_enabled, 923, R.string.custom_rom_detected, 924, R.string.custom_rom_info_app_name, 925, R.string.data_settings_autodownload_info, 926, R.string.data_settings_autodownload_info_enhanced, 927, R.string.data_settings_title_usage, 928, R.string.data_usage_settings_description, 929, R.string.date, 930, R.string.day_of_week_and_time, 931, R.string.decline_button_description, 932, R.string.decline_button_label, 933, R.string.decline_upgrade_button_description, 934, R.string.decryption_placeholder_export, 935, R.string.decryption_placeholder_message_text, 936, R.string.default_media_visibility_off, 937, R.string.default_media_visibility_on, 938, R.string.default_payment_id_name, 939, R.string.default_payment_pin_name, 940, R.string.default_wallpaper, 941, R.string.delete, 942, R.string.delete_account_additional_comments_hint, 943, R.string.delete_account_additional_comments_temporarily, 944, R.string.delete_account_change_number_dialog_prompt, 945, R.string.delete_account_change_number_question, 946, R.string.delete_account_done, 947, R.string.delete_account_failed, 948, R.string.delete_account_header, 949, R.string.delete_account_instructions, 950, R.string.delete_account_item_1, 951, R.string.delete_account_item_2, 952, R.string.delete_account_item_3, 953, R.string.delete_account_item_4, 954, R.string.delete_account_item_5, 955, R.string.delete_account_mismatch, 956, R.string.delete_account_processing, 957, R.string.delete_account_reason_change_phone_number, 958, R.string.delete_account_reason_changed_device, 959, R.string.delete_account_reason_instructions, 960, R.string.delete_account_reason_missing_feature, 961, R.string.delete_account_reason_not_working, 962, R.string.delete_account_reason_other, 963, R.string.delete_account_reason_select_option, 964, R.string.delete_account_reason_temporarily, 965, R.string.delete_account_warning, 966, R.string.delete_all, 967, R.string.delete_all_chats_ask, 968, R.string.delete_all_confirm, 969, R.string.delete_all_items, 970, R.string.delete_all_media, 971, R.string.delete_all_qr, 972, R.string.delete_broadcasts, 973, R.string.delete_chat, 974, R.string.delete_chat_tip, 975, R.string.delete_confirmation, 976, R.string.delete_confirmation_self, 977, R.string.delete_contact_dialog_title, 978, R.string.delete_contact_with_starred_dialog_title, 979, R.string.delete_contact_with_unsent_and_starred_dialog_title, 980, R.string.delete_group, 981, R.string.delete_group_dialog_title, 982, R.string.delete_group_starred_dialog_title, 983, R.string.delete_icon_description, 984, R.string.delete_info, 985, R.string.delete_items_except_starred, 986, R.string.delete_items_wait_progress, 987, R.string.delete_list, 988, R.string.delete_list_dialog_title, 989, R.string.delete_list_starred_dialog_title, 990, R.string.delete_list_unnamed_dialog_title, 991, R.string.delete_list_unnamed_starred_dialog_title, 992, R.string.delete_status_confirmation, 993, R.string.delete_wait_progress, 994, R.string.delete_wait_progress_text_with_percentage, 995, R.string.describe_problem_add_screenshot, 996, R.string.describe_problem_contact_support, 997, R.string.describe_problem_contact_us, 998, R.string.describe_problem_description, 999, R.string.describe_problem_description_further, 1000, R.string.describe_problem_description_short, 1001, R.string.describe_problem_help_center, 1002, R.string.describe_problem_screenshot, 1003, R.string.describe_problem_screenshots, 1004, R.string.describe_problem_screenshots_no_colon, 1005, R.string.description, 1006, R.string.description_hint, 1007, R.string.device_default_language_with_placeholder, 1010, R.string.device_unsupported, 1011, R.string.dialog_button_more_info, 1012, R.string.directly_entered_number_invalid, 1013, R.string.directly_entered_number_invalid_length, 1014, R.string.directly_entered_number_invalid_length_without_country_name, 1015, R.string.directly_entered_number_is_missing_country_code, 1016, R.string.directly_entered_number_not_checked, 1017, R.string.directly_entered_number_not_whatsappable, 1018, R.string.directly_entered_number_sync_failed, 1019, R.string.directly_entered_number_too_long, 1020, R.string.directly_entered_number_too_long_without_country_name, 1021, R.string.directly_entered_number_too_short, 1022, R.string.directly_entered_number_too_short_without_country_code, 1023, R.string.directly_entered_number_too_short_without_country_name, 1024, R.string.disable_wifi, 1025, R.string.discard_changes, 1026, R.string.discard_status_privacy_changes, 1027, R.string.dismiss_contact_group_admin, 1028, R.string.display_settings_section_title, 1029, R.string.document_preview, 1030, R.string.documents, 1031, R.string.does_not_match_button, 1032, R.string.done, 1033, R.string.dont_restore_message, 1034, R.string.doodle_add_sticker, 1035, R.string.doodle_add_text, 1036, R.string.doodle_change_font, 1037, R.string.doodle_draw, 1038, R.string.doodle_item_analog_clock, 1039, R.string.doodle_item_arrow, 1040, R.string.doodle_item_digital_clock, 1041, R.string.doodle_item_location, 1042, R.string.doodle_item_oval, 1043, R.string.doodle_item_oval_bubble, 1044, R.string.doodle_item_rectangle, 1045, R.string.doodle_item_rectangular_bubble, 1046, R.string.doodle_item_thought_bubble, 1047, R.string.download_failed, 1048, R.string.download_from_market, 1049, R.string.edit_broadcast_recipients, 1050, R.string.edit_business_address_full_address, 1051, R.string.edit_business_address_partial_address, 1052, R.string.edit_business_address_street_address, 1053, R.string.edit_contact_in_address_book, 1054, R.string.edit_group_admins, 1055, R.string.edit_group_description_dialog_title, 1056, R.string.edit_group_subject_dialog_title, 1057, R.string.edit_info, 1058, R.string.edit_list_name_dialog_title, 1059, R.string.edit_photo, 1060, R.string.edit_photo_description, 1061, R.string.edit_push_name, 1062, R.string.edit_status_description, 1063, R.string.email_conversation_body, 1064, R.string.email_conversation_subject, 1065, R.string.email_conversation_subject_with_corrupt_jid, 1066, R.string.email_file_attached, 1067, R.string.email_live_location_message, 1068, R.string.email_location_message, 1069, R.string.email_subject, 1070, R.string.email_subject_beta, 1071, R.string.emoji_label_activity, 1072, R.string.emoji_label_flags, 1073, R.string.emoji_label_food, 1074, R.string.emoji_label_nature, 1075, R.string.emoji_label_objects, 1076, R.string.emoji_label_people, 1077, R.string.emoji_label_symbols, 1078, R.string.emoji_label_travel, 1079, R.string.emoji_picker, 1080, R.string.emoji_recents_title, 1081, R.string.emoji_search_hint, 1082, R.string.empty_cart_description, 1083, R.string.empty_cart_message, 1084, R.string.encryption_description, 1085, R.string.end_and_accept_button_description, 1086, R.string.end_group_dialog_title, 1087, R.string.enter_fullscreen, 1088, R.string.enterprise_encryption_state_change, 1089, R.string.enterprise_encryption_state_change_description, 1090, R.string.entry_clear_button_content_description, 1091, R.string.ephemeral_nux_finished, 1092, R.string.ephemeral_nux_from_settings_content, 1093, R.string.ephemeral_nux_from_settings_title, 1094, R.string.ephemeral_nux_go_to_faq, 1095, R.string.ephemeral_nux_someone_turned_on_content, 1096, R.string.ephemeral_nux_someone_turned_on_title, 1097, R.string.ephemeral_setting, 1098, R.string.ephemeral_setting_description, 1099, R.string.ephemeral_setting_disabled, 1100, R.string.ephemeral_setting_disabled_by_name, 1101, R.string.ephemeral_setting_disabled_by_name_tap_to_change, 1102, R.string.ephemeral_setting_disabled_by_you, 1103, R.string.ephemeral_setting_disabled_by_you_tap_to_change, 1104, R.string.ephemeral_setting_disabled_tap_to_change, 1105, R.string.ephemeral_setting_internet_needed, 1106, R.string.ephemeral_setting_not_off_by_me, 1107, R.string.ephemeral_setting_not_off_by_name, 1108, R.string.ephemeral_setting_not_on_by_me, 1109, R.string.ephemeral_setting_not_on_by_name, 1110, R.string.ephemeral_setting_off, 1111, R.string.ephemeral_setting_off_status, 1112, R.string.ephemeral_setting_on, 1113, R.string.ephemeral_setting_on_status, 1114, R.string.ephemeral_toast_admin_only, 1115, R.string.ephemeral_unblock_to_turn_setting_off, 1116, R.string.ephemeral_unblock_to_turn_setting_on, 1117, R.string.error_adding_participant, 1118, R.string.error_adding_participant_401, 1119, R.string.error_adding_participant_406, 1120, R.string.error_adding_participant_408_single, 1121, R.string.error_adding_participant_500, 1122, R.string.error_bad_gif, 1123, R.string.error_bad_media, 1124, R.string.error_bad_video, 1125, R.string.error_call_disabled_during_call, 1126, R.string.error_camera_disabled_during_video_call, 1127, R.string.error_file_is_not_a_document, 1128, R.string.error_file_is_not_a_image, 1129, R.string.error_load_audio, 1130, R.string.error_load_gif, 1131, R.string.error_load_image, 1132, R.string.error_load_video, 1133, R.string.error_load_wallpaper, 1134, R.string.error_low_on_memory, 1135, R.string.error_msgstore_db_diskio, 1136, R.string.error_no_disc_space, 1137, R.string.error_no_email_client, 1138, R.string.error_notification_title, 1139, R.string.error_out_of_memory, 1140, R.string.error_parse_vcard, 1141, R.string.error_possible_cause_is_low_disk_space, 1142, R.string.error_processing_audio, 1143, R.string.error_processing_gif, 1144, R.string.error_processing_video, 1145, R.string.error_removing_admin_406, 1146, R.string.error_removing_participant, 1147, R.string.error_removing_participant_406, 1148, R.string.error_report_db_or_disk_is_full, 1149, R.string.error_setup_recorder, 1150, R.string.error_unable_to_open_msgstoredb, 1151, R.string.error_unable_to_update_readonly_msgstoredb, 1152, R.string.error_unexpected, 1153, R.string.error_video_messages_disabled_during_call, 1154, R.string.error_video_playback, 1155, R.string.error_voice_messages_disabled_during_call, 1156, R.string.error_voice_messages_disabled_during_cellular_call, 1157, R.string.error_wallpaper_invalid_file, 1158, R.string.error_zero_audio_length, 1159, R.string.estimated, 1160, R.string.eula_agree, 1161, R.string.eula_terms_of_service, 1162, R.string.eula_title, 1163, R.string.existing_contact, 1164, R.string.exit, 1165, R.string.exit_fullscreen, 1166, R.string.exit_group, 1167, R.string.exit_group_description, 1168, R.string.exit_group_dialog_title, 1169, R.string.expiry_notification_title, 1170, R.string.export_attachment, 1171, R.string.export_conversation_ask_about_media, 1172, R.string.export_conversation_failed, 1173, R.string.export_conversation_failed_messages_are_uploading, 1174, R.string.export_conversation_failed_out_of_space, 1175, R.string.export_conversation_failed_out_of_space_shared_storage, 1176, R.string.export_conversation_with_media_failed, 1177, R.string.export_media_omitted, 1178, R.string.failed_accept_bad_invite_link, 1179, R.string.failed_accept_invite_group_full, 1180, R.string.failed_accept_invite_link_banned, 1181, R.string.failed_accept_invite_link_invalid, 1182, R.string.failed_accept_invite_link_no_group, 1183, R.string.failed_accept_invite_link_reset, 1184, R.string.failed_announcement_group_send_msg_not_admin, 1185, R.string.failed_create_invite_link_no_group, 1186, R.string.failed_create_invite_link_not_admin, 1187, R.string.failed_to_leave_group, 1188, R.string.failed_to_leave_x_group, 1189, R.string.failed_to_load_message, 1190, R.string.failed_to_update_privacy_settings, 1191, R.string.failed_update_group_info, 1192, R.string.failed_update_group_info_not_admin, 1193, R.string.failed_update_group_info_not_participant, 1194, R.string.failed_update_photo, 1195, R.string.failed_update_photo_not_authorized, 1196, R.string.failed_update_profile_photo, 1197, R.string.fanout_group_video_call_notification_incoming, 1198, R.string.fanout_group_video_call_subtitle_incoming, 1199, R.string.fanout_group_voice_call_subtitle_incoming, 1200, R.string.fanout_group_voip_call_subtitle_single_participant_invited, 1201, R.string.fanout_group_voip_call_subtitle_single_participant_joined, 1202, R.string.faq_open_in_browser, 1204, R.string.file_size_partial_download_format, 1205, R.string.file_too_large_with_placeholder, 1206, R.string.file_uploaded, 1207, R.string.filter_error, 1208, R.string.filter_loading, 1209, R.string.filter_name_bw, 1210, R.string.filter_name_chrome, 1211, R.string.filter_name_cool, 1212, R.string.filter_name_film, 1213, R.string.filter_name_none, 1214, R.string.filter_name_pop, 1215, R.string.filter_swipe_up, 1216, R.string.filter_swipe_up_short, 1217, R.string.fingerprint_bottom_sheet_negative_button, 1218, R.string.fingerprint_bottom_sheet_title, 1219, R.string.fingerprint_icon_content_description, 1220, R.string.fingerprint_locked_fingerprint_prompt, 1221, R.string.fingerprint_lockout_error, 1222, R.string.fingerprint_not_recognized, 1223, R.string.fingerprint_setup_dialog_message, 1224, R.string.fingerprint_setup_dialog_title, 1225, R.string.finish_registration_first, 1226, R.string.first_status_all_contacts, 1227, R.string.flash_auto, 1228, R.string.flash_auto_action, 1229, R.string.flash_off, 1230, R.string.flash_off_action, 1231, R.string.flash_on, 1232, R.string.flash_on_action, 1233, R.string.font_name_bryndan_write, 1234, R.string.font_name_norican, 1235, R.string.font_name_oswald, 1236, R.string.font_name_sans_serif, 1237, R.string.font_name_serif, 1238, R.string.font_style_description, 1239, R.string.font_style_selector, 1240, R.string.forget_wifi_network, 1241, R.string.forward_to, 1242, R.string.forwarded_many_times_header, 1243, R.string.forwarded_message_header, 1244, R.string.frequently_forwarded_picker_info_multiple_messages, 1245, R.string.frequently_forwarded_picker_info_single_message, 1246, R.string.friday_at, 1247, R.string.futureproof_deep_link, 1248, R.string.futureproof_message_text, 1249, R.string.futureproof_message_text_sent, 1250, R.string.futureproof_payment_message, 1251, R.string.futureproof_status_text, 1252, R.string.futureproof_status_text_sent, 1253, R.string.gallery_audio_cannot_load, 1254, R.string.gallery_audio_notready_warning, 1255, R.string.gallery_camera_bucket_name, 1256, R.string.gallery_camera_images_bucket_name, 1257, R.string.gallery_camera_videos_bucket_name, 1258, R.string.gallery_document_notready_warning, 1259, R.string.gallery_gif_notready_warning, 1260, R.string.gallery_image_notready_warning, 1261, R.string.gallery_label, 1262, R.string.gallery_media_not_exist, 1263, R.string.gallery_media_not_exist_shared_storage, 1264, R.string.gallery_notready_warning, 1265, R.string.gallery_picker_label, 1266, R.string.gallery_tab_documents, 1267, R.string.gallery_tab_links, 1268, R.string.gallery_tab_media, 1269, R.string.gallery_tab_products, 1270, R.string.gallery_tip, 1271, R.string.gallery_unsafe_audio_removed, 1272, R.string.gallery_unsafe_video_removed, 1273, R.string.gallery_video_notready_warning, 1274, R.string.gdpr_delete_report_confirmation, 1275, R.string.gdpr_download_expired, 1276, R.string.gdpr_report_available, 1277, R.string.gdpr_report_delete, 1278, R.string.gdpr_report_download, 1279, R.string.gdpr_report_downloading, 1280, R.string.gdpr_report_failed_delete, 1281, R.string.gdpr_report_failed_request, 1282, R.string.gdpr_report_file_name, 1283, R.string.gdpr_report_footer_available, 1284, R.string.gdpr_report_header, 1285, R.string.gdpr_report_info, 1286, R.string.gdpr_report_request, 1287, R.string.gdpr_report_requested, 1288, R.string.gdpr_report_share, 1289, R.string.gdpr_report_will_be_ready, 1290, R.string.gdpr_share_report_button, 1291, R.string.gdpr_share_report_confirmation, 1292, R.string.gdrive_backup_error_account_not_present_on_the_device_anymore_summary, 1293, R.string.gdrive_backup_error_auth_failed_summary, 1294, R.string.gdrive_backup_error_google_backup_service_disabled_summary, 1295, R.string.gdrive_backup_error_google_drive_servers_are_not_working_properly_summary, 1296, R.string.gdrive_backup_error_internal_storage_full_summary, 1297, R.string.gdrive_backup_error_not_reachable_summary, 1298, R.string.gdrive_backup_error_sdcard_missing_summary, 1299, R.string.gdrive_backup_error_storage_permission_denied_summary, 1300, R.string.gdrive_backup_last_modified_date_unavailable, 1301, R.string.gdrive_backup_notification_string_finished, 1302, R.string.gdrive_backup_notification_string_preparation_message, 1303, R.string.gdrive_backup_notification_string_preparation_message_with_percentage_placeholder, 1304, R.string.gdrive_backup_notification_title_finished_failed, 1305, R.string.gdrive_backup_notification_title_finished_success, 1306, R.string.gdrive_backup_preferred_over_cellular_user_on_roaming, 1307, R.string.gdrive_backup_preferred_over_wifi_user_on_cellular, 1308, R.string.gdrive_backup_preferred_over_wifi_user_on_roaming, 1309, R.string.gdrive_backup_size_info, 1310, R.string.gdrive_backup_size_info_calculating, 1311, R.string.gdrive_backup_size_info_with_nothing_to_download, 1312, R.string.gdrive_backup_title, 1313, R.string.gdrive_backup_title_paused, 1314, R.string.gdrive_cancel_media_restore_message, 1315, R.string.gdrive_error_full_summary, 1316, R.string.gdrive_error_full_summary_total_upload_unknown_size, 1317, R.string.gdrive_error_local_backup_missing_summary, 1318, R.string.gdrive_give_permission_button_label, 1319, R.string.gdrive_insufficient_sdcard_storage_message, 1320, R.string.gdrive_insufficient_sdcard_storage_title, 1321, R.string.gdrive_insufficient_shared_storage_message, 1322, R.string.gdrive_media_restore_error_account_not_present_on_the_device_anymore_summary, 1323, R.string.gdrive_media_restore_error_auth_failed_summary, 1324, R.string.gdrive_media_restore_error_google_backup_service_disabled_summary, 1325, R.string.gdrive_media_restore_error_google_drive_servers_are_not_working_properly_summary, 1326, R.string.gdrive_media_restore_error_internal_storage_full_summary, 1327, R.string.gdrive_media_restore_error_internal_storage_full_summary_unknown_size, 1328, R.string.gdrive_media_restore_error_not_reachable_summary, 1329, R.string.gdrive_media_restore_error_storage_permission_withdrawn, 1330, R.string.gdrive_media_restore_notification_resume_now, 1331, R.string.gdrive_media_restore_notification_string_finished_no_failures, 1332, R.string.gdrive_media_restore_notification_string_finished_with_failures, 1333, R.string.gdrive_media_restore_notification_string_no_failures_with_placeholder, 1334, R.string.gdrive_media_restore_notification_string_paused_for_battery, 1335, R.string.gdrive_media_restore_notification_string_paused_for_data_connection, 1336, R.string.gdrive_media_restore_notification_string_paused_for_wifi, 1337, R.string.gdrive_media_restore_notification_string_preparation_message, 1338, R.string.gdrive_media_restore_notification_string_preparation_message_with_percentage_placeholder, 1339, R.string.gdrive_media_restore_notification_string_with_failures_and_percentage, 1340, R.string.gdrive_media_restore_title_failed, 1341, R.string.gdrive_media_restore_title_finished, 1342, R.string.gdrive_media_restore_title_paused, 1343, R.string.gdrive_media_restore_title_running, 1344, R.string.gdrive_message_looking_for_backups, 1345, R.string.gdrive_message_restore_failed_jid_mismatch_many_jids_associated_with_backup_found, 1346, R.string.gdrive_message_restore_failed_jid_mismatch_no_jid_associated_with_backup_found, 1347, R.string.gdrive_message_restore_failed_jid_mismatch_one_jid_associated_with_backup_found, 1348, R.string.gdrive_message_restore_failed_low_on_storage_space, 1349, R.string.gdrive_message_restore_failed_reregister_btn, 1350, R.string.gdrive_message_restore_failed_retry_prompt_message, 1351, R.string.gdrive_message_store_download_error_account_not_present_on_the_device_anymore_summary, 1352, R.string.gdrive_message_store_download_error_auth_failed_summary, 1353, R.string.gdrive_message_store_download_error_internal_storage_full_summary, 1354, R.string.gdrive_message_store_download_error_internal_storage_full_summary_unknown_size, 1355, R.string.gdrive_message_store_download_error_not_reachable_summary, 1356, R.string.gdrive_message_store_download_error_older_version_of_app, 1357, R.string.gdrive_message_taking_longer_than_expected, 1358, R.string.gdrive_messages_restore_succeeded_media_will_be_restored_on_wifi, 1359, R.string.gdrive_new_user_setup_account_title, 1360, R.string.gdrive_new_user_setup_button_toast_no_freq_selected, 1361, R.string.gdrive_new_user_setup_category_title, 1362, R.string.gdrive_new_user_setup_footer_info, 1363, R.string.gdrive_new_user_setup_message_media_and_messages, 1364, R.string.gdrive_new_user_setup_message_media_and_messages_short, 1365, R.string.gdrive_new_user_setup_select_a_backup_frequency, 1366, R.string.gdrive_new_user_setup_title, 1367, R.string.gdrive_no_backup_found, 1368, R.string.gdrive_no_google_account_found_message, 1369, R.string.gdrive_one_time_setup_taking_too_long_message, 1370, R.string.gdrive_restore_error_sdcard_missing_summary, 1371, R.string.gdrive_restore_error_sdcard_unmounted_summary, 1372, R.string.gdrive_restore_error_title, 1373, R.string.gdrive_restore_general_info, 1374, R.string.gdrive_restore_info, 1375, R.string.gdrive_restore_now, 1376, R.string.generic_network_error_retry, 1377, R.string.generic_network_error_retry_later, 1378, R.string.get_direction, 1379, R.string.gif_dialog_message_remove, 1380, R.string.gif_favorites_title, 1381, R.string.gif_recents_title, 1382, R.string.gif_remove_from_recents_option, 1383, R.string.gif_remove_from_title_tray, 1384, R.string.gif_remove_from_tray, 1385, R.string.gif_save_to_favorites, 1386, R.string.gif_save_to_picker_title, 1387, R.string.gif_search, 1388, R.string.gif_search_dancing, 1389, R.string.gif_search_happy, 1390, R.string.gif_search_hint, 1391, R.string.gif_search_lol, 1392, R.string.gif_search_love, 1393, R.string.gif_search_no_results, 1394, R.string.gif_search_sad, 1395, R.string.gif_selected, 1396, R.string.gif_trending_title, 1397, R.string.gif_url_preview_msg, 1398, R.string.go_to_most_recent_message, 1399, R.string.gold_msg_not_e2e_to_e2e, 1400, R.string.google_account_picker_add_account, 1401, R.string.google_account_picker_title, 1402, R.string.google_drive, 1403, R.string.google_drive_backup_size, 1404, R.string.google_drive_backup_time, 1405, R.string.google_drive_confirm_backup_over_cellular_message, 1406, R.string.google_drive_confirm_media_restore_over_cellular_message, 1407, R.string.google_drive_error_google_play_services_are_missing_message_at_backup_time, 1408, R.string.google_drive_error_google_play_services_are_missing_message_at_restore_time, 1409, R.string.google_drive_error_google_play_services_are_missing_positive_button_label, 1410, R.string.google_drive_error_google_play_services_are_missing_title, 1411, R.string.google_drive_error_google_play_services_disabled_message_at_backup_time, 1412, R.string.google_drive_error_google_play_services_disabled_message_at_restore_time, 1413, R.string.google_drive_error_google_play_services_disabled_positive_button_label, 1414, R.string.google_drive_error_google_play_services_disabled_title, 1415, R.string.google_drive_error_google_play_services_update_required_positive_button_label, 1416, R.string.google_drive_error_google_play_services_updation_required_message_at_backup_time, 1417, R.string.google_drive_error_google_play_services_updation_required_message_at_restore_time, 1418, R.string.google_drive_error_google_play_services_updation_required_title, 1419, R.string.google_drive_no_backup_found, 1420, R.string.google_drive_resume_button_label, 1421, R.string.got_it, 1422, R.string.gps_required_body, 1423, R.string.gps_required_title, 1424, R.string.group, 1425, R.string.group_add_contact_failed, 1426, R.string.group_add_nobody_is_discontinued_dialog_text, 1427, R.string.group_add_permission_blacklist, 1428, R.string.group_admin_not_a_contact, 1429, R.string.group_announcement_disabled_sys_msg, 1430, R.string.group_announcement_disabled_sys_msg_you, 1431, R.string.group_announcement_enabled_sys_msg, 1432, R.string.group_announcement_enabled_sys_msg_you, 1433, R.string.group_announcement_footer_description, 1434, R.string.group_call, 1435, R.string.group_call_audio_not_clear, 1436, R.string.group_call_log_item_title, 1437, R.string.group_call_log_participant_picker_title, 1438, R.string.group_call_offer_called_you, 1439, R.string.group_call_offer_canceled, 1440, R.string.group_call_participant_search_hint, 1441, R.string.group_call_problem_distortion, 1442, R.string.group_call_problem_no_sound, 1443, R.string.group_call_video_not_clear, 1444, R.string.group_confirm_forward_msg, 1445, R.string.group_confirm_send_document_title, 1446, R.string.group_confirm_send_single_audio, 1447, R.string.group_confirm_set_icon, 1448, R.string.group_confirm_sharing_title, 1449, R.string.group_create_time, 1450, R.string.group_create_time_today, 1451, R.string.group_create_time_yesterday, 1452, R.string.group_created_by_creator, 1453, R.string.group_created_by_name, 1454, R.string.group_created_by_you, 1455, R.string.group_created_failed, 1456, R.string.group_creating, 1457, R.string.group_creation_time, 1458, R.string.group_creation_time_today, 1459, R.string.group_creation_time_yesterday, 1460, R.string.group_creator_name, 1461, R.string.group_creator_name_with_time, 1462, R.string.group_creator_name_with_time_today, 1463, R.string.group_creator_name_with_time_yesterday, 1464, R.string.group_creator_you, 1465, R.string.group_creator_you_with_time, 1466, R.string.group_creator_you_with_time_today, 1467, R.string.group_creator_you_with_time_yesterday, 1468, R.string.group_description, 1469, R.string.group_description_changed_by_name, 1470, R.string.group_description_changed_by_name_in_chats, 1471, R.string.group_description_changed_by_participant, 1472, R.string.group_description_changed_by_participant_in_chats, 1473, R.string.group_description_changed_by_you, 1474, R.string.group_description_changed_by_you_in_chats, 1475, R.string.group_description_deleted_by_name, 1476, R.string.group_description_deleted_by_participant, 1477, R.string.group_description_deleted_by_you, 1478, R.string.group_description_helper, 1479, R.string.group_ended, 1480, R.string.group_error_accept_invite_already_in_group, 1481, R.string.group_error_accept_invite_failure, 1482, R.string.group_error_accept_invite_group_does_not_exist, 1483, R.string.group_error_accept_invite_group_full, 1484, R.string.group_error_accept_invite_invalid, 1485, R.string.group_error_add_participant_repeated_add_blocked, 1486, R.string.group_error_add_participants, 1487, R.string.group_error_add_participants_no_such_group, 1488, R.string.group_error_add_participants_not_authorized, 1489, R.string.group_error_add_participants_not_in_group, 1490, R.string.group_error_add_participants_too_many_requests, 1491, R.string.group_error_change_admins, 1492, R.string.group_error_change_admins_no_such_group, 1493, R.string.group_error_change_admins_not_authorized, 1494, R.string.group_error_change_admins_not_in_group, 1495, R.string.group_error_create, 1496, R.string.group_error_create_subject_too_long, 1497, R.string.group_error_create_too_many_groups, 1498, R.string.group_error_create_too_many_requests, 1499, R.string.group_error_description, 1500, R.string.group_error_description_conflict, 1501, R.string.group_error_description_not_allowed, 1502, R.string.group_error_end, 1503, R.string.group_error_leave, 1504, R.string.group_error_leave_no_such_group, 1505, R.string.group_error_leave_not_in_group, 1506, R.string.group_error_remove_participants, 1507, R.string.group_error_remove_participants_no_such_group, 1508, R.string.group_error_remove_participants_not_authorized, 1509, R.string.group_error_remove_participants_not_in_group, 1510, R.string.group_error_subject, 1511, R.string.group_error_subject_no_such_group, 1512, R.string.group_error_subject_not_authorized, 1513, R.string.group_error_subject_not_in_group, 1514, R.string.group_error_subject_too_long, 1515, R.string.group_icon_removed, 1516, R.string.group_icon_updated, 1517, R.string.group_info, 1518, R.string.group_info_encrypted, 1519, R.string.group_info_fetch_failure, 1520, R.string.group_info_fetch_invalid_group, 1521, R.string.group_info_fetch_invalid_invite, 1522, R.string.group_invite, 1523, R.string.group_invite_default_caption, 1524, R.string.group_invite_link_preview_description, 1525, R.string.group_invite_photo, 1526, R.string.group_link_qr_prompt, 1527, R.string.group_link_qr_share_prompt, 1528, R.string.group_name_hint, 1529, R.string.group_name_shortcut_was_removed, 1530, R.string.group_no_forwarded_many_times_disabled_sys_msg, 1531, R.string.group_no_forwarded_many_times_disabled_sys_msg_you, 1532, R.string.group_no_forwarded_many_times_enabled_sys_msg, 1533, R.string.group_no_forwarded_many_times_enabled_sys_msg_you, 1534, R.string.group_no_frequently_forwarded_disabled_sys_msg, 1535, R.string.group_no_frequently_forwarded_disabled_sys_msg_you, 1536, R.string.group_no_frequently_forwarded_enabled_sys_msg, 1537, R.string.group_no_frequently_forwarded_enabled_sys_msg_you, 1538, R.string.group_participant_added_name, 1539, R.string.group_participant_added_you, 1540, R.string.group_participant_changed_number_known_name, 1541, R.string.group_participant_changed_number_unknown_name, 1542, R.string.group_participant_demoted_you, 1543, R.string.group_participant_joined_by_link_names, 1544, R.string.group_participant_joined_by_link_you, 1545, R.string.group_participant_left_name, 1546, R.string.group_participant_left_you, 1547, R.string.group_participant_promoted_you, 1548, R.string.group_participant_removed_name, 1549, R.string.group_participant_removed_you, 1550, R.string.group_participants_name_added_names, 1551, R.string.group_participants_name_added_you, 1552, R.string.group_participants_name_removed_names, 1553, R.string.group_participants_name_removed_you, 1554, R.string.group_participants_you_added_names, 1555, R.string.group_participants_you_removed_names, 1556, R.string.group_photo, 1557, R.string.group_privacy_upsell, 1558, R.string.group_qr_email_body_with_link, 1559, R.string.group_qr_share_subtitle, 1560, R.string.group_restrict_disabled_sys_msg, 1561, R.string.group_restrict_disabled_sys_msg_you, 1562, R.string.group_restrict_enabled_sys_msg, 1563, R.string.group_restrict_enabled_sys_msg_you, 1564, R.string.group_settings_all_participants, 1565, R.string.group_settings_allow, 1566, R.string.group_settings_announcement_info, 1567, R.string.group_settings_announcement_title, 1568, R.string.group_settings_dont_allow, 1569, R.string.group_settings_forward_many_times, 1570, R.string.group_settings_forwarded_many_times_info, 1571, R.string.group_settings_forwarded_many_times_title, 1572, R.string.group_settings_frequently_forwarded_info, 1573, R.string.group_settings_frequently_forwarded_title, 1574, R.string.group_settings_only_admins, 1575, R.string.group_settings_restricted_mode_info, 1576, R.string.group_settings_restricted_mode_title, 1577, R.string.group_settings_title, 1578, R.string.group_subject_changed_by_name, 1579, R.string.group_subject_changed_by_name_from_to, 1580, R.string.group_subject_changed_by_you, 1581, R.string.group_subject_changed_by_you_from_to, 1582, R.string.group_subject_changed_you_pronoun, 1583, R.string.group_subject_unknown, 1584, R.string.group_sync_tap_retry, 1585, R.string.group_updating, 1586, R.string.group_video_call_label, 1587, R.string.group_voip_call_label, 1588, R.string.group_voip_call_title, 1589, R.string.groups_in_common, 1590, R.string.hang_up, 1591, R.string.help_icon_description, 1592, R.string.help_loading_progress_label, 1593, R.string.help_settings_description, 1594, R.string.hide_collapsed_statuses_btn_text, 1595, R.string.hide_places_list, 1596, R.string.highly_forwarded_message_header, 1597, R.string.identity_change_info, 1598, R.string.identity_change_info_md, 1599, R.string.identity_change_verify, 1600, R.string.identity_changed_name, 1601, R.string.identity_changed_name_md, 1602, R.string.identity_code_email_body, 1603, R.string.identity_code_email_subject, 1604, R.string.identity_not_verified, 1605, R.string.identity_verified, 1606, R.string.ignore_archived_chats_banner_description, 1607, R.string.ignore_archived_chats_banner_title, 1608, R.string.image_gallery_NoGifView_text, 1609, R.string.image_gallery_NoImageView_text, 1610, R.string.image_gallery_NoMediaView_text, 1611, R.string.image_gallery_NoVideoView_text, 1612, R.string.image_preview_description, 1613, R.string.image_transfer_in_progress, 1614, R.string.include_media, 1615, R.string.incoming_call, 1616, R.string.incoming_group_video_call, 1617, R.string.incoming_group_video_call_ticker, 1618, R.string.incoming_group_voice_call, 1619, R.string.incoming_voice_call, 1620, R.string.incomming_call_reply_0, 1621, R.string.incomming_call_reply_1, 1622, R.string.incomming_call_reply_2, 1623, R.string.incomming_call_reply_3, 1624, R.string.incomming_call_reply_custom, 1625, R.string.info, 1626, R.string.info_default_empty, 1627, R.string.info_icon_description, 1628, R.string.info_retrieve_dialog_message, 1629, R.string.info_retrieve_dialog_title, 1630, R.string.info_retrieve_failed, 1631, R.string.info_update_dialog_message, 1632, R.string.info_update_dialog_title, 1633, R.string.info_update_failed, 1634, R.string.initialization_fail_message, 1635, R.string.initialization_fail_retry, 1636, R.string.initialization_fail_title, 1637, R.string.inline_video_fullscreen, 1638, R.string.inline_video_pip, 1639, R.string.install_app_ineligible, 1640, R.string.install_app_not_possible, 1641, R.string.install_app_shortcut, 1642, R.string.insufficient_internal_storage_settings_button, 1643, R.string.insufficient_internal_storage_settings_button_almost_full_enhanced, 1644, R.string.insufficient_internal_storage_space_description_almost_full_enhanced, 1645, R.string.insufficient_internal_storage_space_description_enhanced, 1646, R.string.insufficient_internal_storage_space_title, 1648, R.string.insufficient_internal_storage_space_title_almost_full_enhanced, 1649, R.string.insufficient_internal_storage_space_title_enhanced, 1650, R.string.insufficient_space_for_download, 1651, R.string.insufficient_space_for_download_product_image, 1652, R.string.insufficient_space_for_download_product_image_shared_storage, 1653, R.string.insufficient_space_for_download_shared_storage, 1654, R.string.insufficient_storage_dialog_subtitle, 1655, R.string.insufficient_storage_dialog_title, 1656, R.string.invalid_catalog_link, 1657, R.string.invalid_chat_link, 1658, R.string.invalid_deep_link, 1659, R.string.invalid_media_message_download, 1660, R.string.invalid_product_link, 1661, R.string.invalid_qr_code, 1662, R.string.invalid_url_for_download, 1663, R.string.invalid_url_for_product_image_download, 1664, R.string.invite, 1665, R.string.invite_cancelled, 1666, R.string.invite_contact_button, 1667, R.string.invite_contact_via, 1668, R.string.invite_expiration_at_time, 1669, R.string.invite_expired, 1670, R.string.invite_friends, 1671, R.string.invite_link_description, 1672, R.string.invite_link_reset, 1673, R.string.invite_link_reset_in_chats, 1674, R.string.invite_link_reset_name, 1675, R.string.invite_link_reset_name_in_chats, 1676, R.string.invite_link_reset_you, 1677, R.string.invite_link_reset_you_in_chats, 1678, R.string.invite_named_contact_via, 1679, R.string.invite_to_group_call_confirmation_description, 1680, R.string.invite_to_group_call_confirmation_positive_button_label, 1681, R.string.invite_to_group_call_confirmation_text, 1682, R.string.invite_to_group_call_confirmation_title, 1683, R.string.invite_used_from_admin_you, 1684, R.string.invite_via_email_title, 1685, R.string.invite_via_link, 1686, R.string.invites_title, 1687, R.string.item_added_to_cart, 1688, R.string.items_in_cart_available, 1689, R.string.join_group, 1690, R.string.join_group_by_link, 1691, R.string.join_group_creator_message, 1692, R.string.joining_group, 1693, R.string.joining_group_via_invite, 1694, R.string.just_now, 1695, R.string.keyboard_button_description, 1696, R.string.later, 1697, R.string.learn_more, 1698, R.string.led_support_green_only, 1699, R.string.library_preview_chat_content_swipe_left, 1700, R.string.library_preview_chat_content_swipe_right, 1701, R.string.link_copied, 1702, R.string.link_copied_confirmation, 1703, R.string.link_taking_to, 1704, R.string.link_write_error, 1705, R.string.link_written_confirmation, 1706, R.string.linked_device_active_now, 1707, R.string.linked_device_button_text, 1708, R.string.linked_device_location, 1709, R.string.linked_device_logged_out, 1710, R.string.linked_device_logged_out_helper_text, 1711, R.string.linked_device_logout_error_message, 1712, R.string.linked_device_logout_error_title, 1713, R.string.linked_device_logout_hint, 1714, R.string.linked_device_name_platform_chrome, 1715, R.string.linked_device_name_platform_edge, 1717, R.string.linked_device_name_platform_firefox, 1718, R.string.linked_device_name_platform_ie, 1719, R.string.linked_device_name_platform_opera, 1720, R.string.linked_device_name_platform_safari, 1721, R.string.linked_device_not_syncing, 1722, R.string.linked_device_remove, 1723, R.string.linked_device_status, 1724, R.string.linked_device_syncing, 1725, R.string.linked_devices_header_title, 1726, R.string.linked_devices_screen_title, 1727, R.string.list_end_short, 1728, R.string.list_info, 1729, R.string.list_recipient_added, 1730, R.string.list_recipient_removed, 1731, R.string.list_two_items_short, 1732, R.string.listen, 1733, R.string.live_location, 1734, R.string.live_location_add_comment, 1735, R.string.live_location_ended, 1736, R.string.live_location_final_update, 1737, R.string.live_location_final_update_friday, 1738, R.string.live_location_final_update_monday, 1739, R.string.live_location_final_update_saturday, 1740, R.string.live_location_final_update_sunday, 1741, R.string.live_location_final_update_thursday, 1742, R.string.live_location_final_update_today, 1743, R.string.live_location_final_update_tuesday, 1744, R.string.live_location_final_update_wednesday, 1745, R.string.live_location_final_update_yesterday, 1746, R.string.live_location_first_use_dialog_description, 1747, R.string.live_location_fix_location_update, 1748, R.string.live_location_last_updated, 1749, R.string.live_location_live_until, 1750, R.string.live_location_no_one_sharing, 1751, R.string.live_location_not_sharing, 1752, R.string.live_location_privacy_string, 1753, R.string.live_location_share_15_minutes, 1754, R.string.live_location_share_1_hour, 1755, R.string.live_location_share_8_hours, 1756, R.string.live_location_share_back_header_text, 1757, R.string.live_location_sharing_ended, 1758, R.string.live_location_stop, 1759, R.string.live_location_stop_sharing, 1760, R.string.live_location_stop_sharing_dialog, 1761, R.string.live_location_stopped_sharing_name, 1762, R.string.live_location_view_live_location, 1763, R.string.live_location_zoom_out, 1764, R.string.loading_biz_profile, 1765, R.string.loading_spinner, 1766, R.string.local_backup_time, 1767, R.string.local_restore_info, 1768, R.string.local_restore_info_calculating, 1769, R.string.locate_me, 1770, R.string.location_button, 1771, R.string.location_data_provided_by_fousquare, 1772, R.string.location_just_now, 1773, R.string.location_marker_content_description, 1774, R.string.location_nearby_places, 1775, R.string.location_no_address, 1776, R.string.log_out, 1777, R.string.login_failure_password, 1778, R.string.make_contact_group_admin, 1779, R.string.manage_storage, 1780, R.string.manage_storage_button_text, 1781, R.string.map_cancel_btn, 1782, R.string.mark_read, 1783, R.string.mark_unread, 1784, R.string.marked_unread, 1785, R.string.max_file_size_to_send_error_message, 1786, R.string.media, 1787, R.string.media_loading, 1788, R.string.media_preview, 1789, R.string.media_view_x_of_y, 1790, R.string.menuitem_add, 1791, R.string.menuitem_archived_chats, 1792, R.string.menuitem_contacts, 1793, R.string.menuitem_groupchat, 1794, R.string.menuitem_linked_devices, 1795, R.string.menuitem_list, 1796, R.string.menuitem_mute_notifications, 1797, R.string.menuitem_new, 1798, R.string.menuitem_new_call, 1799, R.string.menuitem_new_contact, 1800, R.string.menuitem_new_status, 1801, R.string.menuitem_new_text_status, 1802, R.string.menuitem_pin, 1803, R.string.menuitem_refresh, 1804, R.string.menuitem_scan_qr, 1805, R.string.menuitem_settings, 1806, R.string.menuitem_starred, 1807, R.string.menuitem_status_delete, 1808, R.string.menuitem_status_forward, 1809, R.string.menuitem_status_share, 1810, R.string.menuitem_status_share_with_fb, 1811, R.string.menuitem_unmute_notifications, 1812, R.string.menuitem_unpin, 1813, R.string.menuitem_whatsapp_web, 1814, R.string.message_cannot_forward_call, 1815, R.string.message_cannot_forward_unfinished_upload, 1816, R.string.message_contact, 1817, R.string.message_contact_name, 1818, R.string.message_copied, 1819, R.string.message_deleted, 1820, R.string.message_delivered, 1821, R.string.message_delivered_label, 1822, R.string.message_delivered_to, 1823, R.string.message_details, 1824, R.string.message_forward_failed, 1825, R.string.message_forward_media_missing, 1826, R.string.message_order_cta_business, 1827, R.string.message_order_cta_consumer, 1828, R.string.message_pending_label, 1829, R.string.message_played, 1830, R.string.message_played_by, 1831, R.string.message_preview_order, 1832, R.string.message_qr_continue_to_chat, 1833, R.string.message_qr_whatsapp_business_account, 1834, R.string.message_read, 1835, R.string.message_read_by, 1836, R.string.message_read_label, 1837, R.string.message_seen, 1838, R.string.message_seen_by, 1839, R.string.message_seen_label, 1840, R.string.message_sent, 1841, R.string.message_sent_label, 1842, R.string.messages, 1843, R.string.messages_failed_notification_message, 1844, R.string.messages_failed_notification_title, 1845, R.string.migration_direct_transfer_progress_message, 1846, R.string.migration_failed_to_migrate_generic_reason, 1847, R.string.migration_failed_to_migrate_internet_reason, 1848, R.string.migration_not_enough_space_on_phone_dialog_message, 1849, R.string.migration_not_enough_space_on_phone_dialog_title, 1850, R.string.migration_restore_from_backup_button, 1851, R.string.migration_restore_from_backup_text, 1852, R.string.migration_restore_from_source_app_details, 1853, R.string.migration_restore_from_source_app_do_not_close, 1854, R.string.migration_title, 1855, R.string.migration_title_error_title, 1856, R.string.migration_transferring_chats_and_media, 1857, R.string.missed_call, 1858, R.string.missed_call_again, 1859, R.string.missed_call_back, 1860, R.string.missed_call_from, 1861, R.string.missed_call_message, 1862, R.string.monday_at, 1863, R.string.more_from_this_business, 1864, R.string.move_your_location, 1865, R.string.msg_store_backup_db_message, 1866, R.string.msg_store_backup_db_message_with_percentage_placeholder, 1867, R.string.msg_store_backup_db_title, 1868, R.string.msg_store_backup_failed, 1869, R.string.msg_store_backup_failed_out_of_space, 1870, R.string.msg_store_backup_failed_out_of_space_shared_storage, 1871, R.string.msg_store_backup_failed_try_again_later, 1872, R.string.msg_store_backup_found, 1873, R.string.msg_store_backup_found_title, 1874, R.string.msg_store_backup_skipped, 1875, R.string.msg_store_backup_skipped_due_to_missing_sdcard_summary, 1876, R.string.msg_store_backup_skipped_due_to_missing_sdcard_title, 1877, R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_summary, 1878, R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title, 1879, R.string.msg_store_confirm, 1880, R.string.msg_store_creation_backup_message, 1881, R.string.msg_store_creation_backup_message_restore_due_to_error, 1882, R.string.msg_store_do_not_restore, 1883, R.string.msg_store_error_found, 1884, R.string.msg_store_error_not_restored, 1885, R.string.msg_store_lost_due_to_previous_error, 1886, R.string.msg_store_media_card_not_found_ask_retry, 1887, R.string.msg_store_media_card_not_found_ask_retry_shared_storage, 1888, R.string.msg_store_migrate_message, 1889, R.string.msg_store_migrate_title, 1890, R.string.msg_store_restore_db, 1891, R.string.msg_store_restore_db_description, 1892, R.string.msg_store_unable_to_start_restore_no_connectivity, 1893, R.string.msg_store_unable_to_start_restore_process, 1894, R.string.must_have_displayname, 1895, R.string.mute_always, 1896, R.string.mute_dialog_title, 1897, R.string.mute_instead, 1898, R.string.mute_status, 1899, R.string.mute_status_confirmation_message, 1900, R.string.mute_status_confirmation_title, 1901, R.string.mute_until_date_time, 1902, R.string.mute_until_today, 1903, R.string.mute_until_tomorrow, 1904, R.string.muted_updates, 1905, R.string.my_info, 1906, R.string.my_status, 1907, R.string.my_status_list, 1908, R.string.my_status_more_options_content_description, 1909, R.string.name_icon_description, 1910, R.string.need_sd_card, 1911, R.string.need_sd_card_shared_storage, 1912, R.string.network_required, 1913, R.string.network_required_airplane_on, 1914, R.string.network_usage_calls, 1915, R.string.network_usage_last_reset_time, 1916, R.string.never, 1917, R.string.new_broadcast, 1918, R.string.new_contact, 1919, R.string.new_country_code_content_description, 1920, R.string.new_group, 1921, R.string.new_group_call, 1922, R.string.new_group_info_prompt, 1923, R.string.new_group_n_contacts_selected, 1924, R.string.new_group_n_of_m_contacts_selected, 1925, R.string.new_list, 1926, R.string.next, 1927, R.string.no, 1928, R.string.no_access_permission, 1929, R.string.no_audio_files_found, 1930, R.string.no_blocked_contacts, 1931, R.string.no_calls, 1932, R.string.no_contacts_excluded, 1933, R.string.no_contacts_selected, 1934, R.string.no_documents_found, 1935, R.string.no_empty_info, 1936, R.string.no_empty_message, 1937, R.string.no_empty_name, 1938, R.string.no_emtpy_subject, 1939, R.string.no_favorited_gifs, 1940, R.string.no_forwarded_many_times_messages, 1941, R.string.no_group_photo, 1942, R.string.no_highly_forwarded_messages, 1943, R.string.no_info_to_delete, 1944, R.string.no_internet_message, 1945, R.string.no_internet_title, 1946, R.string.no_known_contacts_invite, 1947, R.string.no_media_message_shared_storage, 1948, R.string.no_network_cannot_block, 1949, R.string.no_network_cannot_block_airplane, 1950, R.string.no_network_cannot_change_description, 1951, R.string.no_network_cannot_change_subject, 1952, R.string.no_network_cannot_unblock, 1953, R.string.no_network_cannot_unblock_airplane, 1954, R.string.no_one_saw_your_status, 1955, R.string.no_one_saw_your_status_because_you_disabled_read_receipts, 1956, R.string.no_phone_number_sim_error, 1957, R.string.no_phone_type, 1958, R.string.no_places_found, 1959, R.string.no_products_found, 1960, R.string.no_profile_photo, 1961, R.string.no_recent_emoji, 1962, R.string.no_recent_gifs, 1963, R.string.no_sim_error, 1964, R.string.no_starred_messages, 1965, R.string.no_thanks, 1966, R.string.no_urls_found, 1967, R.string.no_valid_participant, 1968, R.string.no_wallpaper, 1969, R.string.none, 1970, R.string.not_a_group_participant, 1971, R.string.not_a_group_participant_short, 1972, R.string.not_ephemeral_message, 1973, R.string.not_found, 1974, R.string.not_now, 1975, R.string.not_spam, 1976, R.string.not_spam_description, 1977, R.string.notification_audio_message_from, 1978, R.string.notification_available_headline_app_name, 1979, R.string.notification_available_message, 1980, R.string.notification_companion_device_verification_description, 1981, R.string.notification_companion_device_verification_title, 1982, R.string.notification_future_message, 1983, R.string.notification_future_payment, 1984, R.string.notification_login_failure, 1985, R.string.notification_login_failure_headline_app_name, 1986, R.string.notification_payment_kyc_completed_message, 1987, R.string.notification_payment_kyc_completed_title, 1988, R.string.notification_payment_kyc_pending_message, 1989, R.string.notification_payment_kyc_pending_title, 1990, R.string.notification_post_registration_logout_headline_app_name, 1991, R.string.notification_post_registration_logout_message, 1992, R.string.notification_post_registration_logout_title, 1993, R.string.notification_pre_registration, 1994, R.string.notification_pre_registration_headline_app_name, 1995, R.string.notification_quick_reply, 1996, R.string.notification_settings_description, 1997, R.string.notification_settings_title_calls, 1998, R.string.notification_settings_title_groups, 1999, R.string.notification_settings_title_messages, 2000, R.string.notification_text_gcm_fg, 2001, R.string.notification_text_live_location_fg, 2002, R.string.notification_text_portal_client, 2003, R.string.notification_text_web_client, 2004, R.string.notification_ticker_header, 2005, R.string.notification_ticker_live_location_fg, 2006, R.string.notification_ticker_portal_client, 2007, R.string.notification_ticker_web_client, 2008, R.string.notification_voice_message_from, 2009, R.string.notification_web_session_verification_description, 2010, R.string.notification_web_session_verification_title, 2011, R.string.number_of_photos_and_videos, 2012, R.string.nux_instruction_text, 2013, R.string.nux_one_contact_prompt, 2014, R.string.nux_three_contact_prompt, 2015, R.string.nux_two_contact_prompt, 2016, R.string.ok, 2017, R.string.ok_got_it, 2018, R.string.ok_short, 2019, R.string.old_country_code_content_description, 2020, R.string.ongoing_group_video_call, 2021, R.string.ongoing_group_voice_call, 2022, R.string.ongoing_voice_call, 2023, R.string.only_admins_can_message_lowercase, 2024, R.string.only_admins_can_msg, 2025, R.string.open, 2026, R.string.open_video_externally, 2027, R.string.opening_catalog, 2028, R.string.opening_deep_link, 2029, R.string.opening_product, 2030, R.string.order_deleted_error, 2031, R.string.order_item_price_quantity, 2032, R.string.order_sent_date_and_time, 2033, R.string.others_device_login_chat_message_info, 2034, R.string.others_device_logout_chat_message_info, 2035, R.string.others_multiple_device_change_chat_message_info, 2036, R.string.outgoing_call, 2037, R.string.overlay_reregister, 2038, R.string.p2m_transaction_status_receiver_completed, 2039, R.string.p2m_transaction_status_sender_completed, 2040, R.string.p2p_transaction_status_receiver_completed, 2041, R.string.p2p_transaction_status_sender_completed, 2042, R.string.participant_adding, 2043, R.string.participant_removing, 2044, R.string.participants_count, 2045, R.string.pause, 2046, R.string.payment, 2047, R.string.payment_could_not_load, 2048, R.string.payment_data_localized_preview_notif, 2049, R.string.payment_data_localized_preview_notif_to_other, 2050, R.string.payment_data_localized_preview_to_me, 2051, R.string.payment_data_localized_preview_to_other, 2052, R.string.payment_future_text, 2053, R.string.payment_id_copied, 2054, R.string.payment_my_request_declined, 2055, R.string.payment_placeholder_message, 2056, R.string.payment_request, 2057, R.string.payment_request_canceled, 2058, R.string.payment_request_canceled_by_me, 2059, R.string.payment_request_declined_by_me, 2060, R.string.payment_row_request_short_status, 2061, R.string.payment_row_transaction_short_status, 2062, R.string.payment_support_topic_flow_primary_title, 2063, R.string.payment_support_topic_flow_secondary_title, 2064, R.string.payment_system_event_my_request_declined, 2065, R.string.payment_system_event_my_request_declined_no_amount, 2066, R.string.payment_system_event_request_canceled, 2067, R.string.payment_system_event_request_canceled_by_me, 2068, R.string.payment_system_event_request_canceled_by_me_no_amount, 2069, R.string.payment_system_event_request_canceled_no_amount, 2070, R.string.payment_system_event_request_declined, 2071, R.string.payment_system_event_request_declined_no_amount, 2072, R.string.payment_tap_to_retry, 2073, R.string.payment_unblock_ask, 2074, R.string.payment_unblock_error, 2075, R.string.payment_unblock_reject_ask, 2076, R.string.payments_accept_payment, 2077, R.string.payments_activity_title, 2078, R.string.payments_cancel_request, 2079, R.string.payments_cs_email_disabled, 2080, R.string.payments_decline_request, 2081, R.string.payments_invite_system_message, 2082, R.string.payments_message_bubble_status_label_desc_daily_limit_exceeded, 2083, R.string.payments_message_bubble_status_label_desc_expiration_sub_minute, 2084, R.string.payments_message_bubble_status_label_desc_expiring, 2085, R.string.payments_no_transaction_details, 2086, R.string.payments_pay_request, 2087, R.string.payments_pill_status_with_separator, 2088, R.string.payments_pill_status_without_separator, 2089, R.string.payments_request_canceling, 2090, R.string.payments_request_canceling_failure_message, 2091, R.string.payments_request_message_from_me_expired, 2092, R.string.payments_request_message_from_me_failed, 2093, R.string.payments_request_message_from_me_rejected, 2094, R.string.payments_request_message_to_me_success, 2095, R.string.payments_request_short_message, 2096, R.string.payments_request_short_message_from_you, 2097, R.string.payments_request_short_message_sent_by_you, 2098, R.string.payments_request_short_status, 2099, R.string.payments_request_short_status_from_you, 2100, R.string.payments_request_status_canceled, 2101, R.string.payments_request_status_rejected, 2102, R.string.payments_request_status_request_declined, 2103, R.string.payments_request_status_request_expired, 2104, R.string.payments_request_status_request_wait, 2105, R.string.payments_request_status_requester_wait, 2106, R.string.payments_request_status_scheduled, 2107, R.string.payments_request_system_message_from_me_expired, 2108, R.string.payments_request_system_message_to_me_expired, 2109, R.string.payments_retry_withdrawal, 2110, R.string.payments_send_payment_again, 2111, R.string.payments_send_payment_reminder_msg_text, 2112, R.string.payments_send_payment_text, 2113, R.string.payments_setup_account_reminder_button_text, 2114, R.string.payments_setup_account_reminder_msg_text, 2115, R.string.payments_support_email_topic_prefix, 2116, R.string.payments_support_search_help_center_title, 2117, R.string.payments_transaction_incorrect_pin, 2118, R.string.payments_transaction_insufficient_balance, 2119, R.string.payments_transaction_max_pin_retries, 2120, R.string.payments_transaction_message_from_me_refunded, 2121, R.string.payments_transaction_short_status, 2122, R.string.payments_transaction_short_status_to_you, 2123, R.string.payments_transaction_status_canceling, 2124, R.string.payments_transaction_status_complete, 2125, R.string.payments_transaction_status_expired, 2126, R.string.payments_transaction_status_failed, 2127, R.string.payments_transaction_status_pending, 2128, R.string.payments_transaction_status_processing, 2129, R.string.payments_transaction_status_unknown, 2130, R.string.payments_transaction_system_message_from_me_failed_day_and_month, 2131, R.string.payments_transaction_system_message_from_me_failed_no_timestamp, 2132, R.string.payments_transaction_system_message_from_me_failed_on_friday, 2133, R.string.payments_transaction_system_message_from_me_failed_on_monday, 2134, R.string.payments_transaction_system_message_from_me_failed_on_saturday, 2135, R.string.payments_transaction_system_message_from_me_failed_on_sunday, 2136, R.string.payments_transaction_system_message_from_me_failed_on_thursday, 2137, R.string.payments_transaction_system_message_from_me_failed_on_tuesday, 2138, R.string.payments_transaction_system_message_from_me_failed_on_wednesday, 2139, R.string.payments_transaction_system_message_from_me_failed_today, 2140, R.string.payments_transaction_system_message_from_me_failed_yesterday, 2141, R.string.payments_transaction_system_message_from_me_refunded_day_and_month, 2142, R.string.payments_transaction_system_message_from_me_refunded_failure, 2143, R.string.payments_transaction_system_message_from_me_refunded_failure_no_timestamp, 2144, R.string.payments_transaction_system_message_from_me_refunded_no_timestamp, 2145, R.string.payments_transaction_system_message_from_me_refunded_on_friday, 2146, R.string.payments_transaction_system_message_from_me_refunded_on_monday, 2147, R.string.payments_transaction_system_message_from_me_refunded_on_saturday, 2148, R.string.payments_transaction_system_message_from_me_refunded_on_sunday, 2149, R.string.payments_transaction_system_message_from_me_refunded_on_thursday, 2150, R.string.payments_transaction_system_message_from_me_refunded_on_tuesday, 2151, R.string.payments_transaction_system_message_from_me_refunded_on_wednesday, 2152, R.string.payments_transaction_system_message_from_me_refunded_today, 2153, R.string.payments_transaction_system_message_from_me_refunded_yesterday, 2154, R.string.payments_transaction_system_message_generic, 2155, R.string.payments_transaction_system_message_to_me_success_with_hiccup_day_and_month, 2156, R.string.payments_transaction_system_message_to_me_success_with_hiccup_no_timestamp, 2157, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_friday, 2158, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_monday, 2159, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_saturday, 2160, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_sunday, 2161, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_thursday, 2162, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_tuesday, 2163, R.string.payments_transaction_system_message_to_me_success_with_hiccup_on_wednesday, 2164, R.string.payments_transaction_system_message_to_me_success_with_hiccup_today, 2165, R.string.payments_transaction_system_message_to_me_success_with_hiccup_yesterday, 2166, R.string.payments_unavailable_generic_description, 2167, R.string.payments_unavailable_title, 2168, R.string.payments_unavailable_underage_description, 2169, R.string.payments_upgrade_error, 2170, R.string.peer_in_another_call, 2171, R.string.permission_cam_access, 2172, R.string.permission_cam_access_on_attaching_photo, 2173, R.string.permission_cam_access_on_attaching_photo_request, 2174, R.string.permission_cam_access_on_attaching_video, 2175, R.string.permission_cam_access_on_attaching_video_request, 2176, R.string.permission_cam_access_on_contact_qr_scan, 2177, R.string.permission_cam_access_on_contact_qr_scan_request, 2178, R.string.permission_cam_access_on_incoming_call, 2179, R.string.permission_cam_access_on_incoming_call_locked_screen, 2180, R.string.permission_cam_access_on_incoming_call_locked_screen_request, 2181, R.string.permission_cam_access_on_incoming_call_request, 2182, R.string.permission_cam_access_on_outcoming_call_locked_screen, 2183, R.string.permission_cam_access_on_outcoming_call_request, 2184, R.string.permission_cam_access_on_verify_identity, 2185, R.string.permission_cam_access_on_verify_identity_request, 2186, R.string.permission_cam_access_on_video_call, 2187, R.string.permission_cam_access_on_video_call_request, 2188, R.string.permission_cam_access_on_wa_web_connect, 2189, R.string.permission_cam_access_on_wa_web_connect_request, 2190, R.string.permission_cam_access_request, 2191, R.string.permission_cam_on_post_status, 2192, R.string.permission_cam_on_post_status_request, 2193, R.string.permission_cancel, 2194, R.string.permission_contacts_access_for_gdrive_backup, 2195, R.string.permission_contacts_access_for_gdrive_backup_request, 2196, R.string.permission_contacts_access_on_gdrive_restore, 2197, R.string.permission_contacts_access_on_gdrive_restore_request, 2198, R.string.permission_contacts_access_on_new_broadcast, 2199, R.string.permission_contacts_access_on_new_broadcast_request, 2200, R.string.permission_contacts_access_on_new_call, 2201, R.string.permission_contacts_access_on_new_call_request, 2202, R.string.permission_contacts_access_on_new_group, 2203, R.string.permission_contacts_access_on_new_group_request, 2204, R.string.permission_contacts_access_on_notify_contacts_change_number, 2205, R.string.permission_contacts_access_on_notify_contacts_change_number_request, 2206, R.string.permission_contacts_access_on_sending_contact, 2207, R.string.permission_contacts_access_on_sending_contact_request, 2208, R.string.permission_contacts_access_request, 2209, R.string.permission_contacts_needed, 2210, R.string.permission_continue, 2211, R.string.permission_flash_call_permission_title, 2212, R.string.permission_flash_call_read_call_log_telephone_permission_needed, 2213, R.string.permission_flash_call_read_call_log_telephone_request, 2214, R.string.permission_flash_call_telephone_permission_needed, 2215, R.string.permission_flash_call_telephone_request, 2216, R.string.permission_location_access_on_sending_location, 2217, R.string.permission_location_access_on_sending_location_request, 2218, R.string.permission_location_access_on_sending_location_short, 2219, R.string.permission_location_access_on_updating_location, 2220, R.string.permission_location_access_on_updating_location_request, 2221, R.string.permission_mic_access, 2222, R.string.permission_mic_access_on_audio_msg, 2223, R.string.permission_mic_access_on_audio_msg_request, 2224, R.string.permission_mic_access_on_incoming_call, 2225, R.string.permission_mic_access_on_incoming_call_locked_screen, 2226, R.string.permission_mic_access_on_incoming_call_locked_screen_request, 2227, R.string.permission_mic_access_on_incoming_call_request, 2228, R.string.permission_mic_access_on_video_recording, 2229, R.string.permission_mic_access_on_video_recording_request, 2230, R.string.permission_mic_access_request, 2231, R.string.permission_mic_and_cam_access_on_incoming_call, 2232, R.string.permission_mic_and_cam_access_on_incoming_call_locked_screen, 2233, R.string.permission_mic_and_cam_access_on_incoming_call_locked_screen_request, 2234, R.string.permission_mic_and_cam_access_on_incoming_call_request, 2235, R.string.permission_mic_and_cam_on_video_call, 2236, R.string.permission_mic_and_cam_on_video_call_request, 2237, R.string.permission_read_phone_number_permission_needed, 2238, R.string.permission_read_phone_number_request, 2239, R.string.permission_send_sms_permission_needed, 2240, R.string.permission_send_sms_request, 2241, R.string.permission_send_sms_telephone_permission_needed, 2242, R.string.permission_send_sms_telephone_request, 2243, R.string.permission_settings_open, 2244, R.string.permission_sms_request, 2245, R.string.permission_storage_cam_on_attaching_photo, 2246, R.string.permission_storage_cam_on_attaching_photo_request, 2247, R.string.permission_storage_cam_on_attaching_photo_v30, 2248, R.string.permission_storage_cam_on_attaching_video, 2249, R.string.permission_storage_cam_on_attaching_video_request, 2250, R.string.permission_storage_cam_on_attaching_video_v30, 2251, R.string.permission_storage_cam_on_camera_access, 2252, R.string.permission_storage_cam_on_camera_access_request, 2253, R.string.permission_storage_cam_on_camera_access_v30, 2254, R.string.permission_storage_cam_on_post_status, 2255, R.string.permission_storage_cam_on_post_status_request, 2256, R.string.permission_storage_cam_on_post_status_v30, 2257, R.string.permission_storage_cam_on_share_status, 2258, R.string.permission_storage_cam_on_share_status_request, 2259, R.string.permission_storage_cam_on_share_status_v30, 2260, R.string.permission_storage_contacts_on_gdrive_restore, 2261, R.string.permission_storage_contacts_on_gdrive_restore_request, 2262, R.string.permission_storage_contacts_on_gdrive_restore_v30, 2263, R.string.permission_storage_contacts_on_start_request, 2264, R.string.permission_storage_mic_on_audio_msg, 2265, R.string.permission_storage_mic_on_audio_msg_locked_screen, 2266, R.string.permission_storage_mic_on_audio_msg_locked_screen_request, 2267, R.string.permission_storage_mic_on_audio_msg_locked_screen_v30, 2268, R.string.permission_storage_mic_on_audio_msg_request, 2269, R.string.permission_storage_mic_on_audio_msg_v30, 2270, R.string.permission_storage_need_access, 2271, R.string.permission_storage_need_read_on_viewing_media, 2272, R.string.permission_storage_need_read_on_viewing_media_request, 2273, R.string.permission_storage_need_read_on_viewing_media_v30, 2274, R.string.permission_storage_need_write_access, 2275, R.string.permission_storage_need_write_access_on_attaching_photo, 2276, R.string.permission_storage_need_write_access_on_attaching_photo_request, 2277, R.string.permission_storage_need_write_access_on_attaching_photo_v30, 2278, R.string.permission_storage_need_write_access_on_attaching_video, 2279, R.string.permission_storage_need_write_access_on_attaching_video_request, 2280, R.string.permission_storage_need_write_access_on_attaching_video_v30, 2281, R.string.permission_storage_need_write_access_on_backup, 2282, R.string.permission_storage_need_write_access_on_backup_request, 2283, R.string.permission_storage_need_write_access_on_backup_v30, 2284, R.string.permission_storage_need_write_access_on_camera_access, 2285, R.string.permission_storage_need_write_access_on_camera_access_request, 2286, R.string.permission_storage_need_write_access_on_camera_access_v30, 2287, R.string.permission_storage_need_write_access_on_group_photo_update, 2288, R.string.permission_storage_need_write_access_on_group_photo_update_request, 2289, R.string.permission_storage_need_write_access_on_group_photo_update_v30, 2290, R.string.permission_storage_need_write_access_on_msg_download, 2291, R.string.permission_storage_need_write_access_on_msg_download_request, 2292, R.string.permission_storage_need_write_access_on_msg_download_v30, 2293, R.string.permission_storage_need_write_access_on_post_status, 2294, R.string.permission_storage_need_write_access_on_post_status_request, 2295, R.string.permission_storage_need_write_access_on_post_status_v30, 2296, R.string.permission_storage_need_write_access_on_profile_photo_view, 2297, R.string.permission_storage_need_write_access_on_profile_photo_view_request, 2298, R.string.permission_storage_need_write_access_on_profile_photo_view_v30, 2299, R.string.permission_storage_need_write_access_on_record_audio, 2300, R.string.permission_storage_need_write_access_on_record_audio_locked_screen, 2301, R.string.permission_storage_need_write_access_on_record_audio_locked_screen_request, 2302, R.string.permission_storage_need_write_access_on_record_audio_locked_screen_v30, 2303, R.string.permission_storage_need_write_access_on_record_audio_request, 2304, R.string.permission_storage_need_write_access_on_record_audio_v30, 2305, R.string.permission_storage_need_write_access_on_restore_from_backup, 2306, R.string.permission_storage_need_write_access_on_restore_from_backup_request, 2307, R.string.permission_storage_need_write_access_on_restore_from_backup_v30, 2308, R.string.permission_storage_need_write_access_on_restore_media, 2309, R.string.permission_storage_need_write_access_on_restore_media_request, 2310, R.string.permission_storage_need_write_access_on_restore_media_v30, 2311, R.string.permission_storage_need_write_access_on_sending_media, 2312, R.string.permission_storage_need_write_access_on_sending_media_request, 2313, R.string.permission_storage_need_write_access_on_sending_media_v30, 2314, R.string.permission_storage_need_write_access_on_sending_product, 2315, R.string.permission_storage_need_write_access_on_sending_product_request, 2316, R.string.permission_storage_need_write_access_on_sending_product_v30, 2317, R.string.permission_storage_need_write_access_on_sharing, 2318, R.string.permission_storage_need_write_access_on_sharing_request, 2319, R.string.permission_storage_need_write_access_on_sharing_v30, 2320, R.string.permission_storage_need_write_access_on_status_view, 2321, R.string.permission_storage_need_write_access_on_status_view_request, 2322, R.string.permission_storage_need_write_access_on_status_view_v30, 2323, R.string.permission_storage_need_write_access_on_storage_usage, 2324, R.string.permission_storage_need_write_access_on_storage_usage_request, 2325, R.string.permission_storage_need_write_access_on_storage_usage_v30, 2326, R.string.permission_storage_need_write_access_on_web_image_picking, 2327, R.string.permission_storage_need_write_access_on_web_image_picking_request, 2328, R.string.permission_storage_need_write_access_on_web_image_picking_v30, 2329, R.string.permission_storage_need_write_access_request, 2330, R.string.permission_storage_need_write_access_v30, 2331, R.string.permission_telephone_permission_needed, 2332, R.string.permission_telephone_request, 2333, R.string.permission_unable_to_start_ptt_in_popup, 2334, R.string.permission_unable_to_start_ptt_in_popup_screen_locked, 2335, R.string.personal_info_visibility, 2336, R.string.phone, 2337, R.string.phone_copied, 2338, R.string.phone_type_assistant, 2339, R.string.phone_type_callback, 2340, R.string.phone_type_car, 2341, R.string.phone_type_company_main, 2342, R.string.phone_type_fax_home, 2343, R.string.phone_type_fax_work, 2344, R.string.phone_type_home, 2345, R.string.phone_type_isdn, 2346, R.string.phone_type_main, 2347, R.string.phone_type_mms, 2348, R.string.phone_type_mobile, 2349, R.string.phone_type_other, 2350, R.string.phone_type_other_fax, 2351, R.string.phone_type_pager, 2352, R.string.phone_type_radio, 2353, R.string.phone_type_telex, 2354, R.string.phone_type_tty_tdd, 2355, R.string.phone_type_work, 2356, R.string.phone_type_work_mobile, 2357, R.string.phone_type_work_pager, 2358, R.string.photo_capture_failed, 2359, R.string.photo_changed_by, 2360, R.string.photo_changed_by_you, 2361, R.string.photo_faled_save_to_gallery, 2362, R.string.photo_loading, 2363, R.string.photo_nothing_found, 2364, R.string.photo_nothing_to_search, 2365, R.string.photo_removed_by, 2366, R.string.photo_removed_by_you, 2367, R.string.photo_saved_to_gallery, 2368, R.string.photo_search_failed, 2369, R.string.pick_a_country, 2370, R.string.pick_photos_gallery_title, 2371, R.string.pick_videos_gallery_title, 2372, R.string.pick_wallpaper_title, 2373, R.string.pictures, 2374, R.string.pinned_location, 2375, R.string.place_search_hint, 2376, R.string.play_gif_descr, 2377, R.string.play_video, 2378, R.string.please_turn_volume_up, 2379, R.string.please_use_contact_button_prompt, 2380, R.string.plus_n, 2381, R.string.poor_connection, 2382, R.string.popup_notification_disabled_message, 2383, R.string.popup_notification_not_available, 2384, R.string.post_registration_logout_dialog_message, 2385, R.string.post_registration_logout_dialog_negative_button, 2386, R.string.pre_registration_do_not_share_code_dialog_message, 2387, R.string.pre_registration_do_not_share_code_dialog_title, 2388, R.string.preview_audio, 2389, R.string.print_invite_link_qr_code, 2390, R.string.privacy_contacts, 2391, R.string.privacy_everyone, 2392, R.string.privacy_icon_description, 2393, R.string.privacy_info_dialog_bsp, 2394, R.string.privacy_info_dialog_bsp_fb, 2395, R.string.privacy_info_dialog_e2ee_incoming, 2396, R.string.privacy_info_dialog_e2ee_outgoing, 2397, R.string.privacy_info_dialog_fb, 2398, R.string.privacy_messaging, 2399, R.string.privacy_nobody, 2400, R.string.privacy_settings, 2401, R.string.privacy_settings_loading, 2402, R.string.processing, 2403, R.string.product_image_download_failed, 2404, R.string.product_image_download_failed_too_old, 2405, R.string.product_message_sent, 2406, R.string.product_not_exist, 2407, R.string.product_share_description, 2408, R.string.product_share_email_subject, 2409, R.string.product_share_text_template, 2410, R.string.product_share_title, 2411, R.string.profile_info_and_phone, 2412, R.string.profile_photo_reminder, 2413, R.string.profile_photo_removed, 2414, R.string.profile_photo_updated, 2415, R.string.profile_settings_about_section_title, 2416, R.string.profile_settings_name_section_title, 2417, R.string.profile_settings_phone_section_title, 2418, R.string.qr_code_hint, 2419, R.string.qr_code_hint_2, 2420, R.string.qr_dialog_content, 2421, R.string.qr_dialog_title, 2422, R.string.qr_scan_with_payments_scanner, 2423, R.string.qr_scan_with_web_scanner, 2424, R.string.qr_settings_description, 2425, R.string.qr_title_add_account, 2426, R.string.quantity_picker_title, 2427, R.string.quick_message_search_confirmation, 2428, R.string.quick_message_search_no_internet, 2429, R.string.rating_1, 2430, R.string.rating_2, 2431, R.string.rating_3, 2432, R.string.rating_4, 2433, R.string.rating_5, 2434, R.string.read_more, 2435, R.string.read_only_media_message, 2436, R.string.read_only_media_message_shared_storage, 2437, R.string.read_receipts_info, 2438, R.string.recall_message_confirmation, 2439, R.string.received, 2440, R.string.received_cart, 2441, R.string.recent, 2442, R.string.recent_gifs, 2443, R.string.recent_updates, 2444, R.string.record_audio_description, 2445, R.string.record_audio_send, 2446, R.string.record_audio_stop, 2447, R.string.record_need_sd_card_message, 2448, R.string.record_need_sd_card_message_shared_storage, 2449, R.string.record_need_sd_card_title, 2450, R.string.record_need_sd_card_title_shared_storage, 2451, R.string.record_video, 2452, R.string.recording_audio_message, 2453, R.string.refresh, 2454, R.string.register_bad_cc_length_with_placeholders, 2455, R.string.register_bad_cc_valid, 2456, R.string.register_bad_format_with_number, 2457, R.string.register_bad_number, 2458, R.string.register_bad_phone, 2459, R.string.register_bad_phone_too_long, 2460, R.string.register_bad_phone_too_short, 2461, R.string.register_bad_token, 2462, R.string.register_check_connectivity, 2463, R.string.register_check_connectivity_code_verififcation, 2464, R.string.register_choose_country, 2465, R.string.register_connecting, 2466, R.string.register_contact_support, 2467, R.string.register_edit_button, 2468, R.string.register_empty_phone, 2469, R.string.register_failure_noname, 2470, R.string.register_first, 2471, R.string.register_guessed_too_fast, 2472, R.string.register_guessed_too_fast_with_time, 2473, R.string.register_invalid_cc, 2474, R.string.register_invalid_cc_cap, 2475, R.string.register_name_hint, 2476, R.string.register_name_info, 2477, R.string.register_name_profile, 2478, R.string.register_no_internet_connectivity, 2479, R.string.register_number_mistyped_suggestion, 2480, R.string.register_number_mistyped_toast, 2481, R.string.register_phone_header_experiment, 2482, R.string.register_phone_number_code_confirm, 2483, R.string.register_phone_number_code_confirm_experiment, 2484, R.string.register_phone_number_sms_charge_warning, 2485, R.string.register_phone_phone_number_confirmation_message, 2486, R.string.register_phone_your_number, 2487, R.string.register_preparing, 2488, R.string.register_selected_country_content_description, 2489, R.string.register_server_sms_next_method, 2490, R.string.register_server_sms_next_method_with_wait_time, 2491, R.string.register_server_sms_too_many_tries_try_voice, 2492, R.string.register_server_sms_too_many_tries_try_voice_with_wait_time, 2493, R.string.register_server_voice_next_method, 2494, R.string.register_server_voice_next_method_with_wait_time, 2495, R.string.register_server_voice_too_many_tries, 2496, R.string.register_server_voice_too_many_tries_try_sms, 2497, R.string.register_server_voice_too_many_tries_try_sms_with_wait_time, 2498, R.string.register_should_upgrade_market, 2499, R.string.register_should_upgrade_website, 2500, R.string.register_sms_provider_timeout, 2501, R.string.register_sms_provider_timeout_unspecified, 2502, R.string.register_sms_provider_unroutable, 2503, R.string.register_sms_provider_unroutable_unspecified, 2504, R.string.register_sms_request_message, 2505, R.string.register_stale, 2506, R.string.register_tapped_link_no_phone_number, 2507, R.string.register_temporarily_unavailable, 2508, R.string.register_temporarily_unavailable_with_time, 2509, R.string.register_try_again_later, 2510, R.string.register_try_is_too_recent, 2511, R.string.register_try_is_too_recent_unspecified, 2512, R.string.register_unrecoverable_error, 2513, R.string.register_user_is_banned_bottom, 2514, R.string.register_user_is_banned_top, 2515, R.string.register_user_support_button, 2516, R.string.register_verify_again, 2517, R.string.register_voice_input_error_maximum, 2518, R.string.register_voice_input_error_maximum_with_time, 2519, R.string.register_voice_input_error_message, 2520, R.string.register_voice_input_error_message_with_time, 2521, R.string.register_voice_provider_timeout, 2522, R.string.register_voice_provider_timeout_unspecified, 2523, R.string.register_voice_provider_unroutable, 2524, R.string.register_voice_provider_unroutable_unspecified, 2525, R.string.register_voice_request_error_maximum_with_time, 2526, R.string.register_voice_request_message, 2527, R.string.register_voice_verifying, 2528, R.string.register_wait_message, 2529, R.string.register_xmpp_title, 2530, R.string.registration_cellular_network_required, 2531, R.string.registration_help, 2532, R.string.registration_reset, 2533, R.string.reject_the_call, 2534, R.string.remove, 2535, R.string.remove_contact_name_from_group, 2536, R.string.remove_contact_name_from_list, 2537, R.string.remove_files_from_sd_card, 2538, R.string.remove_files_from_shared_storage, 2539, R.string.remove_group_icon_confirmation, 2540, R.string.remove_item_from_cart, 2541, R.string.remove_participant_dialog_title, 2542, R.string.remove_photo, 2543, R.string.remove_profile_photo, 2544, R.string.remove_profile_photo_confirmation, 2545, R.string.remove_recipient_dialog_title, 2546, R.string.remove_star, 2547, R.string.removed_product, 2548, R.string.reply_button_description, 2549, R.string.reply_button_label, 2550, R.string.reply_privately, 2551, R.string.reply_to_label, 2552, R.string.report_and_block, 2553, R.string.report_and_block_confirmation, 2554, R.string.report_and_leave_confirmation, 2555, R.string.report_biz, 2556, R.string.report_block_business_also, 2557, R.string.report_business_ask, 2558, R.string.report_contact, 2559, R.string.report_contact_ask, 2560, R.string.report_exit_group_also, 2561, R.string.report_group, 2562, R.string.report_group_ask, 2563, R.string.report_spam, 2564, R.string.report_spam_description, 2565, R.string.reporting_flow_general_group, 2566, R.string.reporting_flow_general_one_on_one, 2567, R.string.reporting_flow_general_one_on_one_with_business, 2568, R.string.reporting_spam_title, 2569, R.string.request_account_info_icon_description, 2570, R.string.request_cannot_be_rejected, 2571, R.string.resend_message, 2572, R.string.reset_group_invite_link_and_qr_code_confirmation, 2573, R.string.reset_link_complete, 2574, R.string.reset_link_confirmation, 2575, R.string.reset_notifications, 2576, R.string.restore_from_older, 2577, R.string.retry, 2578, R.string.reverse_image_search_confirmation, 2579, R.string.revoke, 2580, R.string.revoke_delete_for_everyone, 2581, R.string.revoke_delete_for_me, 2582, R.string.revoke_invite, 2583, R.string.revoke_invite_confirm, 2584, R.string.revoke_invite_link, 2585, R.string.revoke_nux, 2586, R.string.revoked_msg_incoming, 2587, R.string.revoked_msg_outgoing, 2588, R.string.revoking_invite, 2589, R.string.revoking_invite_failure, 2590, R.string.revoking_invite_success, 2591, R.string.ringing, 2592, R.string.roaming, 2593, R.string.room_attachment, 2594, R.string.room_create, 2595, R.string.room_installed_error, 2596, R.string.rooms_continue_in_messenger, 2597, R.string.rooms_create_link_in_messenger_continue, 2598, R.string.rooms_create_link_in_messenger_nux, 2599, R.string.rooms_non_e2e_warning, 2600, R.string.rooms_nux_title, 2601, R.string.rotate, 2602, R.string.rotate_left, 2603, R.string.rotate_right, 2604, R.string.saturday_at, 2605, R.string.save, 2606, R.string.save_to_gallery, 2607, R.string.scan_code, 2608, R.string.scan_qr_code, 2609, R.string.scan_qr_education_title, 2610, R.string.scan_qr_from_gallery_action, 2611, R.string.sdcard_restore_general_info, 2612, R.string.search_audio, 2613, R.string.search_by_image, 2614, R.string.search_by_image_failed, 2615, R.string.search_contact_sent_generic_location, 2616, R.string.search_contact_sent_generic_location_from_you, 2617, R.string.search_contact_sent_voice_message_from_you, 2618, R.string.search_contact_token_prefix, 2619, R.string.search_contact_voice_message_from_other, 2620, R.string.search_country_hint, 2621, R.string.search_docs, 2622, R.string.search_earlier, 2623, R.string.search_help_center, 2624, R.string.search_gifs, 2625, R.string.search_group_participants, 2626, R.string.search_hint, 2627, R.string.search_images, 2628, R.string.search_later, 2629, R.string.search_links, 2630, R.string.search_no_matches, 2631, R.string.search_no_results, 2632, R.string.search_no_results_found, 2633, R.string.search_section_chats, 2634, R.string.search_section_contacts, 2635, R.string.search_section_messages, 2636, R.string.search_section_starred_messages, 2637, R.string.search_videos, 2638, R.string.search_web, 2639, R.string.searching, 2640, R.string.searching_image, 2641, R.string.security_card_description_for_in_app_support, 2642, R.string.security_icon_description, 2643, R.string.select_all, 2644, R.string.select_all_conversations, 2645, R.string.select_contacts, 2646, R.string.select_group_admin_search_hint, 2647, R.string.select_group_admin_title, 2648, R.string.select_info, 2649, R.string.select_list_item_tap_to_select, 2650, R.string.select_location, 2651, R.string.select_multiple, 2652, R.string.select_multiple_title, 2653, R.string.select_phone_number_dialog_title, 2654, R.string.select_phone_number_subtitle, 2655, R.string.select_status_recipients, 2656, R.string.select_status_recipients_black_list, 2657, R.string.select_status_recipients_explanation, 2658, R.string.select_status_recipients_my_contacts, 2659, R.string.select_status_recipients_title, 2660, R.string.select_status_recipients_white_list, 2661, R.string.select_this_location, 2662, R.string.select_your_current_location, 2663, R.string.selected_contact_content_description, 2664, R.string.self_device_change_group_chat_message, 2665, R.string.self_device_change_list_chat_message, 2666, R.string.self_device_login_chat_message_info, 2667, R.string.self_device_login_group_chat_message_info, 2668, R.string.self_device_login_list_chat_message_info, 2669, R.string.self_device_logout_chat_message_info, 2670, R.string.self_device_logout_group_chat_message_info, 2671, R.string.self_device_logout_list_chat_message_info, 2672, R.string.self_multiple_device_change_chat_message_info, 2673, R.string.self_multiple_device_change_group_chat_message_info, 2674, R.string.self_multiple_device_change_list_chat_message_info, 2675, R.string.send, 2676, R.string.send_button, 2677, R.string.send_cart_disclaimer, 2678, R.string.send_conversation_via, 2679, R.string.send_gif, 2680, R.string.send_group_invite_title, 2681, R.string.send_location, 2682, R.string.send_message_to_contact_button, 2683, R.string.send_status_my_contacts, 2684, R.string.send_this_location, 2685, R.string.send_to, 2686, R.string.send_to_business, 2687, R.string.send_to_business_description, 2688, R.string.send_to_contact, 2689, R.string.send_your_current_location, 2690, R.string.sender_not_a_contact, 2691, R.string.sender_not_a_contact_high_verified, 2692, R.string.sender_not_a_contact_low_or_unknown_verified, 2693, R.string.sending_and_failed_statuses, 2694, R.string.sending_audio_to_contact, 2695, R.string.sending_file_to_contact, 2696, R.string.sending_gif_to_contact, 2697, R.string.sending_message, 2698, R.string.sending_messages, 2699, R.string.sending_messages_and_status, 2700, R.string.sending_reply, 2701, R.string.sending_status, 2702, R.string.sending_status_failed, 2703, R.string.sending_status_progress, 2704, R.string.sending_video_to_contact, 2705, R.string.sent, 2706, R.string.sent_to_group, 2707, R.string.sent_to_person, 2708, R.string.server_psa_test, 2709, R.string.server_tell_client_update_to_decrypt, 2710, R.string.set_as, 2711, R.string.set_as_group_icon_wa_gallery, 2712, R.string.set_as_profile_photo_wa_gallery, 2713, R.string.settings_about, 2714, R.string.settings_account_info, 2715, R.string.settings_autodownload_all, 2716, R.string.settings_autodownload_message, 2717, R.string.settings_autodownload_none, 2718, R.string.settings_autodownload_roaming_warning, 2719, R.string.settings_backup_db_now_message, 2720, R.string.settings_backup_db_now_message_with_progress_percentage_placeholder, 2721, R.string.settings_block_list_summary, 2722, R.string.settings_block_list_with_none, 2723, R.string.settings_block_list_with_number_placeholder, 2724, R.string.settings_calls_low_data_summary, 2725, R.string.settings_chat, 2726, R.string.settings_chat_sound, 2727, R.string.settings_chat_sound_summary, 2728, R.string.settings_connected_accounts, 2729, R.string.settings_data_network_usage_amount_received, 2730, R.string.settings_data_network_usage_amount_sent, 2731, R.string.settings_delete_account_change_number_question, 2732, R.string.settings_delete_account_confirmation, 2733, R.string.settings_delete_account_confirmation_info, 2734, R.string.settings_delete_account_confirmation_info_drive, 2735, R.string.settings_delete_account_confirmation_info_drive_and_payments, 2736, R.string.settings_delete_account_confirmation_info_payments, 2737, R.string.settings_delete_account_short, 2738, R.string.settings_dialog_title, 2739, R.string.settings_faq, 2740, R.string.settings_font_size_with_value, 2741, R.string.settings_gdrive_account_name, 2742, R.string.settings_gdrive_account_name_long, 2743, R.string.settings_gdrive_account_name_missing_value, 2744, R.string.settings_gdrive_another_backup_running_message, 2745, R.string.settings_gdrive_authenticating_with_google_servers_message, 2746, R.string.settings_gdrive_authenticating_with_google_servers_title, 2747, R.string.settings_gdrive_backup_finishing_message, 2748, R.string.settings_gdrive_backup_finishing_message_with_percentage_placeholder, 2749, R.string.settings_gdrive_backup_frequency_option_daily, 2750, R.string.settings_gdrive_backup_frequency_option_manual, 2751, R.string.settings_gdrive_backup_frequency_option_monthly, 2752, R.string.settings_gdrive_backup_frequency_option_off, 2753, R.string.settings_gdrive_backup_frequency_option_weekly, 2754, R.string.settings_gdrive_backup_general_info_sdcard_short, 2755, R.string.settings_gdrive_backup_general_info_shared_storage_short, 2756, R.string.settings_gdrive_backup_msgstore_restore_message, 2757, R.string.settings_gdrive_backup_msgstore_restore_message_with_percentage_placeholder, 2758, R.string.settings_gdrive_backup_network_setting_option_wifi, 2759, R.string.settings_gdrive_backup_network_setting_option_wifi_and_cellular, 2760, R.string.settings_gdrive_backup_network_setting_option_wifi_summary, 2761, R.string.settings_gdrive_backup_now_category_title, 2762, R.string.settings_gdrive_backup_options_title, 2763, R.string.settings_gdrive_backup_pending_on_low_battery, 2764, R.string.settings_gdrive_backup_pending_on_wifi_message_cellular_connection_available, 2765, R.string.settings_gdrive_backup_pending_on_wifi_message_no_data_connection_available, 2766, R.string.settings_gdrive_backup_preparation_message, 2767, R.string.settings_gdrive_backup_preparation_message_with_percentage_placeholder, 2768, R.string.settings_gdrive_backup_progress_message_with_percentage, 2769, R.string.settings_gdrive_category_title, 2770, R.string.settings_gdrive_e2e_message, 2771, R.string.settings_gdrive_error_data_network_not_available_message, 2772, R.string.settings_gdrive_error_wifi_not_available_message, 2773, R.string.settings_gdrive_include_videos_settings_title, 2774, R.string.settings_gdrive_network_settings_title, 2775, R.string.settings_gdrive_please_wait_for_backup_to_finish_before_account_change, 2776, R.string.settings_gdrive_please_wait_for_backup_to_finish_before_change, 2777, R.string.settings_gdrive_please_wait_for_media_restore_to_finish_before_account_change, 2778, R.string.settings_gdrive_please_wait_for_restore_to_finish_before_account_change, 2779, R.string.settings_gdrive_restore_media_pending_on_data_network_not_available_message, 2780, R.string.settings_gdrive_restore_media_pending_on_low_battery, 2781, R.string.settings_gdrive_restore_media_preparation_message, 2782, R.string.settings_gdrive_restore_media_preparation_message_with_percentage_placeholder, 2783, R.string.settings_gdrive_restore_pending_on_wifi_not_available_message, 2784, R.string.settings_gdrive_restore_progress_message_with_percentage, 2785, R.string.settings_gdrive_restore_running_message, 2786, R.string.settings_gdrive_unable_to_access_this_account, 2787, R.string.settings_general, 2788, R.string.settings_group_notification, 2789, R.string.settings_help, 2790, R.string.settings_linked_accounts, 2791, R.string.settings_media_visibility, 2792, R.string.settings_msg_store_backup_now, 2793, R.string.settings_msg_store_cannot_backup, 2794, R.string.settings_msg_store_last_backup, 2795, R.string.settings_network_service_is_normal, 2796, R.string.settings_network_service_unavailable, 2797, R.string.settings_network_usage_reset_prompt, 2798, R.string.settings_network_usages_time_since_refresh_date, 2799, R.string.settings_notification_reset, 2800, R.string.settings_notification_reset_warning, 2801, R.string.settings_privacy_app_auth_notification_description, 2802, R.string.settings_privacy_app_auth_notification_title, 2803, R.string.settings_privacy_app_auth_timeout, 2804, R.string.settings_privacy_biometric, 2805, R.string.settings_privacy_biometric_message, 2806, R.string.settings_privacy_fingerprint, 2807, R.string.settings_privacy_fingerprint_message, 2808, R.string.settings_privacy_group_add_permissions, 2809, R.string.settings_privacy_group_add_permissions_message, 2810, R.string.settings_privacy_group_add_permissions_title, 2811, R.string.settings_privacy_info, 2812, R.string.settings_privacy_last_seen, 2813, R.string.settings_privacy_live_location, 2814, R.string.settings_privacy_message, 2815, R.string.settings_privacy_profile_photo, 2816, R.string.settings_privacy_read_receipts, 2817, R.string.settings_privacy_security_section_biometric_title, 2818, R.string.settings_privacy_security_section_title, 2819, R.string.settings_privacy_status, 2820, R.string.settings_profile_info, 2821, R.string.settings_push_name_summary, 2822, R.string.settings_qr, 2823, R.string.settings_security_info_with_link, 2824, R.string.settings_security_info_with_link_v2, 2825, R.string.settings_security_link, 2826, R.string.settings_security_notifications_toggle_info, 2827, R.string.settings_security_notifications_toggle_info_v2, 2828, R.string.settings_security_notifications_toggle_title, 2829, R.string.settings_show_media_in_gallery_summary, 2830, R.string.settings_show_media_in_gallery_title, 2831, R.string.settings_sound_silent, 2832, R.string.settings_storage_and_data_usage, 2833, R.string.settings_storage_and_data_usage_enhanced, 2834, R.string.settings_storage_usage, 2835, R.string.settings_terms_and_privacy_policy, 2836, R.string.settings_theme, 2837, R.string.settings_theme_battery_saver, 2838, R.string.settings_theme_dark, 2839, R.string.settings_theme_dialog_title, 2840, R.string.settings_theme_follow_system, 2841, R.string.settings_theme_light, 2842, R.string.settings_two_factor_auth_add_email, 2843, R.string.settings_two_factor_auth_change_code, 2844, R.string.settings_two_factor_auth_change_email, 2845, R.string.settings_two_factor_auth_disable, 2846, R.string.settings_two_factor_auth_disable_confirm, 2847, R.string.settings_two_factor_auth_enable, 2848, R.string.settings_two_factor_auth_info_disabled, 2849, R.string.settings_two_factor_auth_info_enabled, 2850, R.string.settings_voip_low_data_usage_title_enhanced, 2851, R.string.shape_picker_emoji_tab_text, 2852, R.string.shape_picker_favorite_stickers, 2853, R.string.shape_picker_recents_subcategory_content_description, 2854, R.string.shape_picker_section_content_stickers, 2855, R.string.shape_picker_section_shapes, 2856, R.string.shape_picker_sticker_pack_subcategory_content_description, 2857, R.string.share, 2858, R.string.share_contact, 2859, R.string.share_email_body_item_description, 2860, R.string.share_email_body_item_link, 2861, R.string.share_email_body_item_price, 2862, R.string.share_email_subject_audio, 2863, R.string.share_email_subject_document, 2864, R.string.share_email_subject_file, 2865, R.string.share_email_subject_gif, 2866, R.string.share_email_subject_image, 2867, R.string.share_email_subject_video, 2868, R.string.share_failed, 2869, R.string.share_file_format_unsupport, 2870, R.string.share_invite_link_message, 2871, R.string.share_invite_link_qr_code, 2872, R.string.share_invite_link_subject, 2873, R.string.share_invite_link_title, 2874, R.string.share_invite_link_via, 2875, R.string.share_link, 2876, R.string.share_link_via_whatsapp, 2877, R.string.share_live_location, 2878, R.string.share_shops_link, 2879, R.string.share_to_facebook_story, 2880, R.string.share_to_other_apps, 2881, R.string.share_too_many_items_with_placeholder, 2882, R.string.shared_internal_storage_restore_general_info, 2883, R.string.sharing_status_generic_error, 2884, R.string.sharing_status_mix_fblite, 2885, R.string.sharing_status_videos_fblite, 2886, R.string.shortcut_camera, 2887, R.string.show_collapsed_statuses_btn_text, 2888, R.string.show_in_settings, 2889, R.string.show_places_list, 2890, R.string.single_linked_device_logout_error_title, 2891, R.string.size, 2892, R.string.skin_tone_emoji_tip, 2893, R.string.small_case_subject, 2894, R.string.smb_about_logo_content_description, 2895, R.string.smb_business_profile_business_info, 2896, R.string.smb_eu_tos_update_dialog_message, 2897, R.string.smb_eu_tos_update_dialog_title, 2898, R.string.smb_eu_tos_update_dialog_view_updates_button, 2899, R.string.smb_register_possible_migration, 2900, R.string.smb_upsell_chat_banner_description, 2901, R.string.sms_invite, 2902, R.string.sms_notification_headline_unverified_app_name, 2903, R.string.sms_notification_headline_verified_app_name, 2904, R.string.sms_notification_message_unverified, 2905, R.string.sms_notification_message_verified, 2906, R.string.sms_notification_title_unverified, 2907, R.string.sms_notification_title_verified, 2908, R.string.sms_reset, 2909, R.string.sms_sms, 2910, R.string.software_about_to_expire_title, 2911, R.string.software_expired, 2912, R.string.software_expired_beta_opt_out, 2913, R.string.software_expired_beta_opt_out_button, 2914, R.string.software_expired_current_date, 2915, R.string.software_expired_get_from_play, 2916, R.string.software_expired_get_from_play_with_date, 2917, R.string.software_expired_with_date, 2918, R.string.solid_color_wallpaper, 2919, R.string.sort_by, 2920, R.string.sort_by_newest, 2921, R.string.sort_by_oldest, 2922, R.string.sort_by_size, 2923, R.string.spam_generic, 2924, R.string.spam_generic_data_connection_missing, 2925, R.string.spam_generic_unknown_time_left, 2926, R.string.spam_title, 2927, R.string.spam_too_many_blocks, 2928, R.string.spam_too_many_groups, 2929, R.string.spam_too_many_messages, 2930, R.string.spam_too_many_messages_broadcasted, 2931, R.string.spam_too_many_people, 2932, R.string.starred, 2933, R.string.starred_gifs, 2934, R.string.starred_message_header_sender_to_recipient_content_description, 2935, R.string.starred_messages, 2936, R.string.starred_messages_in_selection, 2937, R.string.start_group_chat, 2938, R.string.start_group_chat_explanation, 2939, R.string.status, 2940, R.string.status_contact_excluded_description, 2941, R.string.status_contact_not_excluded_description, 2942, R.string.status_contact_not_selected_description, 2943, R.string.status_contact_selected_description, 2944, R.string.status_deleted, 2945, R.string.status_education_with_placeholder, 2946, R.string.status_expire_explanation_with_placeholder, 2947, R.string.status_media_privacy_contacts, 2948, R.string.status_media_privacy_custom, 2949, R.string.status_privacy, 2950, R.string.status_privacy_tip, 2951, R.string.status_recipients_black_list, 2952, R.string.status_recipients_white_list, 2953, R.string.status_settings_updated, 2954, R.string.statuses, 2955, R.string.sticker_delete_button, 2956, R.string.sticker_delete_with_size_button, 2957, R.string.sticker_details_view_more, 2958, R.string.sticker_download_button, 2959, R.string.sticker_download_with_size_button, 2960, R.string.sticker_failed_to_download, 2961, R.string.sticker_favorited_content_description, 2962, R.string.sticker_file_too_big_to_share, 2963, R.string.sticker_new_pack_badge, 2964, R.string.sticker_pack_content_description, 2965, R.string.sticker_pack_downloading, 2966, R.string.sticker_pack_downloading_with_name, 2967, R.string.sticker_pack_loading, 2968, R.string.sticker_pack_loading_with_name, 2969, R.string.sticker_pack_preview_back_button_content_description, 2970, R.string.sticker_pack_removal_confirmation, 2971, R.string.sticker_pack_update, 2972, R.string.sticker_pack_update_content_description, 2973, R.string.sticker_pack_update_with_size, 2974, R.string.sticker_pack_update_with_size_content_description, 2975, R.string.sticker_picker_get_stickers, 2976, R.string.sticker_picker_no_favorited_stickers, 2977, R.string.sticker_picker_no_reaction_stickers, 2978, R.string.sticker_picker_no_recent_no_installed, 2979, R.string.sticker_picker_no_sent_stickers, 2980, R.string.sticker_picker_no_stickers, 2981, R.string.sticker_picker_no_stickers_in_pack, 2982, R.string.sticker_reaction_lol_content_description, 2983, R.string.sticker_reaction_love_content_description, 2984, R.string.sticker_reaction_sad_content_description, 2985, R.string.sticker_reaction_wow_content_description, 2986, R.string.sticker_recents_content_description, 2987, R.string.sticker_remove_from_favorites, 2988, R.string.sticker_remove_from_recents_option, 2989, R.string.sticker_remove_from_tray, 2990, R.string.sticker_remove_from_tray_title, 2991, R.string.sticker_save_to_favorites, 2992, R.string.sticker_save_to_picker, 2993, R.string.sticker_save_to_picker_title, 2994, R.string.sticker_search_get_more_stickers, 2995, R.string.sticker_search_hint, 2996, R.string.sticker_search_no_results, 2997, R.string.sticker_search_tab_all, 2998, R.string.sticker_search_tab_angry, 2999, R.string.sticker_search_tab_celebrate, 3000, R.string.sticker_search_tab_content_description, 3001, R.string.sticker_search_tab_greetings, 3002, R.string.sticker_search_tab_happy, 3003, R.string.sticker_search_tab_love, 3004, R.string.sticker_search_tab_sad, 3005, R.string.sticker_starred_snackbar_message, 3006, R.string.sticker_store_back_button_content_description, 3007, R.string.sticker_store_content_description, 3008, R.string.sticker_store_delete_pack_content_description, 3009, R.string.sticker_store_delete_pack_with_size_content_description, 3010, R.string.sticker_store_download_failed, 3011, R.string.sticker_store_download_pack_content_description, 3012, R.string.sticker_store_download_pack_with_size_content_description, 3013, R.string.sticker_store_downloaded_content_description, 3014, R.string.sticker_store_featured_empty, 3015, R.string.sticker_store_featured_tab_title, 3016, R.string.sticker_store_get_more_packs_footer, 3017, R.string.sticker_store_my_empty, 3018, R.string.sticker_store_my_tab_title, 3019, R.string.sticker_store_pack_preview_author, 3020, R.string.sticker_store_pack_preview_tap_to_view_sticker, 3021, R.string.sticker_store_pack_preview_title, 3022, R.string.sticker_store_progress_loading, 3023, R.string.sticker_store_reorder_pack_content_description, 3024, R.string.sticker_store_reorder_pack_footer, 3025, R.string.sticker_store_title, 3026, R.string.sticker_tab_content_description, 3027, R.string.sticker_third_party_pack_add_progress_message_with_app, 3028, R.string.sticker_third_party_pack_add_success_message_with_app, 3029, R.string.sticker_third_party_pack_added_already_with_app, 3030, R.string.sticker_third_party_pack_invalid_with_app, 3031, R.string.sticker_tray_icon_content_description, 3032, R.string.sticker_unstarred_snackbar_message, 3033, R.string.stickers, 3034, R.string.stickers_no_results, 3035, R.string.stickers_picker_blocked_dialog_button_positive, 3036, R.string.stickers_picker_blocked_dialog_message, 3037, R.string.stickers_picker_blocked_dialog_title, 3038, R.string.stop, 3039, R.string.storage_usage_almost_full_banner_body, 3040, R.string.storage_usage_almost_full_banner_title, 3041, R.string.storage_usage_cleanup_suggestions_title, 3042, R.string.storage_usage_delete_dialog_duplicate_checkbox_text, 3043, R.string.storage_usage_delete_dialog_starred_checkbox_text, 3044, R.string.storage_usage_delete_dialog_starred_item_multiple_subtitle, 3045, R.string.storage_usage_delete_dialog_starred_item_single_subtitle, 3046, R.string.storage_usage_detail_clearing_messages, 3048, R.string.storage_usage_forwarded_files_title, 3060, R.string.storage_usage_large_files_title, 3061, R.string.storage_usage_media, 3062, R.string.storage_usage_no_chats, 3063, R.string.storage_usage_other, 3064, R.string.storage_usage_preview_overlay_text, 3065, R.string.subject_change_not_authorized, 3066, R.string.submit, 3067, R.string.sunday_at, 3068, R.string.suspicious_link_dialog_description, 3069, R.string.suspicious_link_dialog_title, 3070, R.string.suspicious_link_label, 3071, R.string.suspicious_link_warning_negative_button_text, 3072, R.string.suspicious_link_warning_positive_button_text, 3073, R.string.swipe_to_reply_education, 3074, R.string.swipe_up_to_accept, 3075, R.string.swipe_up_to_accept_upgrade, 3076, R.string.swipe_up_to_decline, 3077, R.string.swipe_up_to_decline_upgrade, 3078, R.string.swipe_up_to_end_and_accept, 3079, R.string.swipe_up_to_reply, 3080, R.string.switch_camera, 3081, R.string.switch_to_back_camera, 3082, R.string.switch_to_front_camera, 3083, R.string.switch_to_grid, 3084, R.string.switch_to_list, 3085, R.string.system_message_security_code_notif_not_available, 3086, R.string.system_status_broadcast_description, 3087, R.string.system_status_broadcast_description_recently, 3088, R.string.system_status_broadcast_feature, 3089, R.string.system_status_chat_description_full, 3090, R.string.system_status_chat_description_full_recently, 3091, R.string.system_status_down_suffix, 3092, R.string.system_status_down_suffix_recently, 3093, R.string.system_status_down_try_suffix, 3094, R.string.system_status_email_question, 3095, R.string.system_status_group_description, 3096, R.string.system_status_group_description_recently, 3097, R.string.system_status_group_feature, 3098, R.string.system_status_last_description, 3099, R.string.system_status_last_description_recently, 3100, R.string.system_status_last_feature, 3101, R.string.system_status_multimedia_description, 3102, R.string.system_status_multimedia_description_recently, 3103, R.string.system_status_multimedia_feature, 3104, R.string.system_status_multiple_down_prefix, 3105, R.string.system_status_multiple_down_prefix_recently, 3106, R.string.system_status_multiple_down_suffix, 3107, R.string.system_status_multiple_down_suffix_recently, 3108, R.string.system_status_online_description, 3109, R.string.system_status_online_description_recently, 3110, R.string.system_status_online_feature, 3111, R.string.system_status_profile_description, 3112, R.string.system_status_profile_description_recently, 3113, R.string.system_status_profile_feature, 3114, R.string.system_status_push_description, 3115, R.string.system_status_push_description_recently, 3116, R.string.system_status_push_feature, 3117, R.string.system_status_registration_description, 3118, R.string.system_status_status_description, 3119, R.string.system_status_status_description_recently, 3120, R.string.system_status_status_feature, 3121, R.string.system_status_sync_description, 3122, R.string.system_status_sync_description_recently, 3123, R.string.system_status_sync_feature, 3124, R.string.system_status_title, 3125, R.string.system_status_version_description, 3126, R.string.system_status_version_description_recently, 3127, R.string.take_picture, 3128, R.string.talkback_error_prefix, 3129, R.string.tap_for_group_info, 3130, R.string.tap_for_list_info, 3131, R.string.tap_for_more, 3132, R.string.tap_to_cancel, 3133, R.string.tap_to_retry_add_participant, 3134, R.string.tap_to_return_to_call, 3135, R.string.tap_to_select, 3136, R.string.tap_to_transfer, 3137, R.string.tap_to_view, 3138, R.string.tap_unblock, 3139, R.string.task_killer_detected, 3140, R.string.task_killer_info_modern, 3141, R.string.tb_banner_dismiss, 3142, R.string.tb_button_downloading, 3143, R.string.tb_button_uploading, 3144, R.string.tb_please_use_contact_button_prompt, 3145, R.string.tell_a_friend_email_body, 3146, R.string.tell_a_friend_email_subject, 3147, R.string.tell_a_friend_sms, 3148, R.string.tell_a_friend_via, 3149, R.string.tell_friends, 3150, R.string.terms_icon_description, 3151, R.string.thursday_at, 3152, R.string.time_and_date, 3153, R.string.timeout_qr_code, 3154, R.string.title, 3155, R.string.title_gdpr_report, 3156, R.string.title_remove, 3157, R.string.today_at, 3158, R.string.too_old_for_download, 3159, R.string.tool_tip_open_map, 3160, R.string.topic_picker_default_header, 3161, R.string.tos_age_announce, 3162, R.string.tos_age_tip, 3163, R.string.tos_agree, 3164, R.string.tos_agree_now, 3165, R.string.tos_next, 3166, R.string.tos_not_now, 3167, R.string.tos_registration_info, 3168, R.string.tos_text_screen_1, 3169, R.string.tos_text_screen_1_expired, 3170, R.string.tos_text_screen_2, 3171, R.string.tos_title_screen_2, 3172, R.string.transaction_status_auth_cancel_failed, 3173, R.string.transaction_status_auth_cancel_failed_processing, 3174, R.string.transaction_status_auth_cancelling, 3175, R.string.transaction_status_collect_success_expiring, 3176, R.string.transaction_status_collect_success_receiver_sub_minute, 3177, R.string.transaction_status_collect_success_sender_sub_minute, 3178, R.string.transaction_status_da_sender_with_placeholders, 3179, R.string.transaction_status_description_status_unset, 3180, R.string.transaction_status_failed, 3181, R.string.transaction_status_failed_processing, 3182, R.string.transaction_status_failed_processing_general, 3183, R.string.transaction_status_failed_processing_will_refund, 3184, R.string.transaction_status_incoming_payment_limit_reached, 3185, R.string.transaction_status_incoming_payment_limit_reached_detailed, 3186, R.string.transaction_status_pending_payment_expiring, 3187, R.string.transaction_status_pending_receiver_setup_sub_minute, 3188, R.string.transaction_status_pending_refund_with_placeholders, 3189, R.string.transaction_status_pending_setup_sub_minute, 3190, R.string.transaction_status_receiver_expired, 3191, R.string.transaction_status_refund_failed, 3192, R.string.transaction_status_refunded, 3193, R.string.transaction_status_refunded_expired, 3194, R.string.transaction_status_refunded_pending, 3195, R.string.transaction_status_refunded_pending_expired, 3196, R.string.transaction_status_sender_expired, 3197, R.string.transaction_timestamp_format, 3198, R.string.transaction_timestamp_format_friday, 3199, R.string.transaction_timestamp_format_monday, 3200, R.string.transaction_timestamp_format_saturday, 3201, R.string.transaction_timestamp_format_sunday, 3202, R.string.transaction_timestamp_format_thursday, 3203, R.string.transaction_timestamp_format_tuesday, 3204, R.string.transaction_timestamp_format_wednesday, 3205, R.string.triggered_block_header, 3206, R.string.try_these_faq, 3207, R.string.tuesday_at, 3208, R.string.two_factor_auth_accidental_sms_error, 3209, R.string.two_factor_auth_code_changed, 3210, R.string.two_factor_auth_code_guessed_too_fast_message, 3211, R.string.two_factor_auth_code_info_with_placeholder, 3212, R.string.two_factor_auth_code_mismatch_error, 3213, R.string.two_factor_auth_code_nag_explanation, 3214, R.string.two_factor_auth_code_nag_title, 3215, R.string.two_factor_auth_code_verification_error, 3216, R.string.two_factor_auth_confirm_code_info, 3217, R.string.two_factor_auth_disabled, 3218, R.string.two_factor_auth_disabling, 3219, R.string.two_factor_auth_email_changed, 3220, R.string.two_factor_auth_email_confirmation, 3221, R.string.two_factor_auth_email_hint, 3222, R.string.two_factor_auth_email_info, 3223, R.string.two_factor_auth_email_info_with_skip, 3224, R.string.two_factor_auth_email_mismatch, 3225, R.string.two_factor_auth_email_skip_confirm, 3226, R.string.two_factor_auth_enter_code_description_with_placeholder, 3227, R.string.two_factor_auth_forgot_code_info_with_time, 3228, R.string.two_factor_auth_reset_account_label, 3229, R.string.two_factor_auth_reset_info, 3230, R.string.two_factor_auth_reset_successful, 3231, R.string.two_factor_auth_reset_too_soon_message, 3232, R.string.two_factor_auth_reset_wipe_full_info, 3233, R.string.two_factor_auth_reset_wipe_offline_info, 3234, R.string.two_factor_auth_reset_wipe_secondary_confirmation, 3235, R.string.two_factor_auth_resetting_account, 3236, R.string.two_factor_auth_save_error, 3237, R.string.two_factor_auth_save_error_will_retry, 3238, R.string.two_factor_auth_saved, 3239, R.string.two_factor_auth_send_email_label, 3240, R.string.two_factor_auth_sending_email, 3241, R.string.two_factor_auth_submit, 3242, R.string.two_factor_auth_submitting, 3243, R.string.two_factor_auth_too_many_tries, 3244, R.string.two_factor_auth_verify_code_info, 3245, R.string.two_factor_auth_verify_title, 3246, R.string.two_factor_auth_wrong_code_message, 3247, R.string.type_a_message, 3248, R.string.type_a_reply, 3249, R.string.type_a_status, 3250, R.string.unable_to_add_participant_to_group_call, 3251, R.string.unable_to_display_url, 3252, R.string.unable_to_finish_download, 3253, R.string.unable_to_finish_download_product_image, 3254, R.string.unable_to_load_licenses, 3255, R.string.unable_to_play_gif, 3256, R.string.unable_to_share_contact, 3257, R.string.unarchive_all_chats, 3258, R.string.unarchive_all_chats_ask, 3259, R.string.unarchive_broadcast, 3260, R.string.unarchive_conversation, 3261, R.string.unblock, 3262, R.string.unblock_before_add_broadcast, 3263, R.string.unblock_before_add_group, 3264, R.string.unblock_before_add_group_call, 3265, R.string.unblock_before_call, 3266, R.string.unblock_before_chat, 3267, R.string.unblock_before_status, 3268, R.string.unblock_confirmation, 3269, R.string.unblock_payment_id_error_default, 3270, R.string.unblock_timeout, 3271, R.string.unblocked_business, 3272, R.string.unblocked_contact, 3273, R.string.underage_account_ban_description, 3274, R.string.underage_account_ban_title, 3275, R.string.undo, 3276, R.string.unimplemented, 3277, R.string.unknown_amount_payment, 3278, R.string.unknown_document_type, 3279, R.string.unknown_payment_recipient, 3280, R.string.unlock_app, 3281, R.string.unmute_status, 3282, R.string.unmute_status_confirmation_message, 3283, R.string.unmute_status_confirmation_title, 3284, R.string.unseen_messages_and_calls, 3285, R.string.unselect_all, 3286, R.string.unsent_and_starred_messages_in_selection, 3287, R.string.unsent_voice_message, 3288, R.string.unstar_all, 3289, R.string.unstar_all_confirmation, 3290, R.string.untitled_document, 3291, R.string.update_contact, 3292, R.string.update_whatsapp, 3293, R.string.updating_group_admins, 3294, R.string.updating_group_icon_dialog_title, 3295, R.string.updating_profile_photo_dialog_title, 3296, R.string.upgrade, 3297, R.string.upgrade_message, 3298, R.string.upgrade_question, 3299, R.string.usage, 3300, R.string.use, 3301, R.string.use_as_wallpaper, 3302, R.string.user_feedback_hint, 3303, R.string.validate_sticker_progress_message_with_app, 3304, R.string.vcard_click_to_see, 3305, R.string.vcard_format_unsupport, 3306, R.string.vcard_sent_by, 3307, R.string.vcard_sent_by_you, 3308, R.string.vcards_view_all, 3309, R.string.verification_retry_headline_app_name, 3310, R.string.verification_retry_message, 3311, R.string.verify_code, 3312, R.string.verify_code_need_to_request_code, 3313, R.string.verify_description_bottom, 3314, R.string.verify_description_bottom_code_input_disable, 3315, R.string.verify_identity_names, 3316, R.string.verify_identity_no_keys, 3317, R.string.verify_identity_notification_enable, 3318, R.string.verify_identity_notification_enabled_toast, 3319, R.string.verify_identity_notification_suggest_enable, 3320, R.string.verify_identity_qr_tip, 3321, R.string.verify_identity_result_wrong_contact, 3322, R.string.verify_identity_result_wrong_you, 3323, R.string.verify_identity_tip, 3324, R.string.verify_identity_tip_self_multiple_device, 3325, R.string.verify_resend_sms_button, 3326, R.string.verify_sms_description, 3327, R.string.verify_sms_description_call, 3328, R.string.verify_sms_description_no_auto_verification, 3329, R.string.verify_sms_description_wait, 3330, R.string.verify_sms_header, 3331, R.string.verify_sms_roaming_warning, 3332, R.string.verify_voice_call_button, 3333, R.string.verifying_group_invite, 3334, R.string.verifying_link_invite, 3335, R.string.version, 3336, R.string.video_call, 3337, R.string.video_call_confirmation_text, 3338, R.string.video_call_contact_name, 3339, R.string.video_call_end_button_description, 3340, R.string.video_call_fallback_to_voice_call, 3341, R.string.video_call_label, 3342, R.string.video_capture_failed, 3343, R.string.video_decode_paused, 3344, R.string.video_duration_seconds, 3345, R.string.video_gif_toggle, 3346, R.string.video_incoming_call, 3347, R.string.video_incoming_call_ticker, 3348, R.string.video_missed_call, 3349, R.string.video_missed_call_at, 3350, R.string.video_missed_call_from, 3351, R.string.video_missed_group_call, 3352, R.string.video_missed_group_call_at, 3353, R.string.video_ongoing_call, 3354, R.string.video_preview_description, 3355, R.string.video_selected, 3356, R.string.video_transfer_in_progress, 3357, R.string.view, 3358, R.string.view_business_of_contact_button, 3359, R.string.view_business_profile, 3360, R.string.view_cart, 3361, R.string.view_catalog, 3362, R.string.view_contact, 3363, R.string.view_contact_in_address_book, 3364, R.string.view_contact_name, 3365, R.string.view_contact_unsupport, 3366, R.string.view_contacts_button, 3367, R.string.view_gif_content_description, 3368, R.string.view_group, 3369, R.string.view_group_media, 3370, R.string.view_in_chat, 3371, R.string.view_in_gallery, 3372, R.string.view_invite, 3373, R.string.view_licenses, 3374, R.string.view_list_media, 3375, R.string.view_message, 3376, R.string.view_once_expired_photo, 3377, R.string.view_once_expired_video, 3378, R.string.view_once_photo, 3379, R.string.view_once_video, 3380, R.string.view_product, 3381, R.string.view_website, 3382, R.string.viewed_updates, 3383, R.string.vlevel_info_high, 3384, R.string.vlevel_info_high_with_contact_v2, 3385, R.string.vlevel_info_high_without_contact_v2, 3386, R.string.vlevel_info_low, 3387, R.string.vlevel_info_low_or_unknown_v2, 3388, R.string.vlevel_info_unknown, 3389, R.string.vlevel_transition_any_to_none, 3390, R.string.vlevel_transition_any_to_none_alert, 3391, R.string.vlevel_transition_any_to_none_alert_v2, 3392, R.string.vlevel_transition_any_to_none_v2, 3393, R.string.vlevel_transition_high_to_high_alert_v2, 3394, R.string.vlevel_transition_high_to_high_v2, 3395, R.string.vlevel_transition_high_to_low_or_unknown, 3396, R.string.vlevel_transition_high_to_low_or_unknown_alert, 3397, R.string.vlevel_transition_high_to_low_or_unknown_alert_v2, 3398, R.string.vlevel_transition_high_to_low_or_unknown_v2, 3399, R.string.vlevel_transition_low_or_unknown_to_high, 3400, R.string.vlevel_transition_low_or_unknown_to_high_alert, 3401, R.string.vlevel_transition_low_or_unknown_to_high_alert_v2, 3402, R.string.vlevel_transition_low_or_unknown_to_high_v2, 3403, R.string.vlevel_transition_low_to_unknown, 3404, R.string.vlevel_transition_low_to_unknown_alert, 3405, R.string.vlevel_transition_none_to_high, 3406, R.string.vlevel_transition_none_to_high_alert, 3407, R.string.vlevel_transition_none_to_low, 3408, R.string.vlevel_transition_none_to_low_alert, 3409, R.string.vlevel_transition_none_to_low_or_unknown_alert_v2, 3410, R.string.vlevel_transition_none_to_unknown, 3411, R.string.vlevel_transition_none_to_unknown_alert, 3412, R.string.vlevel_transition_unknown_to_low, 3413, R.string.vlevel_transition_unknown_to_low_alert, 3414, R.string.voice_call_contact_name, 3415, R.string.voice_message_description, 3416, R.string.voice_message_description_played, 3417, R.string.voice_message_description_sent, 3418, R.string.voice_message_description_sent_delivered, 3419, R.string.voice_message_description_sent_pending, 3420, R.string.voice_message_description_sent_played, 3421, R.string.voice_message_description_sent_read, 3422, R.string.voice_message_download_description, 3423, R.string.voice_message_lock_tip, 3424, R.string.voice_message_slide_to_cancel, 3425, R.string.voice_message_time_elapsed, 3426, R.string.voice_message_tip, 3427, R.string.voice_missed_call, 3428, R.string.voice_missed_call_at, 3429, R.string.voice_missed_group_call, 3430, R.string.voice_missed_group_call_at, 3431, R.string.voice_note_accessibility_cancel, 3432, R.string.voice_note_accessibility_send, 3433, R.string.voice_note_button, 3434, R.string.voice_note_draft_announcement, 3435, R.string.voice_note_draft_delete_label, 3436, R.string.voice_note_draft_send_description, 3437, R.string.voice_note_updated_record, 3438, R.string.voice_note_updated_record_instructions, 3439, R.string.voip_accessibility_incoming_call_label_with_placeholders, 3440, R.string.voip_activity_label, 3441, R.string.voip_android_pip_dismissed_for_call_ended, 3442, R.string.voip_android_pip_dismissed_for_non_supported_cases, 3443, R.string.voip_android_weak_wifi_network_switch_description, 3444, R.string.voip_app_update_dialog_content, 3445, R.string.voip_app_update_dialog_title, 3446, R.string.voip_blocked_contact, 3447, R.string.voip_call_add_person_description, 3448, R.string.voip_call_bluetooth_toggle_description, 3449, R.string.voip_call_call_info_btn_description, 3450, R.string.voip_call_camera_error, 3451, R.string.voip_call_connected, 3452, R.string.voip_call_during_call_error, 3453, R.string.voip_call_end_button_description, 3454, R.string.voip_call_end_call_confirmation, 3455, R.string.voip_call_failed_audio_record_issue, 3456, R.string.voip_call_failed_incompatible_cellular, 3457, R.string.voip_call_failed_incompatible_wifi, 3458, R.string.voip_call_failed_no_network, 3459, R.string.voip_call_flip_camera_description, 3460, R.string.voip_call_goto_chat_description, 3461, R.string.voip_call_incoming, 3462, R.string.voip_call_info_fragment_title, 3463, R.string.voip_call_label, 3464, R.string.voip_call_mute_toggle_description, 3465, R.string.voip_call_outgoing, 3466, R.string.voip_call_outgoing_peer_ringing, 3467, R.string.voip_call_setup_error, 3468, R.string.voip_call_speakerphone_toggle_description, 3469, R.string.voip_call_turn_off_video_btn_description, 3470, R.string.voip_call_turn_on_video_btn_description, 3471, R.string.voip_call_unmute_toggle_description, 3472, R.string.voip_call_waiting_end_and_accept, 3473, R.string.voip_connecting, 3474, R.string.voip_declined, 3475, R.string.voip_e2ee_label, 3476, R.string.voip_error_calling_self, 3477, R.string.voip_error_select_fewer_participants, 3478, R.string.voip_group_call_declined, 3479, R.string.voip_group_call_old_os_ver, 3480, R.string.voip_joinable_education_dialog_description, 3481, R.string.voip_joinable_education_dialog_header, 3482, R.string.voip_joinable_education_icon_content_description_video, 3483, R.string.voip_joinable_education_icon_content_description_voice, 3484, R.string.voip_not_allowed_callee_country, 3485, R.string.voip_not_allowed_caller_country, 3486, R.string.voip_not_allowed_needs_update, 3487, R.string.voip_not_allowed_never, 3488, R.string.voip_not_allowed_title, 3489, R.string.voip_not_answered, 3490, R.string.voip_not_connected_cellular, 3491, R.string.voip_not_connected_peer_fail, 3492, R.string.voip_not_connected_title, 3493, R.string.voip_not_connected_wifi, 3494, R.string.voip_not_enable_switch_voice_and_video_call, 3495, R.string.voip_not_support_switch_voice_and_video_call, 3496, R.string.voip_not_support_switch_voice_and_video_call_in_group_call, 3497, R.string.voip_on_hold, 3498, R.string.voip_peer_group_call_not_supported, 3499, R.string.voip_peer_muted, 3500, R.string.voip_peer_muted_camera_off, 3501, R.string.voip_peer_muted_video_paused, 3502, R.string.voip_peer_muted_video_paused_short, 3503, R.string.voip_peer_not_registered, 3504, R.string.voip_peer_video_paused, 3505, R.string.voip_peer_video_stopped, 3506, R.string.voip_phone_account_description, 3507, R.string.voip_pip_peer_muted, 3508, R.string.voip_pip_peer_muted_camera_off, 3509, R.string.voip_pip_peer_video_paused, 3510, R.string.voip_pip_peer_video_stopped, 3511, R.string.voip_reconnecting, 3512, R.string.voip_requested_upgrade_to_video_new, 3513, R.string.voip_requesting_upgrade_to_video, 3514, R.string.voip_requesting_upgrade_to_video_confirmation_positive_button_label, 3515, R.string.voip_requesting_upgrade_to_video_confirmation_text, 3516, R.string.voip_resume, 3517, R.string.voip_unavailable, 3518, R.string.voip_video_call_activity_label, 3519, R.string.voip_video_call_app_needs_update, 3520, R.string.voip_video_call_old_os_ver, 3521, R.string.voip_video_not_allowed_at_this_time, 3522, R.string.voip_video_not_enabled_for_caller, 3523, R.string.voip_video_upgrade_declined, 3524, R.string.voip_video_upgrade_timeout, 3525, R.string.wa_enterprise_encryption_state_change, 3526, R.string.wa_enterprise_encryption_state_change_description, 3527, R.string.wa_vlevel_info_high_with_contact_v2, 3528, R.string.wa_vlevel_info_high_without_contact_v2, 3529, R.string.wa_vlevel_transition_low_or_unknown_to_high_alert_v2, 3530, R.string.wa_vlevel_transition_none_to_high_alert, 3531, R.string.wa_vlevel_transition_none_to_high_alert_no_and_match_contact_v2, 3532, R.string.wa_vlevel_transition_none_to_high_alert_non_match_contact_v2, 3533, R.string.wallpaper_bubble_pinch_and_drag, 3534, R.string.wallpaper_bubble_this_is_the_default_whatsapp_wallpaper, 3535, R.string.wallpaper_categories_bright, 3536, R.string.wallpaper_categories_dark, 3537, R.string.wallpaper_categories_my_photos, 3538, R.string.wallpaper_change_current_wallpaper, 3539, R.string.wallpaper_chat_wallpaper_header, 3540, R.string.wallpaper_color_preview_swipe_left_or_right, 3541, R.string.wallpaper_custom_wallpaper_header, 3542, R.string.wallpaper_dark_theme_header, 3543, R.string.wallpaper_dialog_set_wallpaper, 3544, R.string.wallpaper_dialog_set_wallpaper_for_all_chats_dark_theme, 3545, R.string.wallpaper_dialog_set_wallpaper_for_all_chats_explanation, 3546, R.string.wallpaper_dialog_set_wallpaper_for_all_chats_light_theme, 3547, R.string.wallpaper_dialog_set_wallpaper_for_this_chat, 3548, R.string.wallpaper_dimming, 3549, R.string.wallpaper_drag_to_position, 3550, R.string.wallpaper_generic_contact_name, 3551, R.string.wallpaper_legacy_section_header_description, 3552, R.string.wallpaper_legacy_section_header_title, 3553, R.string.wallpaper_light_theme_header, 3554, R.string.wallpaper_package, 3555, R.string.wallpaper_pinch_to_zoom, 3556, R.string.wallpaper_preview, 3557, R.string.wallpaper_preview_chat_content_swipe_left, 3558, R.string.wallpaper_preview_chat_content_swipe_right, 3559, R.string.wallpaper_preview_dark_theme_description, 3560, R.string.wallpaper_preview_header, 3561, R.string.wallpaper_preview_light_theme_description, 3562, R.string.wallpaper_preview_set, 3563, R.string.wallpaper_preview_swipe_left_or_right, 3564, R.string.wallpaper_remove_custom_wallpaper, 3565, R.string.wallpaper_remove_custom_wallpaper_dialog_remove_prompt, 3566, R.string.wallpaper_remove_custom_wallpaper_dialog_title, 3567, R.string.wallpaper_reset, 3568, R.string.wallpaper_reset_wallpapers_dialog_description, 3569, R.string.wallpaper_reset_wallpapers_dialog_reset_button, 3570, R.string.wallpaper_reset_wallpapers_overflow_menu_option, 3571, R.string.wallpaper_set_dark_wallpaper_bubble_message, 3572, R.string.wallpaper_set_light_wallpaper_bubble_message, 3573, R.string.wallpaper_set_successful, 3574, R.string.wallpaper_set_wallpaper_button, 3575, R.string.wallpaper_set_with_custom_wallpaper_bubble_message, 3576, R.string.wallpaper_set_without_custom_wallpaper_bubble_message, 3577, R.string.wallpaper_solid_color_add_whatsapp_doodle, 3578, R.string.wallpaper_thumbnails_download_failed_dialog_content_network_error, 3579, R.string.wallpaper_thumbnails_download_failed_dialog_content_storage_error, 3580, R.string.wallpaper_thumbnails_download_failed_dialog_title, 3581, R.string.wallpaper_thumbnails_loading_error_message, 3582, R.string.wallpaper_thumbnails_reload, 3583, R.string.wallpaper_use_default_wallpaper, 3584, R.string.warning_opening_apk, 3585, R.string.warning_opening_document, 3586, R.string.warning_sms, 3587, R.string.warning_sms_default_app, 3588, R.string.watch, 3589, R.string.web_session_active, 3590, R.string.web_session_description_place_browser_os, 3591, R.string.web_session_last_date, 3592, R.string.web_session_last_today_at, 3593, R.string.web_session_last_yesterday_at, 3594, R.string.website_type_blog, 3595, R.string.website_type_ftp, 3596, R.string.website_type_home, 3597, R.string.website_type_homepage, 3598, R.string.website_type_other, 3599, R.string.website_type_profile, 3600, R.string.website_type_work, 3601, R.string.webview_error_external_browsing_blocked, 3602, R.string.webview_error_not_available, 3603, R.string.webview_error_not_https, 3604, R.string.webview_error_not_trusted, 3605, R.string.webview_loading, 3606, R.string.wednesday_at, 3607, R.string.welcome_ask_your_friends, 3608, R.string.welcome_available_platforms_consumer, 3609, R.string.welcome_available_platforms_india_consumer, 3610, R.string.welcome_available_platforms_india_smb, 3611, R.string.welcome_available_platforms_smb, 3612, R.string.welcome_calls_message, 3613, R.string.welcome_statuses_message, 3614, R.string.whatsapp_contacts, 3615, R.string.whatsapp_name, 3616, R.string.whatsapp_support, 3617, R.string.whatsapp_web, 3618, R.string.widget_content_hidden, 3619, R.string.wifi_blocked_explanation, 3620, R.string.wifi_network_blocked_explanation, 3621, R.string.wifi_speed_bump_dialog_body, 3622, R.string.wifi_speed_bump_dialog_cancel_button_text, 3623, R.string.wifi_speed_bump_dialog_title, 3624, R.string.wifi_speed_bump_dialog_use_data_button_text, 3625, R.string.wifi_unavailable_backup, 3626, R.string.without_media, 3627, R.string.write_nfc_tag, 3628, R.string.yes, 3629, R.string.yesterday_at, 3630, R.string.you, 3631, R.string.your_cart, 3632, R.string.your_live_location_marker_content_description, 3633, R.string.your_order, 3634, R.string.your_sent_cart, 3635});
    }

    public static void A1J(Context context) {
        com.whatsapp.util.Log.i("statusrankingstore/delete-database");
        File databasePath = context.getDatabasePath("statusranking.db");
        boolean delete = databasePath.delete();
        C001801b.A1p(databasePath, "statusrankingstore");
        StringBuilder sb = new StringBuilder("statusrankingstore/delete-database/result=");
        sb.append(delete);
        com.whatsapp.util.Log.i(sb.toString());
    }

    public static void A1K(Context context, Chip chip, int i, int i2) {
        C655630j r2 = (C655630j) A0T().get(i);
        Drawable A0c = C002001d.A0c(context.getResources(), r2.A03, null);
        int A022 = C008805h.A02(context, r2.A01);
        if (A0c == null) {
            throw null;
        }
        int max = Math.max(A0c.getIntrinsicWidth(), A0c.getIntrinsicHeight());
        int intrinsicWidth = ((max - A0c.getIntrinsicWidth()) >> 1) + A022;
        int intrinsicHeight = ((max - A0c.getIntrinsicHeight()) >> 1) + A022;
        chip.setChipIcon(C002001d.A0e(new InsetDrawable(A0c, intrinsicWidth, intrinsicHeight, intrinsicWidth, intrinsicHeight), C004302a.A00(context, i2)));
        chip.setChipIconSize((float) C008805h.A02(context, 20.0f));
        chip.setChipStartPadding((float) C008805h.A02(context, 1.0f));
        chip.setTextStartPadding((float) C008805h.A02(context, 1.0f));
        chip.setIconStartPadding((float) C008805h.A02(context, r2.A02));
        chip.setIconEndPadding((float) C008805h.A02(context, r2.A00));
    }

    public static void A1L(Context context, AbstractC07650Yy r9, AnonymousClass0MH r10) {
        if (r9 != null) {
            AnonymousClass02N r7 = r10.A08;
            Intent intent = new Intent(context, r9.A8K());
            boolean z = r10.A0M;
            String str = r10.A0H;
            if (intent.hasExtra("fMessageKeyJid") || intent.hasExtra("fMessageKeyFromMe") || intent.hasExtra("fMessageKeyId")) {
                throw new IllegalArgumentException("Intent already contains key.");
            }
            intent.putExtra("fMessageKeyId", str).putExtra("fMessageKeyFromMe", z).putExtra("fMessageKeyJid", AnonymousClass1VY.A0D(r7));
            intent.putExtra("extra_transaction_id", r10.A0G);
            context.startActivity(intent);
        }
    }

    public static void A1M(Intent intent, C61992u4 r3) {
        intent.putExtra("extra_payment_handle", r3.A09);
        intent.putExtra("extra_merchant_code", r3.A00);
        intent.putExtra("extra_transaction_ref", r3.A08);
        intent.putExtra("extra_payee_name", r3.A02);
        intent.putExtra("extra_transaction_ref_url", r3.A05);
        intent.putExtra("extra_payment_preset_amount", r3.A03);
        intent.putExtra("extra_transaction_id", r3.A07);
        intent.putExtra("extra_payment_preset_min_amount", r3.A04);
    }

    public static void A1N(Spannable spannable, C01970Ad r6, C02040Ak r7) {
        Pattern A8C;
        if (r7.A04() && (A8C = r6.A03().A8C()) != null) {
            Matcher matcher = A8C.matcher(spannable);
            while (matcher.find()) {
                Pair A002 = C667735w.A00(spannable, new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.end())), C667735w.A01);
                int intValue = ((Number) A002.first).intValue();
                int intValue2 = ((Number) A002.second).intValue();
                StringBuilder A0S = AnonymousClass008.A0S("wapay://pay/");
                A0S.append((Object) spannable.subSequence(intValue, intValue2));
                spannable.setSpan(new URLSpan(A0S.toString()), intValue, intValue2, 0);
            }
        }
    }

    public static void A1O(Spannable spannable, String str) {
        C12440i6 A002 = C12440i6.A00();
        AnonymousClass1F9 r4 = new AnonymousClass1F9(A002, spannable, A002.A0F(Integer.parseInt(str)), AnonymousClass1FA.A05);
        while (r4.hasNext()) {
            AnonymousClass1F6 r0 = (AnonymousClass1F6) r4.next();
            int i = r0.A00;
            Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(r0.A02.length() + i));
            if (!C667735w.A01(spannable, pair)) {
                pair = C667735w.A00(spannable, pair, C667735w.A02);
                if (C667735w.A01(spannable, pair)) {
                    if (pair == null) {
                    }
                }
            }
            StringBuilder A0S = AnonymousClass008.A0S("tel:");
            A0S.append((Object) spannable.subSequence(((Number) pair.first).intValue(), ((Number) pair.second).intValue()));
            spannable.setSpan(new URLSpan(A0S.toString()), ((Number) pair.first).intValue(), ((Number) pair.second).intValue(), 33);
        }
    }

    public static void A1P(View view) {
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
    }

    public static void A1Q(View view, int i) {
        StringBuilder sb = new StringBuilder("voip/VoipAnimationUtils/animateButtonIn delay:");
        sb.append(i);
        com.whatsapp.util.Log.i(sb.toString());
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setDuration(300);
        scaleAnimation.setStartOffset((long) i);
        view.startAnimation(scaleAnimation);
    }

    public static void A1R(View view, int i) {
        AlphaAnimation alphaAnimation;
        if (view != null) {
            if (i == 0) {
                alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            } else {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(125);
            alphaAnimation.setStartOffset((long) 0);
            alphaAnimation.setAnimationListener(new AnonymousClass3UX(view, i));
            view.startAnimation(alphaAnimation);
        }
    }

    public static void A1S(View view, boolean z) {
        view.setEnabled(z);
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        view.setAlpha(f);
    }

    public static void A1T(ImageView imageView, boolean z) {
        if (z) {
            imageView.setAlpha(1.0f);
            imageView.clearColorFilter();
            return;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        imageView.setAlpha(0.5f);
    }

    public static void A1U(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0);
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, null, listView);
                view.measure(makeMeasureSpec, 0);
                i += view.getMeasuredHeight();
            }
            listView.getLayoutParams().height = ((adapter.getCount() - 1) * listView.getDividerHeight()) + i;
            listView.requestLayout();
        }
    }

    public static void A1V(ProgressBar progressBar, int i) {
        if (progressBar != null && Build.VERSION.SDK_INT < 21) {
            Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                progressBar.setIndeterminateDrawable(indeterminateDrawable);
            }
            Drawable progressDrawable = progressBar.getProgressDrawable();
            if (progressDrawable != null) {
                progressDrawable.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
                progressBar.setProgressDrawable(progressDrawable);
            }
        }
    }

    public static void A1W(AnonymousClass05r r6, ImageView imageView, String str, String str2, C009405x r10) {
        Bitmap bitmap;
        if (str2 != null) {
            C42951xY r1 = r6.A01.A03;
            Context context = r6.A00;
            if (r1 == null) {
                throw null;
            } else if (C002001d.A3E(context)) {
                str = str2;
            }
        }
        C42931xW A002 = C42931xW.A00();
        C43111xo r4 = new C43111xo(r10, r6, imageView);
        AnonymousClass08V r3 = A002.A04;
        Reference reference = (Reference) r3.A03(str);
        if (reference == null || (bitmap = (Bitmap) reference.get()) == null) {
            ((AbstractC28091Sw) A002).A05.ANC(new C11010fZ(A002, str, r3, r4), new Void[0]);
        } else {
            r4.A00(bitmap);
        }
    }

    public static void A1X(ActivityC004702f r8, List list, boolean z, AnonymousClass00T r11, C04360Kb r12, AnonymousClass00D r13, AnonymousClass0A8 r14) {
        r8.A0G(R.string.register_wait_message);
        r11.ANC(new C52362b0(list, r12, z, SystemClock.elapsedRealtime(), new WeakReference(r8), r13, r14), new Object[0]);
    }

    public static void A1Y(AnonymousClass02M r2, AnonymousClass00T r3, AnonymousClass0CG r4, AnonymousClass02N r5, AnonymousClass35U r6) {
        AnonymousClass3SC r1 = new AnonymousClass3SC(r4, r5, r6);
        r3.ANC(r1, new Void[0]);
        r2.A02.postDelayed(new RunnableEBaseShape6S0200000_I1_1(r1, r6, 49), 500);
    }

    public static void A1Z(AnonymousClass00Y r6, Activity activity, AbstractC004502c r8, int i) {
        r8.APp(R.string.insufficient_storage_dialog_title, R.string.insufficient_storage_dialog_subtitle, R.string.manage_storage_button_text, new C42921xV(activity, A0o(i, r6), i), null);
    }

    public static void A1a(AnonymousClass00Y r3, AbstractC49282Pv r4) {
        int i;
        C44401zz r2 = new C44401zz();
        if (!(r4 instanceof C54672fJ)) {
            i = 0;
        } else {
            i = 1;
        }
        r2.A00 = Integer.valueOf(i);
        r3.A0B(r2, null, false);
    }

    public static void A1b(AnonymousClass21G r1, int i, String str, int i2) {
        r1.A01 = Integer.valueOf(i);
        r1.A06 = str;
        r1.A00 = Integer.valueOf(i2);
        r1.A02 = 2;
    }

    public static void A1c(C59592ny r6, AbstractC48882Od r7, Bitmap bitmap, int i, Drawable drawable, boolean z) {
        AnonymousClass0M3 r0;
        Context context = r6.getContext();
        if (bitmap == null) {
            r6.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int A9V = r7.A9V();
            if (A9V == 0) {
                r6.setBackgroundColor(i);
                r6.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else if (A9V == 1 || A9V == 2) {
                r6.setBackgroundColor(i);
                r6.setImageResource(R.drawable.ic_missing_thumbnail_video);
            } else if (A9V == 3) {
                AbstractC48882Od r1 = r6.A04;
                if (!(r1 instanceof AbstractC53892e0) || (r0 = ((AbstractC53892e0) r1).A00) == null || ((AbstractC007503q) r0).A04 != 1) {
                    r6.setBackgroundColor(C004302a.A00(context, R.color.music_scrubber));
                    r6.setImageResource(R.drawable.icon_audio_large);
                    return;
                }
                r6.setBackgroundColor(C004302a.A00(context, R.color.action_mode));
                r6.setImageResource(R.drawable.icon_ppt_large);
            } else if (A9V != 4) {
                r6.setBackgroundColor(i);
                r6.setImageResource(0);
            } else {
                r6.setBackgroundColor(i);
                r6.setImageDrawable(AnonymousClass0ZD.A04(context, r7.A7T(), null, true));
            }
        } else {
            r6.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r6.setBackgroundColor(0);
            r6.A00 = bitmap;
            if (z) {
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(context.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(150);
                r6.setImageDrawable(transitionDrawable);
                return;
            }
            r6.setImageBitmap(bitmap);
        }
    }

    public static void A1d(PaymentMethodRow paymentMethodRow, AnonymousClass1VM r3) {
        if (r3 instanceof C43761yu) {
            paymentMethodRow.A00.setImageResource(A07((C43761yu) r3));
            return;
        }
        Bitmap A05 = r3.A05();
        if (A05 != null) {
            paymentMethodRow.A00.setImageBitmap(A05);
        } else {
            paymentMethodRow.A00.setImageResource(R.drawable.av_bank);
        }
    }

    public static void A1e(AnonymousClass0MP r5, AudioPlayerView audioPlayerView, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3, View.OnClickListener onClickListener4, AbstractC656230q r11) {
        File file;
        AnonymousClass0M4 r2 = ((AnonymousClass0M3) r5).A02;
        if (r2 != null) {
            boolean z = false;
            if (AnonymousClass0FI.A0q(r5)) {
                audioPlayerView.setPlayButtonState(4);
                audioPlayerView.setOnControlButtonClickListener(onClickListener);
                audioPlayerView.setSeekbarProgress(0);
                r11.AKP(1);
            } else if (AnonymousClass0FI.A0r(r5)) {
                if (C003701u.A0E(((AnonymousClass0M3) r5).A08) && (file = r2.A0F) != null) {
                    ((AnonymousClass0M3) r5).A08 = file.getName();
                }
                audioPlayerView.setSeekbarColor(C004302a.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                audioPlayerView.setOnControlButtonClickListener(onClickListener4);
                r11.AKP(0);
            } else {
                AnonymousClass0M4 r1 = ((AnonymousClass0M3) r5).A02;
                if (!(!r5.A0n.A02 || r1 == null || r1.A0F == null)) {
                    z = true;
                }
                if (z) {
                    audioPlayerView.setPlayButtonState(2);
                    audioPlayerView.setOnControlButtonClickListener(onClickListener2);
                    audioPlayerView.setSeekbarColor(C004302a.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                    r11.AKP(3);
                    return;
                }
                audioPlayerView.setPlayButtonState(3);
                audioPlayerView.setOnControlButtonClickListener(onClickListener3);
                audioPlayerView.setSeekbarColor(C004302a.A00(audioPlayerView.getContext(), R.color.music_scrubber));
                r11.AKP(2);
            }
        } else {
            throw null;
        }
    }

    public static void A1f(AnonymousClass0MP r4, AudioPlayerView audioPlayerView, AbstractC656130o r6, AbstractC47572Im r7, AnonymousClass01X r8) {
        if (!C28301Tu.A08(r4)) {
            A1g(r4, audioPlayerView, r6, r8);
            return;
        }
        C28301Tu r3 = C28301Tu.A0i;
        if (r3 != null) {
            if (!r3.A0P()) {
                A1g(r4, audioPlayerView, r6, r8);
            } else {
                audioPlayerView.setPlayButtonState(1);
                audioPlayerView.setSeekbarProgress(r3.A09());
                audioPlayerView.setSeekbarMax(r3.A02);
                r6.AIW(0, C002001d.A1W(r8, (long) (r3.A09() / SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS)));
            }
            audioPlayerView.setSeekbarContentDescription((long) r3.A09());
            r3.A0E = r7;
        }
    }

    public static void A1g(AnonymousClass0MP r3, AudioPlayerView audioPlayerView, AbstractC656130o r5, AnonymousClass01X r6) {
        int intValue;
        long j;
        Number number = (Number) C28301Tu.A0j.get(r3.A0n);
        if (number == null) {
            intValue = 0;
        } else {
            intValue = number.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = 0;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(((AnonymousClass0M3) r3).A00 * SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        if (valueOf != null) {
            i = valueOf.intValue();
        }
        audioPlayerView.setSeekbarProgress(i);
        if (valueOf != null) {
            j = (long) valueOf.intValue();
        } else {
            j = 0;
        }
        audioPlayerView.setSeekbarContentDescription(j);
        r5.AIW(1, C002001d.A1W(r6, (long) ((AnonymousClass0M3) r3).A00));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if (r1 == 10) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1h(com.whatsapp.search.views.itemviews.AudioPlayerView r6, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView r7, X.AnonymousClass0MP r8) {
        /*
            android.content.Context r5 = r7.getContext()
            X.03n r4 = r8.A0n
            boolean r3 = r4.A02
            if (r3 == 0) goto L_0x003f
            int r1 = r8.A08
            r0 = 8
            r2 = 2131100650(0x7f0603ea, float:1.7813687E38)
            if (r1 != r0) goto L_0x0016
            r2 = 2131100649(0x7f0603e9, float:1.7813685E38)
        L_0x0016:
            r7.setMicColorTint(r2)
            int r0 = X.C004302a.A00(r5, r2)
            r6.setSeekbarColor(r0)
            X.0M4 r1 = r8.A02
            if (r1 == 0) goto L_0x0050
            boolean r0 = r1.A0a
            if (r0 != 0) goto L_0x003e
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x003e
            boolean r0 = r8.A0f
            if (r0 == 0) goto L_0x003a
            if (r3 == 0) goto L_0x003a
            X.02N r0 = r4.A00
            boolean r0 = X.AnonymousClass1VY.A0T(r0)
            if (r0 == 0) goto L_0x003e
        L_0x003a:
            r0 = 0
            r6.setSeekbarColor(r0)
        L_0x003e:
            return
        L_0x003f:
            int r1 = r8.A08
            r0 = 9
            if (r1 == r0) goto L_0x004c
            r0 = 10
            r2 = 2131100648(0x7f0603e8, float:1.7813683E38)
            if (r1 != r0) goto L_0x0016
        L_0x004c:
            r2 = 2131100649(0x7f0603e9, float:1.7813685E38)
            goto L_0x0016
        L_0x0050:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A1h(com.whatsapp.search.views.itemviews.AudioPlayerView, com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView, X.0MP):void");
    }

    public static void A1i(InputStream inputStream, int i) {
        int read;
        byte[] bArr = new byte[1024];
        while (i > 0) {
            int min = Math.min(Math.min(1024, i), 1024);
            int i2 = 0;
            while (i2 < min && (read = inputStream.read(bArr, 0 + i2, min - i2)) != -1) {
                i2 += read;
            }
            if (i2 != -1) {
                i -= 1024;
            } else {
                throw new EOFException(AnonymousClass008.A0F("Unexpected EOF skipping ", i));
            }
        }
    }

    public static void A1j(OutputStream outputStream, short s) {
        outputStream.write((byte) ((65280 & s) >>> 8));
        outputStream.write((byte) (s & 255));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1k(java.lang.String r6, X.AnonymousClass1T0 r7) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A1k(java.lang.String, X.1T0):void");
    }

    public static void A1l(short s, byte[] bArr, int i) {
        bArr[i] = (byte) ((65280 & s) >>> 8);
        bArr[i + 1] = (byte) (s & 255);
    }

    public static void A1m(byte[] bArr, boolean z, C58382lp r17) {
        Set set;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        short s = wrap.getShort();
        wrap.get(new byte[32]);
        byte[] bArr2 = new byte[((short) (((short) (wrap.get() & 255)) | 0))];
        wrap.get(bArr2);
        short s2 = wrap.getShort();
        byte b = wrap.get();
        byte[] bArr3 = new byte[2];
        wrap.get(bArr3);
        byte[] bArr4 = new byte[A0F(bArr3)];
        wrap.get(bArr4);
        C50642Vm r7 = new C50642Vm(bArr4);
        C50632Vl A002 = r7.A00(43);
        if (A002 == null) {
            throw new C29001Wo((byte) 109, new SSLException("Supported version extension not found."));
        } else if (C50612Vj.A05.contains(Short.valueOf((short) A0F(A002.A01)))) {
            byte[] bArr5 = r17.A0n;
            if (bArr5 == null || A1y(A002.A01, bArr5)) {
                if (z) {
                    set = C50612Vj.A07;
                } else {
                    set = C50612Vj.A08;
                }
                HashSet hashSet = new HashSet(r7.A03.keySet());
                hashSet.removeAll(set);
                int size = hashSet.size();
                boolean z2 = false;
                if (size != 0) {
                    z2 = true;
                }
                if (!z2) {
                    Short sh = C50612Vj.A01;
                    if (s != 771) {
                        StringBuilder A0T = AnonymousClass008.A0T("Unexpected protocol version", s, " != ");
                        A0T.append(sh);
                        throw new C29001Wo((byte) 80, new SSLException(A0T.toString()));
                    } else if (A1y(r17.A0l, bArr2)) {
                        short s3 = r17.A0V;
                        if (s3 != 0 && s3 != s2) {
                            throw new C29001Wo((byte) 47, new SSLException("Cipher suite in server hello does not match HelloRetryRequest cipher suite."));
                        } else if (r17.A0E == null) {
                            throw null;
                        } else if (s2 != 4865) {
                            throw new C29001Wo((byte) 80, new SSLException("Server selected invalid cipher suite"));
                        } else if (b == 0) {
                            C50632Vl A003 = r7.A00(51);
                            if (A003 != null) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(A003.A01);
                                short s4 = wrap2.getShort();
                                if (r17.A0F == null) {
                                    throw null;
                                } else if (s4 == 29) {
                                    if (!z) {
                                        byte[] bArr6 = new byte[2];
                                        wrap2.get(bArr6);
                                        int A0F = A0F(bArr6);
                                        if (r17.A0F == null) {
                                            throw null;
                                        } else if (A0F != 32) {
                                            StringBuilder A0T2 = AnonymousClass008.A0T("Key length mismatch ", A0F, " != ");
                                            A0T2.append(32);
                                            throw new C29001Wo((byte) 80, new SSLException(A0T2.toString()));
                                        } else {
                                            byte[] bArr7 = new byte[32];
                                            r17.A0m = bArr7;
                                            wrap2.get(bArr7);
                                        }
                                    }
                                    C50632Vl A004 = r7.A00(41);
                                    if (!(r17.A0C.A03 == null || A004 == null)) {
                                        if (A0F(A004.A01) <= 0) {
                                            r17.A0b = true;
                                            r17.A0g = true;
                                        } else {
                                            StringBuilder sb = new StringBuilder("Incorrect PSK index value chosen by server ");
                                            sb.append(A004);
                                            throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
                                        }
                                    }
                                    if (z) {
                                        r17.A0n = A002.A01;
                                        r17.A0V = s2;
                                        r17.A0W = s4;
                                        C50632Vl A005 = r7.A00(44);
                                        if (A005 != null) {
                                            ByteBuffer wrap3 = ByteBuffer.wrap(A005.A01);
                                            byte[] bArr8 = new byte[2];
                                            wrap3.get(bArr8);
                                            byte[] bArr9 = new byte[A0F(bArr8)];
                                            wrap3.get(bArr9);
                                            r17.A0k = bArr9;
                                        }
                                    }
                                    if (wrap.hasRemaining()) {
                                        throw new C29001Wo((byte) 80, new SSLException("Server Hello has more bytes than expected."));
                                    }
                                } else {
                                    throw new C29001Wo((byte) 80, new SSLException("Key share algorithm mismatch."));
                                }
                            } else {
                                throw new C29001Wo((byte) 109, new SSLException("Key share extension not found."));
                            }
                        } else {
                            throw new C29001Wo((byte) 80, new SSLException("Invalid compression method.0"));
                        }
                    } else {
                        throw new C29001Wo((byte) 80, new SSLException("Bad session id"));
                    }
                } else {
                    throw new C29001Wo((byte) 47, new SSLException("Unexpected extension provided by the server"));
                }
            } else {
                throw new C29001Wo((byte) 47, new SSLException("Supported version in server hello does not match HelloRetryRequest supported version."));
            }
        } else {
            throw new C29001Wo((byte) 110, new SSLException("Server sent an unsupported version."));
        }
    }

    public static boolean A1p(C000300f r1) {
        return r1.A0D(AbstractC000400g.A1L) && r1.A0D(AbstractC000400g.A1K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        if (r3 != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1q(X.C000300f r7, X.AnonymousClass00C r8, X.AnonymousClass00D r9) {
        /*
            X.03a r0 = X.AbstractC000400g.A0H
            int r0 = r7.A06(r0)
            long r3 = (long) r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            r5 = 0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0013
            return r5
        L_0x0013:
            long r6 = r8.A04()
            r1 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0032
            float r1 = (float) r3
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r4
            r0 = 1335165689(0x4f9502f9, float:5.0E9)
            float r1 = r1 / r0
            int r0 = (int) r1
            long r2 = r8.A04()
            long r0 = (long) r0
            long r2 = r2 * r0
            float r0 = (float) r2
            float r0 = r0 / r4
            long r3 = (long) r0
        L_0x0032:
            long r1 = r8.A02()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 0
            if (r0 > 0) goto L_0x003c
            r3 = 1
        L_0x003c:
            android.content.SharedPreferences r2 = r9.A00
            java.lang.String r1 = "storage_usage_banner_dismissed"
            boolean r0 = r2.getBoolean(r1, r5)
            if (r0 == 0) goto L_0x004d
            if (r3 != 0) goto L_0x004f
            X.AnonymousClass008.A0n(r9, r1, r5)
        L_0x004c:
            return r5
        L_0x004d:
            if (r3 == 0) goto L_0x004c
        L_0x004f:
            boolean r0 = r2.getBoolean(r1, r5)
            if (r0 != 0) goto L_0x004c
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A1q(X.00f, X.00C, X.00D):boolean");
    }

    public static boolean A1r(C000300f r1, C015808q r2) {
        return r1.A0D(AbstractC000400g.A1L) || r2.A01() || r2.A02();
    }

    public static boolean A1s(AnonymousClass1VM r2) {
        int A04 = r2.A04();
        if (A04 == 4 || A04 == 1 || A04 == 6 || A04 == 8 || A04 == 7) {
            return true;
        }
        return false;
    }

    public static boolean A1t(C02560Co r6, AbstractC007503q r7) {
        if ((r7 instanceof AnonymousClass0M3) && (!r7.A0n.A02 || ((r7 instanceof AnonymousClass0ZC) && AnonymousClass0FI.A0u((AnonymousClass0ML) r7)))) {
            AnonymousClass0M3 r4 = (AnonymousClass0M3) r7;
            AnonymousClass0M4 r3 = r4.A02;
            if (r3 != null) {
                C60602pn A002 = r6.A00(r3);
                if (r7.A0m == 3 && r3.A0a && A002 != null && A002.A0h != null && !C006803i.A0g()) {
                    return true;
                }
                if ((r7 instanceof AnonymousClass0MI) && AnonymousClass0FI.A0o(r4)) {
                    return true;
                }
                if (!r3.A0P || r3.A07 == 1 || r3.A0F == null) {
                    return false;
                }
            } else {
                throw null;
            }
        }
        return true;
    }

    public static boolean A1u(AbstractC007503q r8, AnonymousClass01A r9, AnonymousClass0AQ r10, AnonymousClass0EO r11, AnonymousClass01I r12, AnonymousClass098 r13) {
        C007003k r4;
        C007303n r2 = r8.A0n;
        if (r2.A02) {
            return true;
        }
        AnonymousClass02N r42 = r2.A00;
        if (r42 == null) {
            throw null;
        } else if (r13.A01(r42) == 1) {
            return true;
        } else {
            C007003k A022 = r10.A02(r42);
            if (A022.A09()) {
                AnonymousClass02N A07 = r8.A07();
                if (A07 == null) {
                    return false;
                }
                C007003k A0A = r9.A0A(A07);
                UserJid A0D = r9.A0D((GroupJid) A022.A02(AnonymousClass02U.class));
                if (A0D != null) {
                    r4 = r9.A0A(A0D);
                } else {
                    r4 = null;
                }
                r12.A04();
                UserJid userJid = r12.A03;
                if (userJid != null) {
                    Jid A023 = A022.A02(AnonymousClass02U.class);
                    if (A023 == null) {
                        throw null;
                    } else if (r11.A0N((AnonymousClass02U) A023)) {
                        return true;
                    } else {
                        if ((r4 == null || (r4.A08 == null && !userJid.equals(r4.A09))) && A0A.A08 == null && A0A.A03 != 3) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    throw null;
                }
            } else if (A022.A08 != null || A022.A03 == 3) {
                return true;
            } else {
                if (r42 == null) {
                    return false;
                }
                int type = r42.getType();
                if (type == 8 || type == 7) {
                    return true;
                }
                return false;
            }
        }
    }

    public static boolean A1v(AnonymousClass0MP r5, Context context, AnonymousClass30p r7, C04370Kc r8, AnonymousClass02M r9, C02580Cq r10) {
        File file;
        AnonymousClass0M4 r0;
        AnonymousClass0M4 r4 = ((AnonymousClass0M3) r5).A02;
        if (r4 == null) {
            throw null;
        } else if (r4 != null) {
            boolean z = true;
            if (!r4.A0a) {
                if (r4.A07 == 1) {
                    r9.A04(R.string.gallery_unsafe_audio_removed, 1);
                } else {
                    if (r4.A0P && (file = r4.A0F) != null) {
                        File file2 = new File(Uri.fromFile(file).getPath());
                        if (!file2.exists() || !file2.canRead()) {
                            File file3 = new File(Uri.fromFile(r4.A0F).getPath());
                            if (!file3.exists() || !file3.canRead()) {
                                if (r5.A0n.A02 || (r0 = ((AnonymousClass0M3) r5).A02) == null) {
                                    z = false;
                                } else {
                                    r0.A0X = true;
                                    r10.A08(r5);
                                }
                                if (z) {
                                    r7.AG0();
                                    return false;
                                }
                                Context A0O = C002001d.A0O(context);
                                if (A0O instanceof ActivityC004702f) {
                                    r8.A03((ActivityC004702f) A0O);
                                }
                                return false;
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        } else {
            throw null;
        }
    }

    public static boolean A1w(C02850Ds r9, long j, AnonymousClass00S r12) {
        long A05 = r12.A05();
        long j2 = (((long) r9.A00) * 1000) + r9.A0E;
        boolean z = r9.A0n.A02;
        if (!z && j > A05) {
            return true;
        }
        if (z) {
            return (j == -1 && j2 > A05) || j > A05;
        }
        return false;
    }

    public static boolean A1x(String str) {
        return "payments:settings".equals(str) || "payments:transaction".equals(str) || "payments:account-details".equals(str);
    }

    public static boolean A1y(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int i = 0; i < length; i++) {
            boolean z2 = false;
            if (bArr[i] == bArr2[i]) {
                z2 = true;
            }
            z &= z2;
        }
        return z;
    }

    public static boolean A1z(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - 0;
        int length2 = bArr2.length;
        if (length < length2) {
            return false;
        }
        for (int i = 0; i < length2; i++) {
            if (bArr[0 + i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 > 127999) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A20(int[] r4) {
        /*
            int r1 = r4.length
            r3 = 1
            r0 = 2
            if (r1 < r0) goto L_0x0016
            r2 = r4[r3]
            r0 = 127995(0x1f3fb, float:1.79359E-40)
            if (r0 > r2) goto L_0x0012
            r1 = 127999(0x1f3ff, float:1.79365E-40)
            r0 = 1
            if (r2 <= r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0016
            return r3
        L_0x0016:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A20(int[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (r2 > 127999) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A21(int[] r7) {
        /*
        // Method dump skipped, instructions count: 556
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A21(int[]):boolean");
    }

    public static byte[] A22(byte b, byte[] bArr) {
        int length;
        if (!C50652Vn.A00.contains(Byte.valueOf(b)) || bArr == null || (length = bArr.length) > 16777215) {
            throw new C29001Wo((byte) 80, new SSLException(AnonymousClass008.A0H("Illegal arguments -  type ", b, " msg is null or bigger than", 16777215)));
        }
        ByteBuffer allocate = ByteBuffer.allocate(length + 4);
        allocate.put(b);
        allocate.put(A23(length));
        allocate.put(bArr);
        return allocate.array();
    }

    public static byte[] A23(int i) {
        if (i < 0 || i >= 16777216) {
            throw new C29001Wo((byte) 80, new SSLException(AnonymousClass008.A0G("Invalid argument. The supplied int value = ", i, " does not fit in 3 bytes.")));
        }
        return new byte[]{(byte) ((i >>> 16) & 255), (byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A24(int i) {
        if (i < 0 || i >= 65536) {
            throw new C29001Wo((byte) 80, new SSLException(AnonymousClass008.A0G("Invalid argument. The supplied int value = ", i, " does not fit in 2 bytes.")));
        }
        return new byte[]{(byte) ((i >>> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] A25(C58382lp r14) {
        ByteBuffer allocate;
        long currentTimeMillis;
        short s;
        byte[] bArr;
        if (r14 != null) {
            byte[] bArr2 = r14.A0j;
            if (bArr2 == null || bArr2.length != 32) {
                throw new C29001Wo((byte) 80, new SSLException("Client random is not correctly initialized."));
            } else if (r14.A0l != null) {
                C50642Vm r7 = new C50642Vm();
                try {
                    String str = r14.A0O;
                    if (str != null && !str.isEmpty()) {
                        byte[] bytes = str.getBytes("UTF-8");
                        int length = bytes.length;
                        ByteBuffer allocate2 = ByteBuffer.allocate(length + 3);
                        allocate2.put(A24(length + 1));
                        allocate2.put((byte) length);
                        allocate2.put(bytes);
                        r7.A01(new C50632Vl(16, allocate2.array()));
                    }
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.putShort(2);
                    if (r14.A0H != null) {
                        allocate3.putShort(1027);
                        r7.A01(new C50632Vl(13, allocate3.array()));
                        ByteBuffer allocate4 = ByteBuffer.allocate(4);
                        allocate4.putShort(2);
                        if (r14.A0F != null) {
                            allocate4.putShort(29);
                            r7.A01(new C50632Vl(10, allocate4.array()));
                            ByteBuffer allocate5 = ByteBuffer.allocate(2);
                            allocate5.put((byte) 1);
                            allocate5.put(r14.A00);
                            r7.A01(new C50632Vl(45, allocate5.array()));
                            ByteBuffer allocate6 = ByteBuffer.allocate(5);
                            allocate6.put((byte) 4);
                            allocate6.putShort(772);
                            allocate6.putShort(-1254);
                            r7.A01(new C50632Vl(43, allocate6.array()));
                            ByteBuffer allocate7 = ByteBuffer.allocate(4);
                            allocate7.putShort(2);
                            if (r14.A0H != null) {
                                allocate7.putShort(1027);
                                r7.A01(new C50632Vl(50, allocate7.array()));
                                if (r14.A0a && r14.A0C.A03 != null && !r14.A0c) {
                                    r7.A01(new C50632Vl(42, new byte[0]));
                                }
                                try {
                                    byte[] bytes2 = r14.A0Q.getBytes("UTF-8");
                                    int length2 = bytes2.length;
                                    ByteBuffer allocate8 = ByteBuffer.allocate(length2 + 5);
                                    allocate8.put(A24(length2 + 3));
                                    allocate8.put(A23(length2));
                                    allocate8.put(bytes2);
                                    r7.A01(new C50632Vl(0, allocate8.array()));
                                    if (r14.A0c && (bArr = r14.A0k) != null) {
                                        ByteBuffer allocate9 = ByteBuffer.allocate(bArr.length + 2);
                                        allocate9.put(A24(bArr.length));
                                        allocate9.put(bArr);
                                        r7.A01(new C50632Vl(44, allocate9.array()));
                                    }
                                    AnonymousClass3WF r1 = r14.A0F;
                                    if (r1 == null) {
                                        throw null;
                                    } else if (r14.A0c && (s = r14.A0W) != 29) {
                                        StringBuilder A0S = AnonymousClass008.A0S("Must use key group sent by HelloRetryRequest: ");
                                        A0S.append((int) s);
                                        A0S.append(" client key group:");
                                        A0S.append(" ");
                                        A0S.append(29);
                                        throw new C29001Wo((byte) 80, new SSLException(A0S.toString()));
                                    } else if (r1 != null) {
                                        ByteBuffer allocate10 = ByteBuffer.allocate(38);
                                        if (r14.A0F != null) {
                                            allocate10.put(A24(36));
                                            allocate10.putShort(29);
                                            if (r14.A0F != null) {
                                                allocate10.put(A24(32));
                                                allocate10.put(r14.A0i);
                                                r7.A01(new C50632Vl(51, allocate10.array()));
                                                ByteBuffer allocate11 = ByteBuffer.allocate(r7.A01);
                                                Iterator it = r7.A02.iterator();
                                                while (it.hasNext()) {
                                                    C50632Vl r2 = (C50632Vl) it.next();
                                                    ByteBuffer allocate12 = ByteBuffer.allocate(r2.A01.length + 4);
                                                    allocate12.putShort(r2.A00);
                                                    allocate12.put(A24(r2.A01.length));
                                                    allocate12.put(r2.A01);
                                                    allocate11.put(allocate12.array());
                                                }
                                                byte[] array = allocate11.array();
                                                WtCachedPsk wtCachedPsk = r14.A0C.A03;
                                                if (wtCachedPsk == null) {
                                                    allocate = ByteBuffer.allocate(0);
                                                } else {
                                                    allocate = ByteBuffer.allocate(wtCachedPsk.ticket.length + 6 + 6 + r14.A02 + 1 + 2);
                                                    byte[] bArr3 = r14.A0C.A03.ticket;
                                                    allocate.putShort(41);
                                                    allocate.put(A24(allocate.capacity() - 4));
                                                    int length3 = bArr3.length;
                                                    allocate.put(A24(length3 + 6));
                                                    allocate.put(A24(length3));
                                                    allocate.put(bArr3);
                                                    WtCachedPsk wtCachedPsk2 = r14.A0C.A03;
                                                    if (wtCachedPsk2.useTestTime) {
                                                        currentTimeMillis = 3600000;
                                                    } else {
                                                        currentTimeMillis = System.currentTimeMillis();
                                                    }
                                                    long j = currentTimeMillis - wtCachedPsk2.ticketIssuedTime;
                                                    if (j < 0) {
                                                        j = 0;
                                                    }
                                                    long j2 = (j + wtCachedPsk2.ticketAgeAdd) % 4294967296L;
                                                    if (j2 < 0) {
                                                        j2 += 4294967296L;
                                                    }
                                                    if (j2 < 0 || j2 >= 4294967296L) {
                                                        StringBuilder sb = new StringBuilder("Invalid argument. The supplied long value = ");
                                                        sb.append(j2);
                                                        sb.append(" does not  fit in 4 bytes.");
                                                        throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
                                                    }
                                                    allocate.put(new byte[]{(byte) ((int) ((j2 >> 24) & 255)), (byte) ((int) ((j2 >> 16) & 255)), (byte) ((int) ((j2 >> 8) & 255)), (byte) ((int) (j2 & 255))});
                                                }
                                                int length4 = array.length + allocate.capacity();
                                                ByteBuffer allocate13 = ByteBuffer.allocate(r14.A0l.length + 35 + 2 + 2 + 1 + 1 + 2 + length4);
                                                allocate13.putShort(771);
                                                allocate13.put(r14.A0j);
                                                allocate13.put((byte) r14.A0l.length);
                                                allocate13.put(r14.A0l);
                                                allocate13.putShort(2);
                                                if (r14.A0E != null) {
                                                    allocate13.putShort(4865);
                                                    allocate13.put((byte) 1);
                                                    allocate13.put((byte) 0);
                                                    allocate13.put(A24(length4));
                                                    allocate13.put(array);
                                                    if (r14.A0C.A03 != null) {
                                                        C50722Vu r0 = r14.A0D;
                                                        if (r0 != null) {
                                                            try {
                                                                MessageDigest messageDigest = (MessageDigest) r0.A00.clone();
                                                                byte[] copyOfRange = Arrays.copyOfRange(allocate13.array(), 0, allocate13.position());
                                                                byte[] copyOfRange2 = Arrays.copyOfRange(allocate.array(), 0, allocate.position());
                                                                messageDigest.update((byte) 1);
                                                                messageDigest.update(A23(allocate13.capacity()));
                                                                messageDigest.update(copyOfRange);
                                                                messageDigest.update(copyOfRange2);
                                                                byte[] digest = messageDigest.digest();
                                                                int i = r14.A02 + 1;
                                                                ByteBuffer allocate14 = ByteBuffer.allocate(i + 2);
                                                                allocate14.put(A24(i));
                                                                try {
                                                                    byte[] A2A = A2A(r14.A09.A01(r14.A09.A01(r14.A09.A00(new byte[r14.A02], r14.A0C.A03.pskVal), A28("res binder", MessageDigest.getInstance(r14.A0P).digest(), r14.A02), r14.A02), A28("finished", new byte[0], r14.A02), r14.A02), digest, r14.A0P);
                                                                    allocate14.put((byte) A2A.length);
                                                                    allocate14.put(A2A);
                                                                    allocate.put(allocate14.array());
                                                                    allocate13.put(allocate.array());
                                                                } catch (NoSuchAlgorithmException e) {
                                                                    throw new C29001Wo((byte) 80, new SSLException(e));
                                                                }
                                                            } catch (CloneNotSupportedException e2) {
                                                                throw new C29001Wo((byte) 80, new SSLException(e2));
                                                            }
                                                        } else {
                                                            throw null;
                                                        }
                                                    }
                                                    return allocate13.array();
                                                }
                                                throw null;
                                            }
                                            throw null;
                                        }
                                        throw null;
                                    } else {
                                        throw null;
                                    }
                                } catch (UnsupportedEncodingException e3) {
                                    throw new C29001Wo((byte) 80, new SSLException(e3));
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                } catch (UnsupportedEncodingException e4) {
                    throw new C29001Wo((byte) 80, new SSLException(e4));
                }
            } else {
                throw new C29001Wo((byte) 80, new SSLException("Legacy session id is not correctly initialized."));
            }
        } else {
            throw new C29001Wo((byte) 80, new SSLException("Illegal argument. Context cannot be null."));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0109, code lost:
        if (r7 != null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0131, code lost:
        if (r7 != null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0136, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0162, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0163, code lost:
        com.whatsapp.util.Log.w(X.C018809u.A01("PaymentMethodUtils", "fetchIcon/Close InputStream: "), r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0155 A[SYNTHETIC, Splitter:B:47:0x0155] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A26(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28051Sr.A26(java.lang.String):byte[]");
    }

    public static byte[] A27(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("#");
        sb.append(i);
        sb.append("#");
        sb.append(str2);
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new C29001Wo((byte) 80, new SSLException(e));
        }
    }

    public static byte[] A28(String str, byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            try {
                byte[] bytes = AnonymousClass008.A0K("tls13 ", str).getBytes("UTF-8");
                int length2 = bytes.length;
                ByteBuffer allocate = ByteBuffer.allocate(length + 1 + length2 + 1 + 2);
                allocate.put(A24(i));
                short s = (short) length2;
                if (s < 0 || s >= 256) {
                    throw new C29001Wo((byte) 80, new SSLException(AnonymousClass008.A0G("Invalid argument. Short val = ", s, " cannot fit in single byte")));
                }
                allocate.put((byte) (s & 255));
                allocate.put(bytes);
                allocate.put((byte) length);
                allocate.put(bArr);
                return allocate.array();
            } catch (UnsupportedEncodingException e) {
                throw new C29001Wo((byte) 80, new SSLException(e));
            }
        } else {
            throw new C29001Wo((byte) 80, new SSLException("Context cannot be null when generating info"));
        }
    }

    public static byte[] A29(byte[] bArr) {
        if (bArr != null) {
            try {
                ByteBuffer wrap = ByteBuffer.wrap(bArr);
                byte b = wrap.get();
                byte[] bArr2 = new byte[3];
                wrap.get(bArr2);
                int A0E = A0E(bArr2);
                byte[] bArr3 = new byte[A0E];
                wrap.get(bArr3);
                if (C50652Vn.A00.contains(Byte.valueOf(b)) && A0E <= 16777215) {
                    return bArr3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Received an invalid handshake - type ");
                sb.append((int) b);
                sb.append(" len ");
                sb.append(A0E);
                throw new C29001Wo((byte) 80, new SSLException(sb.toString()));
            } catch (BufferUnderflowException e) {
                throw new C29001Wo((byte) 80, new SSLException("Invalid handshake message", e));
            }
        } else {
            throw new C29001Wo((byte) 80, new SSLException("Illegal argument - handshake is null"));
        }
    }

    public static byte[] A2A(byte[] bArr, byte[] bArr2, String str) {
        try {
            String replace = str.replace("-", "");
            StringBuilder sb = new StringBuilder();
            sb.append("Hmac");
            sb.append(replace);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Hmac");
            sb2.append(replace);
            Mac instance = Mac.getInstance(sb2.toString());
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException e) {
            throw new C29001Wo((byte) 80, new SSLException(AnonymousClass008.A0L("Hmac", str, " not found"), e));
        } catch (InvalidKeyException e2) {
            throw new C29001Wo((byte) 80, new SSLException("Invalid key", e2));
        }
    }

    public static int[] A2B(String str) {
        Date A1B = A1B(str);
        int[] iArr = {-1, -1, -1};
        if (A1B == null) {
            return iArr;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(A1B);
        return new int[]{instance.get(5), instance.get(2), instance.get(1)};
    }

    public static int[] A2C(int[] iArr) {
        int length = iArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i : iArr) {
            if (i != 65039) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Number) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static int[] A2D(int[] iArr, int i) {
        int length = iArr.length;
        if (length < 2 || iArr[1] != 65039) {
            int[] iArr2 = new int[(length + 1)];
            iArr2[0] = iArr[0];
            iArr2[1] = i;
            System.arraycopy(iArr, 1, iArr2, 2, length - 1);
            return iArr2;
        }
        int[] iArr3 = new int[length];
        iArr3[0] = iArr[0];
        iArr3[1] = i;
        System.arraycopy(iArr, 2, iArr3, 2, length - 2);
        return iArr3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: int[][] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: int[] */
    /* JADX WARN: Multi-variable type inference failed */
    public static int[][] A2E(int[] iArr) {
        int[][] iArr2 = new int[6][];
        if (A20(iArr)) {
            int length = iArr.length;
            int[] iArr3 = new int[(length - 1)];
            iArr3[0] = iArr[0];
            System.arraycopy(iArr, 2, iArr3, 1, length - 2);
            iArr2[0] = iArr3;
        } else {
            iArr2[0] = iArr.clone();
        }
        int i = 1;
        do {
            iArr2[i] = A2D(iArr2[0], (127995 + i) - 1);
            i++;
        } while (i < 6);
        return iArr2;
    }
}
