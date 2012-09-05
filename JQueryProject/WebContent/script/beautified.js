var RecaptchaTemplates = {};
RecaptchaTemplates.VertHtml = '<table id="recaptcha_table" class="recaptchatable" > <tr> <td colspan="6" class=\'recaptcha_r1_c1\'></td> </tr> <tr> <td class=\'recaptcha_r2_c1\'></td> <td colspan="4" class=\'recaptcha_image_cell\'><div id="recaptcha_image"></div></td> <td class=\'recaptcha_r2_c2\'></td> </tr> <tr> <td rowspan="6" class=\'recaptcha_r3_c1\'></td> <td colspan="4" class=\'recaptcha_r3_c2\'></td> <td rowspan="6" class=\'recaptcha_r3_c3\'></td> </tr> <tr> <td rowspan="3" class=\'recaptcha_r4_c1\' height="49"> <div class="recaptcha_input_area"> <label for="recaptcha_response_field" class="recaptcha_input_area_text"><span id="recaptcha_instructions_image" class="recaptcha_only_if_image recaptcha_only_if_no_incorrect_sol"></span><span id="recaptcha_instructions_audio" class="recaptcha_only_if_no_incorrect_sol recaptcha_only_if_audio"></span><span id="recaptcha_instructions_error" class="recaptcha_only_if_incorrect_sol"></span></label><br/> <input name="recaptcha_response_field" id="recaptcha_response_field" type="text" autocorrect="off" autocapitalize="off" /> </div> </td> <td rowspan="4" class=\'recaptcha_r4_c2\'></td> <td><a id=\'recaptcha_reload_btn\'><img id=\'recaptcha_reload\' width="25" height="17" /></a></td> <td rowspan="4" class=\'recaptcha_r4_c4\'></td> </tr> <tr> <td><a id=\'recaptcha_switch_audio_btn\' class="recaptcha_only_if_image"><img id=\'recaptcha_switch_audio\' width="25" height="16" alt="" /></a><a id=\'recaptcha_switch_img_btn\' class="recaptcha_only_if_audio"><img id=\'recaptcha_switch_img\' width="25" height="16" alt=""/></a></td> </tr> <tr> <td><a id=\'recaptcha_whatsthis_btn\'><img id=\'recaptcha_whatsthis\' width="25" height="16" /></a></td> </tr> <tr> <td class=\'recaptcha_r7_c1\'></td> <td class=\'recaptcha_r8_c1\'></td> </tr> </table> ';
RecaptchaTemplates.CleanCss = ".recaptchatable td img{display:block}.recaptchatable .recaptcha_image_cell center img{height:57px}.recaptchatable .recaptcha_image_cell center{height:57px}.recaptchatable .recaptcha_image_cell{background-color:white;height:57px;padding:7px!important}.recaptchatable,#recaptcha_area tr,#recaptcha_area td,#recaptcha_area th{margin:0!important;border:0!important;border-collapse:collapse!important;vertical-align:middle!important}.recaptchatable *{margin:0;padding:0;border:0;color:black;position:static;top:auto;left:auto;right:auto;bottom:auto;text-align:left!important}.recaptchatable #recaptcha_image{margin:auto;border:1px solid #dfdfdf!important}.recaptchatable a img{border:0}.recaptchatable a,.recaptchatable a:hover{outline:none;border:0!important;padding:0!important;text-decoration:none;color:blue;background:none!important;font-weight:normal}.recaptcha_input_area{position:relative!important;background:none!important}.recaptchatable label.recaptcha_input_area_text{border:1px solid #dfdfdf!important;margin:0!important;padding:0!important;position:static!important;top:auto!important;left:auto!important;right:auto!important;bottom:auto!important}.recaptcha_theme_red label.recaptcha_input_area_text,.recaptcha_theme_white label.recaptcha_input_area_text{color:black!important}.recaptcha_theme_blackglass label.recaptcha_input_area_text{color:white!important}.recaptchatable #recaptcha_response_field{font-size:11pt}.recaptcha_theme_blackglass #recaptcha_response_field,.recaptcha_theme_white #recaptcha_response_field{border:1px solid gray}.recaptcha_theme_red #recaptcha_response_field{border:1px solid #cca940}.recaptcha_audio_cant_hear_link{font-size:7pt;color:black}.recaptchatable{line-height:1em;border:1px solid #dfdfdf!important}.recaptcha_error_text{color:red}";
RecaptchaTemplates.CleanHtml = '<table id="recaptcha_table" class="recaptchatable"> <tr height="73"> <td class=\'recaptcha_image_cell\' width="302"><center><div id="recaptcha_image"></div></center></td> <td style="padding: 10px 7px 7px 7px;"> <a id=\'recaptcha_reload_btn\'><img id=\'recaptcha_reload\' width="25" height="18" alt="" /></a> <a id=\'recaptcha_switch_audio_btn\' class="recaptcha_only_if_image"><img id=\'recaptcha_switch_audio\' width="25" height="15" alt="" /></a><a id=\'recaptcha_switch_img_btn\' class="recaptcha_only_if_audio"><img id=\'recaptcha_switch_img\' width="25" height="15" alt=""/></a> <a id=\'recaptcha_whatsthis_btn\'><img id=\'recaptcha_whatsthis\' width="25" height="16" /></a> </td> <td style="padding: 18px 7px 18px 7px;"> <img id=\'recaptcha_logo\' alt="" width="71" height="36" /> </td> </tr> <tr> <td style="padding-left: 7px;"> <div class="recaptcha_input_area" style="padding-top: 2px; padding-bottom: 7px;"> <input style="border: 1px solid #3c3c3c; width: 302px;" name="recaptcha_response_field" id="recaptcha_response_field" type="text" /> </div> </td> <td></td> <td style="padding: 4px 7px 12px 7px;"> <img id="recaptcha_tagline" width="71" height="17" /> </td> </tr> </table> ';
RecaptchaTemplates.ContextHtml = '<table id="recaptcha_table" class="recaptchatable"> <tr> <td colspan="6" class=\'recaptcha_r1_c1\'></td> </tr> <tr> <td class=\'recaptcha_r2_c1\'></td> <td colspan="4" class=\'recaptcha_image_cell\'><div id="recaptcha_image"></div></td> <td class=\'recaptcha_r2_c2\'></td> </tr> <tr> <td rowspan="6" class=\'recaptcha_r3_c1\'></td> <td colspan="4" class=\'recaptcha_r3_c2\'></td> <td rowspan="6" class=\'recaptcha_r3_c3\'></td> </tr> <tr> <td rowspan="3" class=\'recaptcha_r4_c1\' height="49"> <div class="recaptcha_input_area"> <label for="recaptcha_response_field" class="recaptcha_input_area_text"><span id="recaptcha_instructions_context" class="recaptcha_only_if_image recaptcha_only_if_no_incorrect_sol"></span><span id="recaptcha_instructions_audio" class="recaptcha_only_if_no_incorrect_sol recaptcha_only_if_audio"></span><span id="recaptcha_instructions_error" class="recaptcha_only_if_incorrect_sol"></span></label><br/> <input name="recaptcha_response_field" id="recaptcha_response_field" type="text" /> </div> </td> <td rowspan="4" class=\'recaptcha_r4_c2\'></td> <td><a id=\'recaptcha_reload_btn\'><img id=\'recaptcha_reload\' width="25" height="17" /></a></td> <td rowspan="4" class=\'recaptcha_r4_c4\'></td> </tr> <tr> <td><a id=\'recaptcha_switch_audio_btn\' class="recaptcha_only_if_image"><img id=\'recaptcha_switch_audio\' width="25" height="16" alt="" /></a><a id=\'recaptcha_switch_img_btn\' class="recaptcha_only_if_audio"><img id=\'recaptcha_switch_img\' width="25" height="16" alt=""/></a></td> </tr> <tr> <td><a id=\'recaptcha_whatsthis_btn\'><img id=\'recaptcha_whatsthis\' width="25" height="16" /></a></td> </tr> <tr> <td class=\'recaptcha_r7_c1\'></td> <td class=\'recaptcha_r8_c1\'></td> </tr> </table> ';
RecaptchaTemplates.VertCss = ".recaptchatable td img{display:block}.recaptchatable .recaptcha_r1_c1{background:url('IMGROOT/sprite.png') 0 -63px no-repeat;width:318px;height:9px}.recaptchatable .recaptcha_r2_c1{background:url('IMGROOT/sprite.png') -18px 0 no-repeat;width:9px;height:57px}.recaptchatable .recaptcha_r2_c2{background:url('IMGROOT/sprite.png') -27px 0 no-repeat;width:9px;height:57px}.recaptchatable .recaptcha_r3_c1{background:url('IMGROOT/sprite.png') 0 0 no-repeat;width:9px;height:63px}.recaptchatable .recaptcha_r3_c2{background:url('IMGROOT/sprite.png') -18px -57px no-repeat;width:300px;height:6px}.recaptchatable .recaptcha_r3_c3{background:url('IMGROOT/sprite.png') -9px 0 no-repeat;width:9px;height:63px}.recaptchatable .recaptcha_r4_c1{background:url('IMGROOT/sprite.png') -43px 0 no-repeat;width:171px;height:49px}.recaptchatable .recaptcha_r4_c2{background:url('IMGROOT/sprite.png') -36px 0 no-repeat;width:7px;height:57px}.recaptchatable .recaptcha_r4_c4{background:url('IMGROOT/sprite.png') -214px 0 no-repeat;width:97px;height:57px}.recaptchatable .recaptcha_r7_c1{background:url('IMGROOT/sprite.png') -43px -49px no-repeat;width:171px;height:8px}.recaptchatable .recaptcha_r8_c1{background:url('IMGROOT/sprite.png') -43px -49px no-repeat;width:25px;height:8px}.recaptchatable .recaptcha_image_cell center img{height:57px}.recaptchatable .recaptcha_image_cell center{height:57px}.recaptchatable .recaptcha_image_cell{background-color:white;height:57px}#recaptcha_area,#recaptcha_table{width:318px!important}.recaptchatable,#recaptcha_area tr,#recaptcha_area td,#recaptcha_area th{margin:0!important;border:0!important;padding:0!important;border-collapse:collapse!important;vertical-align:middle!important}.recaptchatable *{margin:0;padding:0;border:0;font-family:helvetica,sans-serif;font-size:8pt;color:black;position:static;top:auto;left:auto;right:auto;bottom:auto;text-align:left!important}.recaptchatable #recaptcha_image{margin:auto}.recaptchatable img{border:0!important;margin:0!important;padding:0!important}.recaptchatable a,.recaptchatable a:hover{outline:none;border:0!important;padding:0!important;text-decoration:none;color:blue;background:none!important;font-weight:normal}.recaptcha_input_area{position:relative!important;width:146px!important;height:45px!important;margin-left:20px!important;margin-right:5px!important;margin-top:4px!important;background:none!important}.recaptchatable label.recaptcha_input_area_text{margin:0!important;padding:0!important;position:static!important;top:auto!important;left:auto!important;right:auto!important;bottom:auto!important;background:none!important;height:auto!important;width:auto!important}.recaptcha_theme_red label.recaptcha_input_area_text,.recaptcha_theme_white label.recaptcha_input_area_text{color:black!important}.recaptcha_theme_blackglass label.recaptcha_input_area_text{color:white!important}.recaptchatable #recaptcha_response_field{width:145px!important;position:absolute!important;bottom:7px!important;padding:0!important;margin:0!important;font-size:10pt}.recaptcha_theme_blackglass #recaptcha_response_field,.recaptcha_theme_white #recaptcha_response_field{border:1px solid gray}.recaptcha_theme_red #recaptcha_response_field{border:1px solid #cca940}.recaptcha_audio_cant_hear_link{font-size:7pt;color:black}.recaptchatable{line-height:1em}#recaptcha_instructions_error{color:red!important}";
var RecaptchaStr_en = {
    visual_challenge: "Get a visual challenge",
    audio_challenge: "Get an audio challenge",
    refresh_btn: "Get a new challenge",
    instructions_visual: "Type the two words:",
    instructions_context: "Type the words in the boxes:",
    instructions_audio: "Type what you hear:",
    help_btn: "Help",
    play_again: "Play sound again",
    cant_hear_this: "Download sound as MP3",
    incorrect_try_again: "Incorrect. Try again.",
    image_alt_text: "reCAPTCHA challenge image"
},
    RecaptchaStr_af = {
        visual_challenge: "Kry 'n visuele verifi\u00ebring",
        audio_challenge: "Kry 'n klankverifi\u00ebring",
        refresh_btn: "Kry 'n nuwe verifi\u00ebring",
        instructions_visual: "Tik die twee woorde:",
        instructions_context: "Tik die woorde in die kassies:",
        instructions_audio: "Tik wat jy hoor:",
        help_btn: "Hulp",
        play_again: "Speel geluid weer",
        cant_hear_this: "Laai die klank af as MP3",
        incorrect_try_again: "Verkeerd. Probeer weer.",
        image_alt_text: "reCAPTCHA-verifieerprent"
    },
    RecaptchaStr_am = {
        visual_challenge: "\u12e8\u12a5\u12ed\u1273 \u1270\u130b\u1323\u121a \u12a0\u130d\u129d",
        audio_challenge: "\u120c\u120b \u12a0\u12f2\u1235 \u12e8\u12f5\u121d\u133d \u1325\u12eb\u1244 \u12ed\u1245\u1228\u1265",
        refresh_btn: "\u120c\u120b \u12a0\u12f2\u1235 \u1325\u12eb\u1244 \u12ed\u1245\u1228\u1265",
        instructions_visual: "\u12a5\u1295\u12da\u1205\u1295 \u1201\u1208\u1275 \u1243\u120b\u1275 \u1270\u12ed\u1265 \u1366",
        instructions_context: "\u1260\u1233\u1325\u1296\u1279 \u12cd\u1235\u1325 \u1243\u120b\u1276\u1279\u1295 \u1270\u12ed\u1265\u1366",
        instructions_audio: "\u12e8\u121d\u1275\u1230\u121b\u12cd\u1295 \u1270\u12ed\u1265\u1361-",
        help_btn: "\u12a5\u1308\u12db",
        play_again: "\u12f5\u121d\u1339\u1295 \u12a5\u1295\u12f0\u1308\u1293 \u12a0\u132b\u12cd\u1275",
        cant_hear_this: "\u12f5\u121d\u1339\u1295 \u1260MP3 \u1245\u122d\u133d \u12a0\u12cd\u122d\u12f5",
        incorrect_try_again: "\u1275\u12ad\u12ad\u120d \u12a0\u12ed\u12f0\u1208\u121d\u1362 \u12a5\u1295\u12f0\u1308\u1293 \u121e\u12ad\u122d\u1362",
        image_alt_text: "reCAPTCHA \u121d\u1235\u120d \u130d\u1320\u121d"
    },
    RecaptchaStr_ar = {
        visual_challenge: "\u0627\u0644\u062d\u0635\u0648\u0644 \u0639\u0644\u0649 \u062a\u062d\u062f\u064d \u0645\u0631\u0626\u064a",
        audio_challenge: "\u0627\u0644\u062d\u0635\u0648\u0644 \u0639\u0644\u0649 \u062a\u062d\u062f\u064d \u0635\u0648\u062a\u064a",
        refresh_btn: "\u0627\u0644\u062d\u0635\u0648\u0644 \u0639\u0644\u0649 \u062a\u062d\u062f\u064d \u062c\u062f\u064a\u062f",
        instructions_visual: "\u0627\u0643\u062a\u0628 \u0627\u0644\u0643\u0644\u0645\u062a\u064a\u0646:",
        instructions_context: "\u0627\u0643\u062a\u0628 \u0627\u0644\u0643\u0644\u0645\u0627\u062a \u0641\u064a \u0627\u0644\u0645\u0631\u0628\u0639\u0627\u062a:",
        instructions_audio: "\u0627\u0643\u062a\u0628 \u0645\u0627 \u062a\u0633\u0645\u0639\u0647:",
        help_btn: "\u0645\u0633\u0627\u0639\u062f\u0629",
        play_again: "\u062a\u0634\u063a\u064a\u0644 \u0627\u0644\u0635\u0648\u062a \u0645\u0631\u0629 \u0623\u062e\u0631\u0649",
        cant_hear_this: "\u062a\u0646\u0632\u064a\u0644 \u0627\u0644\u0635\u0648\u062a \u0628\u062a\u0646\u0633\u064a\u0642 MP3",
        incorrect_try_again: "\u063a\u064a\u0631 \u0635\u062d\u064a\u062d. \u0623\u0639\u062f \u0627\u0644\u0645\u062d\u0627\u0648\u0644\u0629.",
        image_alt_text: "\u0635\u0648\u0631\u0629 \u0627\u0644\u062a\u062d\u062f\u064a \u0645\u0646 reCAPTCHA"
    },
    RecaptchaStr_bg = {
        visual_challenge: "\u041f\u043e\u043b\u0443\u0447\u0430\u0432\u0430\u043d\u0435 \u043d\u0430 \u0432\u0438\u0437\u0443\u0430\u043b\u043d\u0430 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0430",
        audio_challenge: "\u0417\u0430\u0440\u0435\u0436\u0434\u0430\u043d\u0435 \u043d\u0430 \u0430\u0443\u0434\u0438\u043e\u0442\u0435\u0441\u0442",
        refresh_btn: "\u0417\u0430\u0440\u0435\u0436\u0434\u0430\u043d\u0435 \u043d\u0430 \u043d\u043e\u0432 \u0442\u0435\u0441\u0442",
        instructions_visual: "\u0412\u044a\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0432\u0435\u0442\u0435 \u0434\u0443\u043c\u0438:",
        instructions_context: "\u0412\u044a\u0432\u0435\u0434\u0435\u0442\u0435 \u0434\u0443\u043c\u0438\u0442\u0435:",
        instructions_audio: "\u0412\u044a\u0432\u0435\u0434\u0435\u0442\u0435 \u0447\u0443\u0442\u043e\u0442\u043e:",
        help_btn: "\u041f\u043e\u043c\u043e\u0449",
        play_again: "\u041f\u043e\u0432\u0442\u043e\u0440\u043d\u043e \u043f\u0443\u0441\u043a\u0430\u043d\u0435 \u043d\u0430 \u0437\u0432\u0443\u043a\u0430",
        cant_hear_this: "\u0418\u0437\u0442\u0435\u0433\u043b\u044f\u043d\u0435 \u043d\u0430 \u0437\u0432\u0443\u043a\u0430 \u0432\u044a\u0432 \u0444\u043e\u0440\u043c\u0430\u0442 MP3",
        incorrect_try_again: "\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u043d\u043e. \u041e\u043f\u0438\u0442\u0430\u0439\u0442\u0435 \u043e\u0442\u043d\u043e\u0432\u043e.",
        image_alt_text: "\u0418\u0437\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u0438\u0435 \u043d\u0430 \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0430\u0442\u0430 \u0441 reCAPTCHA"
    },
    RecaptchaStr_bn = {
        visual_challenge: "\u098f\u0995\u099f\u09bf \u09a6\u09c3\u09b6\u09cd\u09af\u09ae\u09be\u09a8 \u09aa\u09cd\u09b0\u09a4\u09bf\u09a6\u09cd\u09ac\u09a8\u09cd\u09a6\u09cd\u09ac\u09bf\u09a4\u09be \u09aa\u09be\u09a8",
        audio_challenge: "\u098f\u0995\u099f\u09bf \u0985\u09a1\u09bf\u0993 \u09aa\u09cd\u09b0\u09a4\u09bf\u09a6\u09cd\u09ac\u09a8\u09cd\u09a6\u09cd\u09ac\u09bf\u09a4\u09be  \u09aa\u09be\u09a8",
        refresh_btn: "\u098f\u0995\u099f\u09bf \u09a8\u09a4\u09c1\u09a8 \u09aa\u09cd\u09b0\u09a4\u09bf\u09a6\u09cd\u09ac\u09a8\u09cd\u09a6\u09cd\u09ac\u09bf\u09a4\u09be  \u09aa\u09be\u09a8",
        instructions_visual: "\u09b6\u09ac\u09cd\u09a6 \u09a6\u09c1\u099f\u09bf \u09b2\u09bf\u0996\u09c1\u09a8:",
        instructions_context: "\u09ac\u09be\u0995\u09cd\u09b8\u09c7 \u09b6\u09ac\u09cd\u09a6\u0997\u09c1\u09b2\u09bf \u099f\u09be\u0987\u09aa \u0995\u09b0\u09c1\u09a8:",
        instructions_audio: "\u0986\u09aa\u09a8\u09bf \u09af\u09be \u09b6\u09c1\u09a8\u099b\u09c7\u09a8 \u09a4\u09be \u09b2\u09bf\u0996\u09c1\u09a8:",
        help_btn: "\u09b8\u09b9\u09be\u09df\u09a4\u09be",
        play_again: "\u0986\u09ac\u09be\u09b0 \u09b8\u09be\u0989\u09a8\u09cd\u09a1 \u09aa\u09cd\u09b2\u09c7 \u0995\u09b0\u09c1\u09a8",
        cant_hear_this: "MP3 \u09b0\u09c2\u09aa\u09c7 \u09b6\u09ac\u09cd\u09a6 \u09a1\u09be\u0989\u09a8\u09b2\u09cb\u09a1 \u0995\u09b0\u09c1\u09a8",
        incorrect_try_again: "\u09ac\u09c7\u09a0\u09bf\u0995\u09f7 \u0986\u09ac\u09be\u09b0 \u099a\u09c7\u09b7\u09cd\u099f\u09be \u0995\u09b0\u09c1\u09a8\u09f7",
        image_alt_text: "reCAPTCHA \u099a\u09cd\u09af\u09be\u09b2\u09c7\u099e\u09cd\u099c \u099a\u09bf\u09a4\u09cd\u09b0"
    },
    RecaptchaStr_ca = {
        visual_challenge: "Obt\u00e9n un repte visual",
        audio_challenge: "Obteniu una prova d'\u00e0udio",
        refresh_btn: "Obteniu una prova nova",
        instructions_visual: "Escriviu les dues paraules:",
        instructions_context: "Escriviu les paraules dels quadres:",
        instructions_audio: "Escriviu el que escolteu:",
        help_btn: "Ajuda",
        play_again: "Torna a reproduir el so",
        cant_hear_this: "Baixa el so com a MP3",
        incorrect_try_again: "No \u00e9s correcte. Torna-ho a provar.",
        image_alt_text: "Imatge del repte de reCAPTCHA"
    },
    RecaptchaStr_cs = {
        visual_challenge: "Zobrazit vizu\u00e1ln\u00ed podobu v\u00fdrazu",
        audio_challenge: "P\u0159ehr\u00e1t zvukovou podobu v\u00fdrazu",
        refresh_btn: "Zobrazit nov\u00fd v\u00fdraz",
        instructions_visual: "Zadejte dv\u011b slova:",
        instructions_context: "Zadejte slova uveden\u00e1 v pol\u00edch:",
        instructions_audio: "Napi\u0161te, co jste sly\u0161eli:",
        help_btn: "N\u00e1pov\u011bda",
        play_again: "Znovu p\u0159ehr\u00e1t zvuk",
        cant_hear_this: "St\u00e1hnout zvuk ve form\u00e1tu MP3",
        incorrect_try_again: "\u0160patn\u011b. Zkuste to znovu.",
        image_alt_text: "Obr\u00e1zek reCAPTCHA"
    },
    RecaptchaStr_da = {
        visual_challenge: "Hent en visuel udfordring",
        audio_challenge: "Hent en lydudfordring",
        refresh_btn: "Hent en ny udfordring",
        instructions_visual: "Indtast de to ord:",
        instructions_context: "Indtast ordene i felterne:",
        instructions_audio: "Indtast det, du h\u00f8rer:",
        help_btn: "Hj\u00e6lp",
        play_again: "Afspil lyden igen",
        cant_hear_this: "Download lyd som MP3",
        incorrect_try_again: "Forkert. Pr\u00f8v igen.",
        image_alt_text: "reCAPTCHA-udfordringsbillede"
    },
    RecaptchaStr_de = {
        visual_challenge: "Captcha abrufen",
        audio_challenge: "Audio-Captcha abrufen",
        refresh_btn: "Neues Captcha abrufen",
        instructions_visual: "Geben Sie die 2 W\u00f6rter ein:",
        instructions_context: "Worte aus den Feldern eingeben:",
        instructions_audio: "Geben Sie das Geh\u00f6rte ein:",
        help_btn: "Hilfe",
        play_again: "Wort erneut abspielen",
        cant_hear_this: "Wort als MP3 herunterladen",
        incorrect_try_again: "Falsch. Bitte versuchen Sie es erneut.",
        image_alt_text: "reCAPTCHA-Bild"
    },
    RecaptchaStr_el = {
        visual_challenge: "\u039f\u03c0\u03c4\u03b9\u03ba\u03ae \u03c0\u03c1\u03cc\u03ba\u03bb\u03b7\u03c3\u03b7",
        audio_challenge: "\u0397\u03c7\u03b7\u03c4\u03b9\u03ba\u03ae \u03c0\u03c1\u03cc\u03ba\u03bb\u03b7\u03c3\u03b7",
        refresh_btn: "\u039d\u03ad\u03b1 \u03c0\u03c1\u03cc\u03ba\u03bb\u03b7\u03c3\u03b7",
        instructions_visual: "\u03a0\u03bb\u03b7\u03ba\u03c4\u03c1\u03bf\u03bb\u03bf\u03b3\u03ae\u03c3\u03c4\u03b5 \u03c4\u03b9\u03c2 \u03bb\u03ad\u03be\u03b5\u03b9\u03c2:",
        instructions_context: "\u03a0\u03bb\u03b7\u03ba\u03c4\u03c1\u03bf\u03bb\u03bf\u03b3\u03ae\u03c3\u03c4\u03b5 \u03c4\u03b9\u03c2 \u03bb\u03ad\u03be\u03b5\u03b9\u03c2:",
        instructions_audio: "\u03a0\u03bb\u03b7\u03ba\u03c4\u03c1\u03bf\u03bb\u03bf\u03b3\u03ae\u03c3\u03c4\u03b5 \u03cc\u03c4\u03b9 \u03b1\u03ba\u03bf\u03cd\u03c4\u03b5:",
        help_btn: "\u0392\u03bf\u03ae\u03b8\u03b5\u03b9\u03b1",
        play_again: "\u0391\u03bd\u03b1\u03c0\u03b1\u03c1\u03b1\u03b3\u03c9\u03b3\u03ae \u03ae\u03c7\u03bf\u03c5 \u03be\u03b1\u03bd\u03ac",
        cant_hear_this: "\u039b\u03ae\u03c8\u03b7 \u03ae\u03c7\u03bf\u03c5 \u03c9\u03c2 \u039c\u03a13",
        incorrect_try_again: "\u039b\u03ac\u03b8\u03bf\u03c2. \u0394\u03bf\u03ba\u03b9\u03bc\u03ac\u03c3\u03c4\u03b5 \u03be\u03b1\u03bd\u03ac.",
        image_alt_text: "\u0395\u03b9\u03ba\u03cc\u03bd\u03b1 \u03c0\u03c1\u03cc\u03ba\u03bb\u03b7\u03c3\u03b7\u03c2 reCAPTCHA"
    },
    RecaptchaStr_es = {
        visual_challenge: "Obtener una pista visual",
        audio_challenge: "Obtener una pista sonora",
        refresh_btn: "Obtener una pista nueva",
        instructions_visual: "Escribe las dos palabras:",
        instructions_context: "Escribe las palabras de los cuadros:",
        instructions_audio: "Escribe lo que oigas:",
        help_btn: "Ayuda",
        play_again: "Volver a reproducir el sonido",
        cant_hear_this: "Descargar el sonido en MP3",
        incorrect_try_again: "Incorrecto. Vu\u00e9lvelo a intentar.",
        image_alt_text: "Pista de imagen reCAPTCHA"
    },
    RecaptchaStr_es_419 = {
        visual_challenge: "Enfrentar un desaf\u00edo visual",
        audio_challenge: "Enfrentar un desaf\u00edo de audio",
        refresh_btn: "Enfrentar un nuevo desaf\u00edo",
        instructions_visual: "Tipea las dos palabras.",
        instructions_context: "Tipea las palabras en los cuadros",
        instructions_audio: "Tipea lo que escuchas:",
        help_btn: "Ayuda",
        play_again: "Reproducir sonido de nuevo",
        cant_hear_this: "Descargar sonido en formato MP3",
        incorrect_try_again: "Incorrecto. Vuelve a intentarlo.",
        image_alt_text: "Imagen del desaf\u00edo de la reCAPTCHA"
    },
    RecaptchaStr_et = {
        visual_challenge: "Kuva kuvap\u00f5hine robotil\u00f5ks",
        audio_challenge: "Kuva helip\u00f5hine robotil\u00f5ks",
        refresh_btn: "Kuva uus robotil\u00f5ks",
        instructions_visual: "Tippige kaks s\u00f5na.",
        instructions_context: "Tippige kastides olevad s\u00f5nad.",
        instructions_audio: "Tippige, mida kuulete.",
        help_btn: "Abi",
        play_again: "Esita heli uuesti",
        cant_hear_this: "Laadi heli alla MP3-vormingus",
        incorrect_try_again: "Vale. Proovige uuesti.",
        image_alt_text: "reCAPTCHA robotil\u00f5ksu kujutis"
    },
    RecaptchaStr_eu = {
        visual_challenge: "Eskuratu ikusizko erronka",
        audio_challenge: "Eskuratu audio-erronka",
        refresh_btn: "Eskuratu erronka berria",
        instructions_visual: "Idatzi bi hitzak:",
        instructions_context: "Idatzi koadroetako hitzak:",
        instructions_audio: "Idatzi entzuten duzuna:",
        help_btn: "Laguntza",
        play_again: "Erreproduzitu soinua berriro",
        cant_hear_this: "Deskargatu soinua MP3 gisa",
        incorrect_try_again: "Ez da zuzena. Saiatu berriro.",
        image_alt_text: "reCAPTCHA erronkaren irudia"
    },
    RecaptchaStr_fa = {
        visual_challenge: "\u062f\u0631\u06cc\u0627\u0641\u062a \u06cc\u06a9 \u0645\u0639\u0645\u0627\u06cc \u062f\u06cc\u062f\u0627\u0631\u06cc",
        audio_challenge: "\u062f\u0631\u06cc\u0627\u0641\u062a \u06cc\u06a9 \u0645\u0639\u0645\u0627\u06cc \u0635\u0648\u062a\u06cc",
        refresh_btn: "\u062f\u0631\u06cc\u0627\u0641\u062a \u06cc\u06a9 \u0645\u0639\u0645\u0627\u06cc \u062c\u062f\u06cc\u062f",
        instructions_visual: "\u0627\u06cc\u0646 \u062f\u0648 \u06a9\u0644\u0645\u0647 \u0631\u0627 \u062a\u0627\u06cc\u067e \u06a9\u0646\u06cc\u062f:",
        instructions_context: "\u0648\u0627\u0698\u0647 \u0647\u0627\u06cc \u0645\u0648\u062c\u0648\u062f \u062f\u0631 \u06a9\u0627\u062f\u0631\u0647\u0627 \u0631\u0627 \u062a\u0627\u06cc\u067e \u06a9\u0646\u06cc\u062f:",
        instructions_audio: "\u0622\u0646\u0686\u0647 \u0631\u0627 \u06a9\u0647 \u0645\u06cc \u0634\u0646\u0648\u06cc\u062f \u062a\u0627\u06cc\u067e \u06a9\u0646\u06cc\u062f:",
        help_btn: "\u0631\u0627\u0647\u0646\u0645\u0627\u06cc\u06cc",
        play_again: "\u067e\u062e\u0634 \u0645\u062c\u062f\u062f \u0635\u062f\u0627",
        cant_hear_this: "\u062f\u0627\u0646\u0644\u0648\u062f \u0635\u062f\u0627 \u0628\u0647 \u0635\u0648\u0631\u062a MP3",
        incorrect_try_again: "\u0646\u0627\u062f\u0631\u0633\u062a. \u062f\u0648\u0628\u0627\u0631\u0647 \u0627\u0645\u062a\u062d\u0627\u0646 \u06a9\u0646\u06cc\u062f.",
        image_alt_text: ""
    },
    RecaptchaStr_fi = {
        visual_challenge: "Kuvavahvistus",
        audio_challenge: "\u00c4\u00e4nivahvistus",
        refresh_btn: "Uusi kuva",
        instructions_visual: "Kirjoita n\u00e4kem\u00e4si kaksi sanaa:",
        instructions_context: "Kirjoita n\u00e4kem\u00e4si sanat:",
        instructions_audio: "Kirjoita kuulemasi:",
        help_btn: "Ohje",
        play_again: "Toista \u00e4\u00e4ni uudelleen",
        cant_hear_this: "Lataa \u00e4\u00e4ni MP3-tiedostona",
        incorrect_try_again: "V\u00e4\u00e4rin. Yrit\u00e4 uudelleen.",
        image_alt_text: "reCAPTCHA-kuva"
    },
    RecaptchaStr_fil = {
        visual_challenge: "Kumuha ng pagsubok na visual",
        audio_challenge: "Kumuha ng pagsubok na audio",
        refresh_btn: "Kumuha ng bagong pagsubok",
        instructions_visual: "I-type ang dalawang mga salita:",
        instructions_context: "I-type ang mga salita sa mga kahon:",
        instructions_audio: "I-type ang iyong narinig",
        help_btn: "Tulong",
        play_again: "I-play muli ang tunog",
        cant_hear_this: "I-download ang tunog bilang MP3",
        incorrect_try_again: "Hindi wasto. Muling subukan.",
        image_alt_text: "larawang panghamon ng reCAPTCHA"
    },
    RecaptchaStr_fr = {
        visual_challenge: "Test visuel",
        audio_challenge: "Test audio",
        refresh_btn: "Nouveau test",
        instructions_visual: "Saisissez les deux mots :",
        instructions_context: "Saisissez les mots ci-dessus :",
        instructions_audio: "Qu'entendez-vous ?",
        help_btn: "Aide",
        play_again: "R\u00e9\u00e9couter",
        cant_hear_this: "T\u00e9l\u00e9charger l'audio au format MP3",
        incorrect_try_again: "Incorrect. Veuillez r\u00e9essayer.",
        image_alt_text: "Image reCAPTCHA"
    },
    RecaptchaStr_fr_ca = {
        visual_challenge: "Obtenir un test visuel",
        audio_challenge: "Obtenir un test audio",
        refresh_btn: "Obtenir un nouveau test",
        instructions_visual: "Saisissez les deux mots :",
        instructions_context: "Tapez les mots dans les bo\u00eetes de texte\u00a0:",
        instructions_audio: "Qu'entendez-vous?",
        help_btn: "Aide",
        play_again: "Jouer le son de nouveau",
        cant_hear_this: "T\u00e9l\u00e9charger le son en format MP3",
        incorrect_try_again: "Erreur, essayez \u00e0 nouveau",
        image_alt_text: "Image reCAPTCHA"
    },
    RecaptchaStr_gl = {
        visual_challenge: "Obter unha proba visual",
        audio_challenge: "Obter unha proba de audio",
        refresh_btn: "Obter unha proba nova",
        instructions_visual: "Escribe as d\u00faas palabras:",
        instructions_context: "Escribe as palabras nas caixas:",
        instructions_audio: "Escribe o que escoitas:",
        help_btn: "Axuda",
        play_again: "Reproducir o son de novo",
        cant_hear_this: "Descargar son como MP3",
        incorrect_try_again: "Incorrecto. T\u00e9ntao de novo.",
        image_alt_text: "Imaxe de proba de reCAPTCHA"
    },
    RecaptchaStr_gu = {
        visual_challenge: "\u0a8f\u0a95 \u0aa6\u0ac3\u0ab6\u0acd\u0aaf\u0abe\u0aa4\u0acd\u0aae\u0a95 \u0aaa\u0aa1\u0a95\u0abe\u0ab0 \u0aae\u0ac7\u0ab3\u0ab5\u0acb",
        audio_challenge: "\u0a8f\u0a95 \u0a91\u0aa1\u0abf\u0a93 \u0aaa\u0aa1\u0a95\u0abe\u0ab0 \u0aae\u0ac7\u0ab3\u0ab5\u0acb",
        refresh_btn: "\u0a8f\u0a95 \u0aa8\u0ab5\u0acb \u0aaa\u0aa1\u0a95\u0abe\u0ab0 \u0aae\u0ac7\u0ab3\u0ab5\u0acb",
        instructions_visual: "\u0aac\u0ac7 \u0ab6\u0aac\u0acd\u0aa6 \u0ab2\u0a96\u0acb:",
        instructions_context: "\u0aac\u0ac9\u0a95\u0acd\u0ab8\u0aae\u0abe\u0a82 \u0ab6\u0aac\u0acd\u0aa6\u0acb \u0ab2\u0a96\u0acb:",
        instructions_audio: "\u0aa4\u0aae\u0ac7 \u0a9c\u0ac7 \u0ab8\u0abe\u0a82\u0aad\u0ab3\u0acb \u0a9b\u0acb \u0aa4\u0ac7 \u0ab2\u0a96\u0acb:",
        help_btn: "\u0ab8\u0ab9\u0abe\u0aaf",
        play_again: "\u0aa7\u0acd\u0ab5\u0aa8\u0abf \u0aab\u0ab0\u0ac0\u0aa5\u0ac0 \u0a9a\u0ab2\u0abe\u0ab5\u0acb",
        cant_hear_this: "MP3 \u0aa4\u0ab0\u0ac0\u0a95\u0ac7 \u0aa7\u0acd\u0ab5\u0aa8\u0abf\u0aa8\u0ac7 \u0aa1\u0abe\u0a89\u0aa8\u0ab2\u0acb\u0aa1 \u0a95\u0ab0\u0acb",
        incorrect_try_again: "\u0a96\u0acb\u0a9f\u0ac1\u0a82. \u0aab\u0ab0\u0ac0 \u0aaa\u0acd\u0ab0\u0aaf\u0abe\u0ab8 \u0a95\u0ab0\u0acb.",
        image_alt_text: "reCAPTCHA \u0aaa\u0aa1\u0a95\u0abe\u0ab0 \u0a9b\u0aac\u0ac0"
    },
    RecaptchaStr_hi = {
        visual_challenge: "\u0915\u094b\u0908 \u0935\u093f\u091c\u0941\u0905\u0932 \u091a\u0941\u0928\u094c\u0924\u0940 \u0932\u0947\u0902",
        audio_challenge: "\u0915\u094b\u0908 \u0911\u0921\u093f\u092f\u094b \u091a\u0941\u0928\u094c\u0924\u0940 \u0932\u0947\u0902",
        refresh_btn: "\u0915\u094b\u0908 \u0928\u0908 \u091a\u0941\u0928\u094c\u0924\u0940 \u0932\u0947\u0902",
        instructions_visual: "\u0926\u094b \u0936\u092c\u094d\u200d\u0926 \u0932\u093f\u0916\u0947\u0902:",
        instructions_context: "\u0936\u092c\u094d\u200d\u0926\u094b\u0902 \u0915\u094b \u092c\u0949\u0915\u094d\u200d\u0938 \u092e\u0947\u0902 \u0932\u093f\u0916\u0947\u0902:",
        instructions_audio: "\u091c\u094b \u0906\u092a \u0938\u0941\u0928 \u0930\u0939\u0947 \u0939\u0948\u0902 \u0909\u0938\u0947 \u0932\u093f\u0916\u0947\u0902:",
        help_btn: "\u0938\u0939\u093e\u092f\u0924\u093e",
        play_again: "\u0927\u094d\u200d\u0935\u0928\u093f \u092a\u0941\u0928: \u091a\u0932\u093e\u090f\u0902",
        cant_hear_this: "\u0927\u094d\u200d\u0935\u0928\u093f \u0915\u094b MP3 \u0915\u0947 \u0930\u0942\u092a \u092e\u0947\u0902 \u0921\u093e\u0909\u0928\u0932\u094b\u0921 \u0915\u0930\u0947\u0902",
        incorrect_try_again: "\u0917\u0932\u0924. \u092a\u0941\u0928: \u092a\u094d\u0930\u092f\u093e\u0938 \u0915\u0930\u0947\u0902.",
        image_alt_text: "reCAPTCHA \u091a\u0941\u0928\u094c\u0924\u0940 \u091b\u0935\u093f"
    },
    RecaptchaStr_hr = {
        visual_challenge: "Dohvati vizualni upit",
        audio_challenge: "Dohvati zvu\u010dni upit",
        refresh_btn: "Dohvati novi upit",
        instructions_visual: "Upi\u0161ite obje rije\u010di:",
        instructions_context: "Upi\u0161ite rije\u010di u okvire:",
        instructions_audio: "Upi\u0161ite \u0161to \u010dujete:",
        help_btn: "Pomo\u0107",
        play_again: "Ponovi zvuk",
        cant_hear_this: "Preuzmi zvuk u MP3 formatu",
        incorrect_try_again: "Nije to\u010dno. Poku\u0161ajte ponovno.",
        image_alt_text: "Slikovni izazov reCAPTCHA"
    },
    RecaptchaStr_hu = {
        visual_challenge: "Vizu\u00e1lis kih\u00edv\u00e1s k\u00e9r\u00e9se",
        audio_challenge: "Hangkih\u00edv\u00e1s k\u00e9r\u00e9se",
        refresh_btn: "\u00daj kih\u00edv\u00e1s k\u00e9r\u00e9se",
        instructions_visual: "Adja meg a k\u00e9t sz\u00f3t:",
        instructions_context: "\u00cdrja be a szavakat a mez\u0151kbe:",
        instructions_audio: "\u00cdrja le, amit hall:",
        help_btn: "S\u00fag\u00f3",
        play_again: "Hang ism\u00e9telt lej\u00e1tsz\u00e1sa",
        cant_hear_this: "Hang let\u00f6lt\u00e9se MP3 form\u00e1tumban",
        incorrect_try_again: "Hib\u00e1s. Pr\u00f3b\u00e1lkozzon \u00fajra.",
        image_alt_text: "reCAPTCHA ellen\u0151rz\u0151 k\u00e9p"
    },
    RecaptchaStr_hy = {
        visual_challenge: "\u054d\u057f\u0561\u0576\u0561\u056c \u057f\u0565\u057d\u0578\u0572\u0561\u056f\u0561\u0576 \u056d\u0576\u0564\u056b\u0580",
        audio_challenge: "\u054d\u057f\u0561\u0576\u0561\u056c \u0571\u0561\u0575\u0576\u0561\u0575\u056b\u0576 \u056d\u0576\u0564\u056b\u0580",
        refresh_btn: "\u054d\u057f\u0561\u0576\u0561\u056c \u0576\u0578\u0580 \u056d\u0576\u0564\u056b\u0580",
        instructions_visual: "\u0544\u0578\u0582\u057f\u0584\u0561\u0563\u0580\u0565\u0584 \u0561\u0575\u057d \u0565\u0580\u056f\u0578\u0582 \u0562\u0561\u057c\u0565\u0580\u0568\u055d",
        instructions_context: "\u0544\u0578\u0582\u057f\u0584\u0561\u0563\u0580\u0565\u0584 \u0562\u0561\u057c\u0565\u0580\u0568 \u057f\u0578\u0582\u0583\u0565\u0580\u0578\u0582\u0574\u055d",
        instructions_audio: "\u0544\u0578\u0582\u057f\u0584\u0561\u0563\u0580\u0565\u0584 \u0561\u0575\u0576, \u056b\u0576\u0579 \u056c\u057d\u0578\u0582\u0574 \u0565\u0584\u055d",
        help_btn: "\u0555\u0563\u0576\u0578\u0582\u0569\u0575\u0578\u0582\u0576",
        play_again: "\u0546\u057e\u0561\u0563\u0561\u0580\u056f\u0565\u056c \u0571\u0561\u0575\u0576\u0568 \u056f\u0580\u056f\u056b\u0576",
        cant_hear_this: "\u0532\u0565\u057c\u0576\u0565\u056c \u0571\u0561\u0575\u0576\u0568 \u0578\u0580\u057a\u0565\u057d MP3",
        incorrect_try_again: "\u054d\u056d\u0561\u056c \u0567: \u0553\u0578\u0580\u0571\u0565\u0584 \u056f\u0580\u056f\u056b\u0576:",
        image_alt_text: ""
    },
    RecaptchaStr_id = {
        visual_challenge: "Dapatkan kata pengujian berbentuk visual",
        audio_challenge: "Dapatkan kata pengujian berbentuk audio",
        refresh_btn: "Dapatkan kata pengujian baru",
        instructions_visual: "Ketik dua kata ini:",
        instructions_context: "Ketik kata di dalam kotak:",
        instructions_audio: "Ketik yang Anda dengar:",
        help_btn: "Bantuan",
        play_again: "Putar suara sekali lagi",
        cant_hear_this: "Unduh suara sebagai MP3",
        incorrect_try_again: "Salah. Coba lagi.",
        image_alt_text: "Gambar tantangan reCAPTCHA"
    },
    RecaptchaStr_is = {
        visual_challenge: "F\u00e1 a\u00f0gangspr\u00f3f sem mynd",
        audio_challenge: "F\u00e1 hlj\u00f3\u00f0pr\u00f3f",
        refresh_btn: "F\u00e1 n\u00fdtt a\u00f0gangspr\u00f3f",
        instructions_visual: "Sl\u00e1\u00f0u inn \u00feessi tv\u00f6 or\u00f0:",
        instructions_context: "Sl\u00e1\u00f0u or\u00f0in inn \u00ed reitina:",
        instructions_audio: "Sl\u00e1\u00f0u inn \u00fea\u00f0 sem \u00fe\u00fa heyrir:",
        help_btn: "Hj\u00e1lp",
        play_again: "Spila hlj\u00f3\u00f0 aftur",
        cant_hear_this: "S\u00e6kja hlj\u00f3\u00f0 sem MP3",
        incorrect_try_again: "Rangt. Reyndu aftur.",
        image_alt_text: "mynd reCAPTCHA a\u00f0gangspr\u00f3fs"
    },
    RecaptchaStr_it = {
        visual_challenge: "Verifica visiva",
        audio_challenge: "Verifica audio",
        refresh_btn: "Nuova verifica",
        instructions_visual: "Digita le due parole:",
        instructions_context: "Digita le parole nelle caselle:",
        instructions_audio: "Digita ci\u00f2 che senti:",
        help_btn: "Guida",
        play_again: "Riproduci di nuovo audio",
        cant_hear_this: "Scarica audio in MP3",
        incorrect_try_again: "Sbagliato. Riprova.",
        image_alt_text: "Immagine di verifica reCAPTCHA"
    },
    RecaptchaStr_iw = {
        visual_challenge: "\u05e7\u05d1\u05dc \u05d0\u05ea\u05d2\u05e8 \u05d7\u05d6\u05d5\u05ea\u05d9",
        audio_challenge: "\u05e7\u05d1\u05dc \u05d0\u05ea\u05d2\u05e8 \u05e9\u05de\u05e2",
        refresh_btn: "\u05e7\u05d1\u05dc \u05d0\u05ea\u05d2\u05e8 \u05d7\u05d3\u05e9",
        instructions_visual: "\u05d4\u05e7\u05dc\u05d3 \u05d0\u05ea \u05e9\u05ea\u05d9 \u05d4\u05de\u05d9\u05dc\u05d9\u05dd:",
        instructions_context: "\u05d4\u05e7\u05dc\u05d3 \u05d0\u05ea \u05d4\u05de\u05d9\u05dc\u05d9\u05dd \u05d1\u05ea\u05d9\u05d1\u05d5\u05ea:",
        instructions_audio: "\u05d4\u05e7\u05dc\u05d3 \u05d0\u05ea \u05de\u05d4 \u05e9\u05d0\u05ea\u05d4 \u05e9\u05d5\u05de\u05e2:",
        help_btn: "\u05e2\u05d6\u05e8\u05d4",
        play_again: "\u05d4\u05e4\u05e2\u05dc \u05e9\u05d5\u05d1 \u05d0\u05ea \u05d4\u05e9\u05de\u05e2",
        cant_hear_this: "\u05d4\u05d5\u05e8\u05d3 \u05e9\u05de\u05e2 \u05db-3MP",
        incorrect_try_again: "\u05e9\u05d2\u05d5\u05d9. \u05e0\u05e1\u05d4 \u05e9\u05d5\u05d1.",
        image_alt_text: "\u05ea\u05de\u05d5\u05e0\u05ea \u05d0\u05ea\u05d2\u05e8 \u05e9\u05dc reCAPTCHA"
    },
    RecaptchaStr_ja = {
        visual_challenge: "\u753b\u50cf\u3067\u78ba\u8a8d\u3057\u307e\u3059",
        audio_challenge: "\u97f3\u58f0\u3067\u78ba\u8a8d\u3057\u307e\u3059",
        refresh_btn: "\u5225\u306e\u5358\u8a9e\u3067\u3084\u308a\u76f4\u3057\u307e\u3059",
        instructions_visual: "2 \u3064\u306e\u5358\u8a9e\u3092\u5165\u529b\u3057\u307e\u3059:",
        instructions_context: "\u30dc\u30c3\u30af\u30b9\u5185\u306e\u5358\u8a9e\u3092\u5165\u529b\u3057\u3066\u304f\u3060\u3055\u3044:",
        instructions_audio: "\u805e\u3053\u3048\u305f\u5358\u8a9e\u3092\u5165\u529b\u3057\u307e\u3059:",
        help_btn: "\u30d8\u30eb\u30d7",
        play_again: "\u3082\u3046\u4e00\u5ea6\u805e\u304f",
        cant_hear_this: "MP3 \u3067\u97f3\u58f0\u3092\u30c0\u30a6\u30f3\u30ed\u30fc\u30c9",
        incorrect_try_again: "\u6b63\u3057\u304f\u3042\u308a\u307e\u305b\u3093\u3002\u3082\u3046\u4e00\u5ea6\u3084\u308a\u76f4\u3057\u3066\u304f\u3060\u3055\u3044\u3002",
        image_alt_text: "reCAPTCHA \u78ba\u8a8d\u7528\u753b\u50cf"
    },
    RecaptchaStr_kn = {
        visual_challenge: "\u0ca6\u0cc3\u0cb6\u0ccd\u0caf \u0cb8\u0cb5\u0cbe\u0cb2\u0cca\u0c82\u0ca6\u0ca8\u0ccd\u0ca8\u0cc1 \u0cb8\u0ccd\u0cb5\u0cc0\u0c95\u0cb0\u0cbf\u0cb8\u0cbf",
        audio_challenge: "\u0c86\u0ca1\u0cbf\u0caf\u0ccb \u0cb8\u0cb5\u0cbe\u0cb2\u0cca\u0c82\u0ca6\u0ca8\u0ccd\u0ca8\u0cc1 \u0cb8\u0ccd\u0cb5\u0cc0\u0c95\u0cb0\u0cbf\u0cb8\u0cbf",
        refresh_btn: "\u0cb9\u0cca\u0cb8 \u0cb8\u0cb5\u0cbe\u0cb2\u0cca\u0c82\u0ca6\u0ca8\u0ccd\u0ca8\u0cc1 \u0caa\u0ca1\u0cc6\u0caf\u0cbf\u0cb0\u0cbf",
        instructions_visual: "\u0c8e\u0cb0\u0ca1\u0cc1 \u0caa\u0ca6\u0c97\u0cb3\u0ca8\u0ccd\u0ca8\u0cc1 \u0c9f\u0cc8\u0caa\u0ccd \u0cae\u0cbe\u0ca1\u0cbf:",
        instructions_context: "\u0cac\u0cbe\u0c95\u0ccd\u0cb8\u0ccd\u200c\u0ca8\u0cb2\u0ccd\u0cb2\u0cbf \u0caa\u0ca6\u0c97\u0cb3\u0ca8\u0ccd\u0ca8\u0cc1 \u0c9f\u0cc8\u0caa\u0ccd\u200c \u0cae\u0cbe\u0ca1\u0cbf:",
        instructions_audio: "\u0ca8\u0cbf\u0cae\u0c97\u0cc6 \u0c95\u0cc7\u0cb3\u0cbf\u0cb8\u0cc1\u0cb5\u0cc1\u0ca6\u0ca8\u0ccd\u0ca8\u0cc1 \u0c9f\u0cc8\u0caa\u0ccd\u200c \u0cae\u0cbe\u0ca1\u0cbf:",
        help_btn: "\u0cb8\u0cb9\u0cbe\u0caf",
        play_again: "\u0ca7\u0ccd\u0cb5\u0ca8\u0cbf\u0caf\u0ca8\u0ccd\u0ca8\u0cc1 \u0cae\u0ca4\u0ccd\u0ca4\u0cc6 \u0caa\u0ccd\u0cb2\u0cc7 \u0cae\u0cbe\u0ca1\u0cbf",
        cant_hear_this: "\u0ca7\u0ccd\u0cb5\u0ca8\u0cbf\u0caf\u0ca8\u0ccd\u0ca8\u0cc1 MP3 \u0cb0\u0cc2\u0caa\u0ca6\u0cb2\u0ccd\u0cb2\u0cbf \u0ca1\u0ccc\u0ca8\u0ccd\u200c\u0cb2\u0ccb\u0ca1\u0ccd \u0cae\u0cbe\u0ca1\u0cbf",
        incorrect_try_again: "\u0ca4\u0caa\u0ccd\u0caa\u0cbe\u0c97\u0cbf\u0ca6\u0cc6. \u0cae\u0ca4\u0ccd\u0ca4\u0cca\u0cae\u0ccd\u0cae\u0cc6 \u0caa\u0ccd\u0cb0\u0caf\u0ca4\u0ccd\u0ca8\u0cbf\u0cb8\u0cbf.",
        image_alt_text: "reCAPTCHA \u0cb8\u0cb5\u0cbe\u0cb2\u0cc1 \u0c9a\u0cbf\u0ca4\u0ccd\u0cb0"
    },
    RecaptchaStr_ko = {
        visual_challenge: "\uadf8\ub9bc\uc73c\ub85c \ubcf4\uc548\ubb38\uc790 \ubc1b\uae30",
        audio_challenge: "\uc74c\uc131\uc73c\ub85c \ubcf4\uc548\ubb38\uc790 \ubc1b\uae30",
        refresh_btn: "\ubcf4\uc548\ubb38\uc790 \uc0c8\ub85c \ubc1b\uae30",
        instructions_visual: "\ub450 \ub2e8\uc5b4 \uc785\ub825:",
        instructions_context: "\uc785\ub825\ub780\uc5d0 \ub2e8\uc5b4 \uc785\ub825:",
        instructions_audio: "\uc74c\uc131 \ubcf4\uc548\ubb38\uc790 \uc785\ub825:",
        help_btn: "\ub3c4\uc6c0\ub9d0",
        play_again: "\uc74c\uc131 \ub2e4\uc2dc \ub4e3\uae30",
        cant_hear_this: "\uc74c\uc131\uc744 MP3\ub85c \ub2e4\uc6b4\ub85c\ub4dc",
        incorrect_try_again: "\ud2c0\ub838\uc2b5\ub2c8\ub2e4. \ub2e4\uc2dc \uc2dc\ub3c4\ud574 \uc8fc\uc138\uc694.",
        image_alt_text: "reCAPTCHA \uc694\uccad \uc774\ubbf8\uc9c0"
    },
    RecaptchaStr_lt = {
        visual_challenge: "Gauti vaizdin\u012f atpa\u017einimo test\u0105",
        audio_challenge: "Gauti garso atpa\u017einimo test\u0105",
        refresh_btn: "Gauti nauj\u0105 atpa\u017einimo test\u0105",
        instructions_visual: "\u012eveskite du \u017eod\u017eius:",
        instructions_context: "\u012eveskite \u017eod\u017eius laukeliuose:",
        instructions_audio: "\u012eveskite tai, k\u0105 girdite:",
        help_btn: "Pagalba",
        play_again: "Dar kart\u0105 paleisti gars\u0105",
        cant_hear_this: "Atsisi\u0173sti gars\u0105 kaip MP3",
        incorrect_try_again: "Neteisingai. Bandykite dar kart\u0105.",
        image_alt_text: "Testo \u201ereCAPTCHA\u201c vaizdas"
    },
    RecaptchaStr_lv = {
        visual_challenge: "Sa\u0146emt vizu\u0101lu izaicin\u0101jumu",
        audio_challenge: "Sa\u0146emt audio izaicin\u0101jumu",
        refresh_btn: "Sa\u0146emt jaunu izaicin\u0101jumu",
        instructions_visual: "Ierakstiet divus v\u0101rdus:",
        instructions_context: "Ierakstiet v\u0101rdus lodzi\u0146os:",
        instructions_audio: "Ierakstiet dzirdamo:",
        help_btn: "Pal\u012bdz\u012bba",
        play_again: "V\u0113lreiz atska\u0146ot ska\u0146u",
        cant_hear_this: "Lejupiel\u0101d\u0113t ska\u0146u MP3\u00a0form\u0101t\u0101",
        incorrect_try_again: "Nepareizi. M\u0113\u0123iniet v\u0113lreiz.",
        image_alt_text: "reCAPTCHA izaicin\u0101juma att\u0113ls"
    },
    RecaptchaStr_ml = {
        visual_challenge: "\u0d12\u0d30\u0d41 \u0d26\u0d43\u0d36\u0d4d\u0d2f \u0d1a\u0d32\u0d1e\u0d4d\u0d1a\u0d4d \u0d28\u0d47\u0d1f\u0d41\u0d15",
        audio_challenge: "\u0d12\u0d30\u0d41 \u0d13\u0d21\u0d3f\u0d2f\u0d4b \u0d1a\u0d32\u0d1e\u0d4d\u0d1a\u0d4d \u0d28\u0d47\u0d1f\u0d41\u0d15",
        refresh_btn: "\u0d12\u0d30\u0d41 \u0d2a\u0d41\u0d24\u0d3f\u0d2f \u0d1a\u0d32\u0d1e\u0d4d\u0d1a\u0d4d \u0d28\u0d47\u0d1f\u0d41\u0d15",
        instructions_visual: "\u0d30\u0d23\u0d4d\u0d1f\u0d4d \u0d2a\u0d26\u0d19\u0d4d\u0d19\u0d7e \u0d1f\u0d48\u0d2a\u0d4d\u0d2a\u0d4d \u0d1a\u0d46\u0d2f\u0d4d\u0d2f\u0d41\u0d15:",
        instructions_context: "\u0d2c\u0d4b\u0d15\u0d4d\u200c\u0d38\u0d41\u0d15\u0d33\u0d3f\u0d32\u0d46 \u0d2a\u0d26\u0d19\u0d4d\u0d19\u0d7e \u0d1f\u0d48\u0d2a\u0d4d\u0d2a\u0d41\u0d1a\u0d46\u0d2f\u0d4d\u0d2f\u0d41\u0d15:",
        instructions_audio: "\u0d15\u0d47\u0d7e\u0d15\u0d4d\u0d15\u0d41\u0d28\u0d4d\u0d28\u0d24\u0d4d \u0d1f\u0d48\u0d2a\u0d4d\u0d2a\u0d4d \u0d1a\u0d46\u0d2f\u0d4d\u0d2f\u0d42:",
        help_btn: "\u0d38\u0d39\u0d3e\u0d2f\u0d02",
        play_again: "\u0d36\u0d2c\u0d4d\u200c\u0d26\u0d02 \u0d35\u0d40\u0d23\u0d4d\u0d1f\u0d41\u0d02 \u0d2a\u0d4d\u0d32\u0d47 \u0d1a\u0d46\u0d2f\u0d4d\u0d2f\u0d41\u0d15",
        cant_hear_this: "\u0d36\u0d2c\u0d4d\u200c\u0d26\u0d02 MP3 \u0d06\u0d2f\u0d3f \u0d21\u0d57\u0d7a\u0d32\u0d4b\u0d21\u0d4d \u0d1a\u0d46\u0d2f\u0d4d\u0d2f\u0d41\u0d15",
        incorrect_try_again: "\u0d24\u0d46\u0d31\u0d4d\u0d31\u0d3e\u0d23\u0d4d. \u0d35\u0d40\u0d23\u0d4d\u0d1f\u0d41\u0d02 \u0d36\u0d4d\u0d30\u0d2e\u0d3f\u0d15\u0d4d\u0d15\u0d41\u0d15.",
        image_alt_text: "reCAPTCHA \u0d1a\u0d32\u0d1e\u0d4d\u0d1a\u0d4d \u0d07\u0d2e\u0d47\u0d1c\u0d4d"
    },
    RecaptchaStr_mr = {
        visual_challenge: "\u0926\u0943\u0936\u094d\u200d\u092f\u092e\u093e\u0928 \u0906\u0935\u094d\u0939\u093e\u0928 \u092a\u094d\u0930\u093e\u092a\u094d\u0924 \u0915\u0930\u093e",
        audio_challenge: "\u0911\u0921\u0940\u0913 \u0906\u0935\u094d\u0939\u093e\u0928 \u092a\u094d\u0930\u093e\u092a\u094d\u0924 \u0915\u0930\u093e",
        refresh_btn: "\u090f\u0915 \u0928\u0935\u0940\u0928 \u0906\u0935\u094d\u0939\u093e\u0928 \u092a\u094d\u0930\u093e\u092a\u094d\u0924 \u0915\u0930\u093e",
        instructions_visual: "\u0926\u094b\u0928 \u0936\u092c\u094d\u0926 \u091f\u093e\u0907\u092a \u0915\u0930\u093e:",
        instructions_context: "\u092c\u0949\u0915\u094d\u200d\u0938\u0947\u0938\u092e\u0927\u0940\u0932 \u0936\u092c\u094d\u200d\u0926 \u091f\u093e\u0907\u092a \u0915\u0930\u093e:",
        instructions_audio: "\u0906\u092a\u0932\u094d\u092f\u093e\u0932\u093e \u091c\u0947 \u0910\u0915\u0942 \u092f\u0947\u0908\u0932 \u0924\u0947 \u091f\u093e\u0907\u092a \u0915\u0930\u093e:",
        help_btn: "\u092e\u0926\u0924",
        play_again: "\u0927\u094d\u200d\u0935\u0928\u0940 \u092a\u0941\u0928\u094d\u0939\u093e \u092a\u094d\u200d\u0932\u0947 \u0915\u0930\u093e",
        cant_hear_this: "MP3 \u0930\u0941\u092a\u093e\u0924 \u0927\u094d\u200d\u0935\u0928\u0940 \u0921\u093e\u0909\u0928\u0932\u094b\u0921 \u0915\u0930\u093e",
        incorrect_try_again: "\u0905\u092f\u094b\u0917\u094d\u200d\u092f. \u092a\u0941\u0928\u094d\u200d\u0939\u093e \u092a\u094d\u0930\u092f\u0924\u094d\u200d\u0928 \u0915\u0930\u093e.",
        image_alt_text: "reCAPTCHA \u0906\u0935\u094d\u200d\u0939\u093e\u0928 \u092a\u094d\u0930\u0924\u093f\u092e\u093e"
    },
    RecaptchaStr_ms = {
        visual_challenge: "Dapatkan cabaran visual",
        audio_challenge: "Dapatkan cabaran audio",
        refresh_btn: "Dapatkan cabaran baru",
        instructions_visual: "Taip kedua-dua perkataan:",
        instructions_context: "Taip perkataan dalam kotak:",
        instructions_audio: "Taip apa yang didengari:",
        help_btn: "Bantuan",
        play_again: "Mainkan bunyi sekali lagi",
        cant_hear_this: "Muat turun bunyi sebagai MP3",
        incorrect_try_again: "Tidak betul. Cuba lagi.",
        image_alt_text: "Imej cabaran reCAPTCHA"
    },
    RecaptchaStr_nl = {
        visual_challenge: "Een visuele uitdaging proberen",
        audio_challenge: "Een audio-uitdaging proberen",
        refresh_btn: "Een nieuwe uitdaging proberen",
        instructions_visual: "Typ de twee woorden:",
        instructions_context: "Typ de woorden in de vakken:",
        instructions_audio: "Typ wat u hoort:",
        help_btn: "Help",
        play_again: "Geluid opnieuw afspelen",
        cant_hear_this: "Geluid downloaden als MP3",
        incorrect_try_again: "Onjuist. Probeer het opnieuw.",
        image_alt_text: "reCAPTCHA-uitdagingsafbeelding"
    },
    RecaptchaStr_no = {
        visual_challenge: "F\u00e5 en bildeutfordring",
        audio_challenge: "F\u00e5 en lydutfordring",
        refresh_btn: "F\u00e5 en ny utfordring",
        instructions_visual: "Skriv inn de to ordene:",
        instructions_context: "Skriv inn ordene i feltene:",
        instructions_audio: "Skriv inn det du h\u00f8rer:",
        help_btn: "Hjelp",
        play_again: "Spill av lyd p\u00e5 nytt",
        cant_hear_this: "Last ned lyd som MP3",
        incorrect_try_again: "Feil. Pr\u00f8v p\u00e5 nytt.",
        image_alt_text: "reCAPTCHA-utfordringsbilde"
    },
    RecaptchaStr_pl = {
        visual_challenge: "Poka\u017c podpowied\u017a wizualn\u0105",
        audio_challenge: "Odtw\u00f3rz podpowied\u017a d\u017awi\u0119kow\u0105",
        refresh_btn: "Nowa podpowied\u017a",
        instructions_visual: "Wpisz oba wyrazy:",
        instructions_context: "Wpisz s\u0142owa wy\u015bwietlane w polach:",
        instructions_audio: "Wpisz us\u0142yszane s\u0142owa:",
        help_btn: "Pomoc",
        play_again: "Odtw\u00f3rz d\u017awi\u0119k ponownie",
        cant_hear_this: "Pobierz d\u017awi\u0119k jako plik MP3",
        incorrect_try_again: "Nieprawid\u0142owo. Spr\u00f3buj ponownie.",
        image_alt_text: "Zadanie obrazkowe reCAPTCHA"
    },
    RecaptchaStr_pt = {
        visual_challenge: "Obter um desafio visual",
        audio_challenge: "Obter um desafio de \u00e1udio",
        refresh_btn: "Obter um novo desafio",
        instructions_visual: "Digite as duas palavras:",
        instructions_context: "Digite as palavras das caixas:",
        instructions_audio: "Digite o que voc\u00ea ouve:",
        help_btn: "Ajuda",
        play_again: "Reproduzir som novamente",
        cant_hear_this: "Fazer download do som no formato MP3",
        incorrect_try_again: "Incorreto. Tente novamente.",
        image_alt_text: "Imagem de desafio reCAPTCHA"
    },
    RecaptchaStr_pt_pt = {
        visual_challenge: "Obter um desafio visual",
        audio_challenge: "Obter um desafio de \u00e1udio",
        refresh_btn: "Obter um novo desafio",
        instructions_visual: "Escreva as duas palavras:",
        instructions_context: "Escreva as palavras nas caixas:",
        instructions_audio: "Escreva o que ouvir:",
        help_btn: "Ajuda",
        play_again: "Reproduzir som novamente",
        cant_hear_this: "Transferir som como MP3",
        incorrect_try_again: "Incorreto. Tente novamente.",
        image_alt_text: "Imagem de desafio reCAPTCHA"
    },
    RecaptchaStr_ro = {
        visual_challenge: "Ob\u0163ine\u0163i un cod captcha vizual",
        audio_challenge: "Ob\u0163ine\u0163i un cod captcha audio",
        refresh_btn: "Ob\u0163ine\u0163i un nou cod captcha",
        instructions_visual: "Introduce\u0163i cele dou\u0103 cuvinte:",
        instructions_context: "Introduce\u0163i cuvintele \u00een casete:",
        instructions_audio: "Introduce\u0163i ceea ce auzi\u0163i:",
        help_btn: "Ajutor",
        play_again: "Reda\u0163i sunetul din nou",
        cant_hear_this: "Desc\u0103rca\u0163i fi\u015fierul audio ca MP3",
        incorrect_try_again: "Incorect. \u00cencerca\u0163i din nou.",
        image_alt_text: "Imagine de verificare reCAPTCHA"
    },
    RecaptchaStr_ru = {
        visual_challenge: "\u0412\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u0430\u044f \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0430",
        audio_challenge: "\u0417\u0432\u0443\u043a\u043e\u0432\u0430\u044f \u043f\u0440\u043e\u0432\u0435\u0440\u043a\u0430",
        refresh_btn: "\u041e\u0431\u043d\u043e\u0432\u0438\u0442\u044c",
        instructions_visual: "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0442\u043e, \u0447\u0442\u043e \u0432\u0438\u0434\u0438\u0442\u0435:",
        instructions_context: "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u043b\u043e\u0432\u0430:",
        instructions_audio: "\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0442\u043e, \u0447\u0442\u043e \u0441\u043b\u044b\u0448\u0438\u0442\u0435:",
        help_btn: "\u0421\u043f\u0440\u0430\u0432\u043a\u0430",
        play_again: "\u041f\u0440\u043e\u0441\u043b\u0443\u0448\u0430\u0442\u044c \u0435\u0449\u0435 \u0440\u0430\u0437",
        cant_hear_this: "\u0417\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c MP3-\u0444\u0430\u0439\u043b",
        incorrect_try_again: "\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e. \u041f\u043e\u0432\u0442\u043e\u0440\u0438\u0442\u0435 \u043f\u043e\u043f\u044b\u0442\u043a\u0443.",
        image_alt_text: "\u041f\u0440\u043e\u0432\u0435\u0440\u043a\u0430 \u043f\u043e \u0441\u043b\u043e\u0432\u0443 reCAPTCHA"
    },
    RecaptchaStr_sk = {
        visual_challenge: "Zobrazi\u0165 vizu\u00e1lnu podobu",
        audio_challenge: "Prehra\u0165 zvukov\u00fa podobu",
        refresh_btn: "Zobrazi\u0165 nov\u00fd v\u00fdraz",
        instructions_visual: "Zadajte tieto dve slov\u00e1:",
        instructions_context: "Zadajte slov\u00e1 v poliach:",
        instructions_audio: "Zadajte, \u010do po\u010dujete:",
        help_btn: "Pomocn\u00edk",
        play_again: "Znova prehra\u0165 zvuk",
        cant_hear_this: "Prevzia\u0165 zvuk v podobe s\u00faboru MP3",
        incorrect_try_again: "Nespr\u00e1vne. Sk\u00faste to znova.",
        image_alt_text: "Obr\u00e1zok zadania reCAPTCHA"
    },
    RecaptchaStr_sl = {
        visual_challenge: "Vizualni preskus",
        audio_challenge: "Zvo\u010dni preskus",
        refresh_btn: "Nov preskus",
        instructions_visual: "Vnesite besedi:",
        instructions_context: "Vnesite besede v okvir\u010dkih:",
        instructions_audio: "Natipkajte, kaj sli\u0161ite:",
        help_btn: "Pomo\u010d",
        play_again: "Znova predvajaj zvok",
        cant_hear_this: "Prenesi zvok kot MP3",
        incorrect_try_again: "Napa\u010dno. Poskusite znova.",
        image_alt_text: "Slika izziva reCAPTCHA"
    },
    RecaptchaStr_sr = {
        visual_challenge: "\u041f\u0440\u0438\u043c\u0438\u0442\u0435 \u0432\u0438\u0437\u0443\u0435\u043b\u043d\u0438 \u0443\u043f\u0438\u0442",
        audio_challenge: "\u041f\u0440\u0438\u043c\u0438\u0442\u0435 \u0430\u0443\u0434\u0438\u043e \u0443\u043f\u0438\u0442",
        refresh_btn: "\u041f\u0440\u0438\u043c\u0438\u0442\u0435 \u043d\u043e\u0432\u0438 \u0443\u043f\u0438\u0442",
        instructions_visual: "\u041e\u0442\u043a\u0443\u0446\u0430\u0458\u0442\u0435 \u0434\u0432\u0435 \u0440\u0435\u0447\u0438:",
        instructions_context: "\u0423\u043a\u0443\u0446\u0430\u0458\u0442\u0435 \u0440\u0435\u0447\u0438 \u0443 \u043f\u043e\u0459\u0430:",
        instructions_audio: "\u041e\u0442\u043a\u0443\u0446\u0430\u0458\u0442\u0435 \u043e\u043d\u043e \u0448\u0442\u043e \u0447\u0443\u0458\u0435\u0442\u0435:",
        help_btn: "\u041f\u043e\u043c\u043e\u045b",
        play_again: "\u041f\u043e\u043d\u043e\u0432\u043e \u043f\u0443\u0441\u0442\u0438 \u0437\u0432\u0443\u043a",
        cant_hear_this: "\u041f\u0440\u0435\u0443\u0437\u043c\u0438 \u0437\u0432\u0443\u043a \u043a\u0430\u043e MP3 \u0441\u043d\u0438\u043c\u0430\u043a",
        incorrect_try_again: "\u041d\u0435\u0442\u0430\u0447\u043d\u043e. \u041f\u043e\u043a\u0443\u0448\u0430\u0458\u0442\u0435 \u043f\u043e\u043d\u043e\u0432\u043e.",
        image_alt_text: "\u0421\u043b\u0438\u043a\u0430 reCAPTCHA \u043f\u0440\u043e\u0432\u0435\u0440\u0435"
    },
    RecaptchaStr_sv = {
        visual_challenge: "H\u00e4mta captcha i bildformat",
        audio_challenge: "H\u00e4mta captcha i ljudformat",
        refresh_btn: "H\u00e4mta ny captcha",
        instructions_visual: "Skriv b\u00e5da orden:",
        instructions_context: "Skriv orden i rutorna:",
        instructions_audio: "Skriv det du h\u00f6r:",
        help_btn: "Hj\u00e4lp",
        play_again: "Spela upp ljudet igen",
        cant_hear_this: "H\u00e4mta ljud som MP3",
        incorrect_try_again: "Fel. F\u00f6rs\u00f6k igen.",
        image_alt_text: "reCAPTCHA-bild"
    },
    RecaptchaStr_sw = {
        visual_challenge: "Pata changamoto ya kuona",
        audio_challenge: "Pata changamoto ya sauti",
        refresh_btn: "Pata changamoto mpya",
        instructions_visual: "Charaza maneno mawili:",
        instructions_context: "Charaza maneno katika masanduku:",
        instructions_audio: "Charaza unachosikia:",
        help_btn: "Msaada",
        play_again: "Cheza sauti tena",
        cant_hear_this: "Pakua sauti kama MP3",
        incorrect_try_again: "Sio sahihi. Jaribu tena.",
        image_alt_text: "picha ya changamoto ya reCAPTCHA"
    },
    RecaptchaStr_ta = {
        visual_challenge: "\u0baa\u0bbe\u0bb0\u0bcd\u0bb5\u0bc8 \u0b9a\u0bc7\u0bb2\u0b9e\u0bcd\u0b9a\u0bc8\u0baa\u0bcd \u0baa\u0bc6\u0bb1\u0bc1\u0b95",
        audio_challenge: "\u0b86\u0b9f\u0bbf\u0baf\u0bcb \u0b9a\u0bc7\u0bb2\u0b9e\u0bcd\u0b9a\u0bc8\u0baa\u0bcd \u0baa\u0bc6\u0bb1\u0bc1\u0b95",
        refresh_btn: "\u0baa\u0bc1\u0ba4\u0bbf\u0baf \u0b9a\u0bc7\u0bb2\u0b9e\u0bcd\u0b9a\u0bc8\u0baa\u0bcd \u0baa\u0bc6\u0bb1\u0bc1\u0b95",
        instructions_visual: "\u0b9a\u0bca\u0bb1\u0bcd\u0b95\u0bb3\u0bc8 \u0b9f\u0bc8\u0baa\u0bcd \u0b9a\u0bc6\u0baf\u0bcd\u0b95:",
        instructions_context: "\u0baa\u0bc6\u0b9f\u0bcd\u0b9f\u0bbf\u0baf\u0bbf\u0bb2\u0bcd \u0b89\u0bb3\u0bcd\u0bb3 \u0b9a\u0bca\u0bb1\u0bcd\u0b95\u0bb3\u0bc8 \u0b89\u0bb3\u0bcd\u0bb3\u0bbf\u0b9f\u0bc1\u0b95:",
        instructions_audio: "\u0b95\u0bc7\u0b9f\u0bcd\u0baa\u0ba4\u0bc8 \u0b9f\u0bc8\u0baa\u0bcd \u0b9a\u0bc6\u0baf\u0bcd\u0b95:",
        help_btn: "\u0b89\u0ba4\u0bb5\u0bbf",
        play_again: "\u0b92\u0bb2\u0bbf\u0baf\u0bc8 \u0bae\u0bc0\u0ba3\u0bcd\u0b9f\u0bc1\u0bae\u0bcd \u0b87\u0baf\u0b95\u0bcd\u0b95\u0bc1",
        cant_hear_this: "\u0b92\u0bb2\u0bbf\u0baf\u0bc8 MP3 \u0b86\u0b95 \u0baa\u0ba4\u0bbf\u0bb5\u0bbf\u0bb1\u0b95\u0bcd\u0b95\u0bc1\u0b95",
        incorrect_try_again: "\u0ba4\u0bb5\u0bb1\u0bbe\u0ba9\u0ba4\u0bc1. \u0bae\u0bc0\u0ba3\u0bcd\u0b9f\u0bc1\u0bae\u0bcd \u0bae\u0bc1\u0baf\u0bb2\u0bb5\u0bc1\u0bae\u0bcd.",
        image_alt_text: "reCAPTCHA \u0b9a\u0bc7\u0bb2\u0b9e\u0bcd\u0b9a\u0bcd \u0baa\u0b9f\u0bae\u0bcd"
    },
    RecaptchaStr_te = {
        visual_challenge: "\u0c12\u0c15 \u0c26\u0c43\u0c36\u0c4d\u0c2f\u0c2e\u0c3e\u0c28 \u0c38\u0c35\u0c3e\u0c32\u0c41\u0c28\u0c41 \u0c38\u0c4d\u0c35\u0c40\u0c15\u0c30\u0c3f\u0c02\u0c1a\u0c02\u0c21\u0c3f",
        audio_challenge: "\u0c12\u0c15 \u0c06\u0c21\u0c3f\u0c2f\u0c4b \u0c38\u0c35\u0c3e\u0c32\u0c41\u0c28\u0c41 \u0c38\u0c4d\u0c35\u0c40\u0c15\u0c30\u0c3f\u0c02\u0c1a\u0c02\u0c21\u0c3f",
        refresh_btn: "\u0c15\u0c4d\u0c30\u0c4a\u0c24\u0c4d\u0c24 \u0c38\u0c35\u0c3e\u0c32\u0c41\u0c28\u0c41 \u0c38\u0c4d\u0c35\u0c40\u0c15\u0c30\u0c3f\u0c02\u0c1a\u0c02\u0c21\u0c3f",
        instructions_visual: "\u0c30\u0c46\u0c02\u0c21\u0c41 \u0c2a\u0c26\u0c3e\u0c32\u0c28\u0c41 \u0c1f\u0c48\u0c2a\u0c4d \u0c1a\u0c47\u0c2f\u0c02\u0c21\u0c3f:",
        instructions_context: "\u0c2a\u0c26\u0c3e\u0c32\u0c28\u0c41 \u0c2a\u0c46\u0c1f\u0c4d\u0c1f\u0c46\u0c32\u0c4d\u0c32\u0c4b \u0c1f\u0c48\u0c2a\u0c4d \u0c1a\u0c47\u0c2f\u0c02\u0c21\u0c3f:",
        instructions_audio: "\u0c2e\u0c40\u0c30\u0c41 \u0c35\u0c3f\u0c28\u0c4d\u0c28\u0c26\u0c3f \u0c1f\u0c48\u0c2a\u0c4d \u0c1a\u0c47\u0c2f\u0c02\u0c21\u0c3f:",
        help_btn: "\u0c38\u0c39\u0c3e\u0c2f\u0c02",
        play_again: "\u0c27\u0c4d\u0c35\u0c28\u0c3f\u0c28\u0c3f \u0c2e\u0c33\u0c4d\u0c32\u0c40 \u0c2a\u0c4d\u0c32\u0c47 \u0c1a\u0c47\u0c2f\u0c3f",
        cant_hear_this: "\u0c27\u0c4d\u0c35\u0c28\u0c3f\u0c28\u0c3f MP3 \u0c35\u0c32\u0c46 \u0c21\u0c4c\u0c28\u0c4d\u200c\u0c32\u0c4b\u0c21\u0c4d \u0c1a\u0c47\u0c2f\u0c3f",
        incorrect_try_again: "\u0c24\u0c2a\u0c4d\u0c2a\u0c41. \u0c2e\u0c33\u0c4d\u0c32\u0c40 \u0c2a\u0c4d\u0c30\u0c2f\u0c24\u0c4d\u0c28\u0c3f\u0c02\u0c1a\u0c02\u0c21\u0c3f.",
        image_alt_text: "reCAPTCHA \u0c38\u0c35\u0c3e\u0c32\u0c41 \u0c1a\u0c3f\u0c24\u0c4d\u0c30\u0c02"
    },
    RecaptchaStr_th = {
        visual_challenge: "\u0e23\u0e31\u0e1a\u0e04\u0e27\u0e32\u0e21\u0e17\u0e49\u0e32\u0e17\u0e32\u0e22\u0e14\u0e49\u0e32\u0e19\u0e20\u0e32\u0e1e",
        audio_challenge: "\u0e23\u0e31\u0e1a\u0e04\u0e27\u0e32\u0e21\u0e17\u0e49\u0e32\u0e17\u0e32\u0e22\u0e14\u0e49\u0e32\u0e19\u0e40\u0e2a\u0e35\u0e22\u0e07",
        refresh_btn: "\u0e23\u0e31\u0e1a\u0e04\u0e27\u0e32\u0e21\u0e17\u0e49\u0e32\u0e17\u0e32\u0e22\u0e43\u0e2b\u0e21\u0e48",
        instructions_visual: "\u0e1e\u0e34\u0e21\u0e1e\u0e4c\u0e04\u0e33\u0e2a\u0e2d\u0e07\u0e04\u0e33\u0e19\u0e31\u0e49\u0e19:",
        instructions_context: "\u0e1e\u0e34\u0e21\u0e1e\u0e4c\u0e04\u0e33\u0e19\u0e31\u0e49\u0e19\u0e43\u0e19\u0e0a\u0e48\u0e2d\u0e07\u0e19\u0e35\u0e49:",
        instructions_audio: "\u0e1e\u0e34\u0e21\u0e1e\u0e4c\u0e2a\u0e34\u0e48\u0e07\u0e17\u0e35\u0e48\u0e04\u0e38\u0e13\u0e44\u0e14\u0e49\u0e22\u0e34\u0e19:",
        help_btn: "\u0e04\u0e27\u0e32\u0e21\u0e0a\u0e48\u0e27\u0e22\u0e40\u0e2b\u0e25\u0e37\u0e2d",
        play_again: "\u0e40\u0e25\u0e48\u0e19\u0e40\u0e2a\u0e35\u0e22\u0e07\u0e2d\u0e35\u0e01\u0e04\u0e23\u0e31\u0e49\u0e07",
        cant_hear_this: "\u0e14\u0e32\u0e27\u0e42\u0e2b\u0e25\u0e14\u0e40\u0e2a\u0e35\u0e22\u0e07\u0e40\u0e1b\u0e47\u0e19 MP3",
        incorrect_try_again: "\u0e44\u0e21\u0e48\u0e16\u0e39\u0e01\u0e15\u0e49\u0e2d\u0e07 \u0e25\u0e2d\u0e07\u0e2d\u0e35\u0e01\u0e04\u0e23\u0e31\u0e49\u0e07",
        image_alt_text: "\u0e23\u0e2b\u0e31\u0e2a\u0e20\u0e32\u0e1e reCAPTCHA"
    },
    RecaptchaStr_tr = {
        visual_challenge: "G\u00f6rsel sorgu al",
        audio_challenge: "Sesli sorgu al",
        refresh_btn: "Yeniden y\u00fckle",
        instructions_visual: "\u0130ki kelimeyi yaz\u0131n:",
        instructions_context: "Kutudaki kelimeleri yaz\u0131n:",
        instructions_audio: "Duydu\u011funuzu yaz\u0131n:",
        help_btn: "Yard\u0131m",
        play_again: "Sesi tekrar \u00e7al",
        cant_hear_this: "Sesi MP3 olarak indir",
        incorrect_try_again: "Yanl\u0131\u015f. Tekrar deneyin.",
        image_alt_text: "reCAPTCHA sorusu resmi"
    },
    RecaptchaStr_uk = {
        visual_challenge: "\u041e\u0442\u0440\u0438\u043c\u0430\u0442\u0438 \u0432\u0456\u0437\u0443\u0430\u043b\u044c\u043d\u0438\u0439 \u0442\u0435\u043a\u0441\u0442",
        audio_challenge: "\u041e\u0442\u0440\u0438\u043c\u0430\u0442\u0438 \u0430\u0443\u0434\u0456\u043e\u0437\u0430\u043f\u0438\u0441",
        refresh_btn: "\u041e\u043d\u043e\u0432\u0438\u0442\u0438 \u0442\u0435\u043a\u0441\u0442",
        instructions_visual: "\u0412\u0432\u0435\u0434\u0456\u0442\u044c \u0434\u0432\u0430 \u0441\u043b\u043e\u0432\u0430:",
        instructions_context: "\u0412\u0432\u0435\u0434\u0456\u0442\u044c \u0441\u043b\u043e\u0432\u0430 \u0432 \u043f\u043e\u043b\u044f:",
        instructions_audio: "\u0412\u0432\u0435\u0434\u0456\u0442\u044c \u043f\u043e\u0447\u0443\u0442\u0435:",
        help_btn: "\u0414\u043e\u0432\u0456\u0434\u043a\u0430",
        play_again: "\u0412\u0456\u0434\u0442\u0432\u043e\u0440\u0438\u0442\u0438 \u0437\u0430\u043f\u0438\u0441 \u0449\u0435 \u0440\u0430\u0437",
        cant_hear_this: "\u0417\u0430\u0432\u0430\u043d\u0442\u0430\u0436\u0438\u0442\u0438 \u0437\u0430\u043f\u0438\u0441 \u044f\u043a MP3",
        incorrect_try_again: "\u041d\u0435\u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u043e. \u0421\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435 \u0449\u0435 \u0440\u0430\u0437.",
        image_alt_text: "\u0417\u043e\u0431\u0440\u0430\u0436\u0435\u043d\u043d\u044f \u0437\u0430\u0432\u0434\u0430\u043d\u043d\u044f reCAPTCHA"
    },
    RecaptchaStr_ur = {
        visual_challenge: "\u0627\u06cc\u06a9 \u0645\u0631\u0626\u06cc \u0686\u06cc\u0644\u0646\u062c \u062d\u0627\u0635\u0644 \u06a9\u0631\u06cc\u06ba",
        audio_challenge: "\u0627\u06cc\u06a9 \u0622\u0688\u06cc\u0648 \u0686\u06cc\u0644\u0646\u062c \u062d\u0627\u0635\u0644 \u06a9\u0631\u06cc\u06ba",
        refresh_btn: "\u0627\u06cc\u06a9 \u0646\u06cc\u0627 \u0686\u06cc\u0644\u0646\u062c \u062d\u0627\u0635\u0644 \u06a9\u0631\u06cc\u06ba",
        instructions_visual: "\u062f\u0648 \u0627\u0644\u0641\u0627\u0638 \u0679\u0627\u0626\u067e \u06a9\u0631\u06cc\u06ba:",
        instructions_context: "\u0627\u0644\u0641\u0627\u0638 \u06a9\u0648 \u062e\u0627\u0646\u0648\u06ba \u0645\u06cc\u06ba \u0679\u0627\u0626\u067e \u06a9\u0631\u06cc\u06ba:",
        instructions_audio: "\u0622\u067e \u06a9\u0648 \u062c\u0648 \u0633\u0646\u0627\u0626\u06cc \u062f\u06cc\u062a\u0627 \u06c1\u06d2 \u0627\u0633\u06d2 \u0679\u0627\u0626\u067e \u06a9\u0631\u06cc\u06ba:",
        help_btn: "\u0645\u062f\u062f",
        play_again: "\u0622\u0648\u0627\u0632 \u062f\u0648\u0628\u0627\u0631\u06c1 \u0686\u0644\u0627\u0626\u06cc\u06ba",
        cant_hear_this: "\u0622\u0648\u0627\u0632 \u06a9\u0648 MP3 \u06a9\u06d2 \u0628\u0637\u0648\u0631 \u0688\u0627\u0624\u0646 \u0644\u0648\u0688 \u06a9\u0631\u06cc\u06ba",
        incorrect_try_again: "\u063a\u0644\u0637\u06d4 \u062f\u0648\u0628\u0627\u0631\u06c1 \u06a9\u0648\u0634\u0634 \u06a9\u0631\u06cc\u06ba\u06d4",
        image_alt_text: "reCAPTCHA \u0686\u06cc\u0644\u0646\u062c \u0648\u0627\u0644\u06cc \u0634\u0628\u06cc\u06c1"
    },
    RecaptchaStr_vi = {
        visual_challenge: "Nh\u1eadn th\u1eed th\u00e1ch h\u00ecnh \u1ea3nh",
        audio_challenge: "Nh\u1eadn th\u1eed th\u00e1ch \u00e2m thanh",
        refresh_btn: "Nh\u1eadn th\u1eed th\u00e1ch m\u1edbi",
        instructions_visual: "Nh\u1eadp hai t\u1eeb:",
        instructions_context: "Nh\u1eadp c\u00e1c t\u1eeb trong c\u00e1c \u00f4:",
        instructions_audio: "Nh\u1eadp n\u1ed9i dung b\u1ea1n nghe th\u1ea5y:",
        help_btn: "Tr\u1ee3 gi\u00fap",
        play_again: "Ph\u00e1t l\u1ea1i \u00e2m thanh",
        cant_hear_this: "T\u1ea3i \u00e2m thanh xu\u1ed1ng d\u01b0\u1edbi d\u1ea1ng MP3",
        incorrect_try_again: "Kh\u00f4ng ch\u00ednh x\u00e1c. H\u00e3y th\u1eed l\u1ea1i.",
        image_alt_text: "H\u00ecnh x\u00e1c th\u1ef1c reCAPTCHA"
    },
    RecaptchaStr_zh_cn = {
        visual_challenge: "\u6536\u5230\u4e00\u4e2a\u89c6\u9891\u9080\u8bf7",
        audio_challenge: "\u6362\u4e00\u7ec4\u97f3\u9891\u9a8c\u8bc1\u7801",
        refresh_btn: "\u6362\u4e00\u7ec4\u9a8c\u8bc1\u7801",
        instructions_visual: "\u8bf7\u952e\u5165\u8fd9\u4e24\u4e2a\u8bcd\uff1a",
        instructions_context: "\u952e\u5165\u6846\u4e2d\u663e\u793a\u7684\u5b57\u8bcd\uff1a",
        instructions_audio: "\u8bf7\u952e\u5165\u60a8\u542c\u5230\u7684\u5185\u5bb9\uff1a",
        help_btn: "\u5e2e\u52a9",
        play_again: "\u91cd\u65b0\u64ad\u653e",
        cant_hear_this: "\u4ee5 MP3 \u683c\u5f0f\u4e0b\u8f7d\u58f0\u97f3",
        incorrect_try_again: "\u4e0d\u6b63\u786e\uff0c\u8bf7\u91cd\u8bd5\u3002",
        image_alt_text: "reCAPTCHA \u9a8c\u8bc1\u56fe\u7247"
    },
    RecaptchaStr_zh_hk = {
        visual_challenge: "\u56de\u7b54\u5716\u50cf\u9a57\u8b49\u554f\u984c",
        audio_challenge: "\u53d6\u5f97\u8a9e\u97f3\u9a57\u8b49\u554f\u984c",
        refresh_btn: "\u63db\u4e00\u500b\u9a57\u8b49\u554f\u984c",
        instructions_visual: "\u8acb\u8f38\u5165\u9019\u5169\u500b\u5b57\uff1a",
        instructions_context: "\u5728\u6846\u5167\u8f38\u5165\u5b57\u8a5e\uff1a",
        instructions_audio: "\u9375\u5165\u60a8\u6240\u807d\u5230\u7684\uff1a",
        help_btn: "\u8aaa\u660e",
        play_again: "\u518d\u6b21\u64ad\u653e\u8072\u97f3",
        cant_hear_this: "\u5c07\u8072\u97f3\u4e0b\u8f09\u70ba MP3",
        incorrect_try_again: "\u4e0d\u6b63\u78ba\uff0c\u518d\u8a66\u4e00\u6b21\u3002",
        image_alt_text: "reCAPTCHA \u9a57\u8b49\u6587\u5b57\u5716\u7247"
    },
    RecaptchaStr_zh_tw = {
        visual_challenge: "\u53d6\u5f97\u5716\u7247\u9a57\u8b49\u554f\u984c",
        audio_challenge: "\u53d6\u5f97\u8a9e\u97f3\u9a57\u8b49\u554f\u984c",
        refresh_btn: "\u53d6\u5f97\u65b0\u7684\u9a57\u8b49\u554f\u984c",
        instructions_visual: "\u8acb\u8f38\u5165\u4e0b\u5716\u4e2d\u7684\u5169\u500b\u5b57\uff1a",
        instructions_context: "\u8acb\u8f38\u5165\u65b9\u584a\u4e2d\u7684\u6587\u5b57\uff1a",
        instructions_audio: "\u8acb\u8f38\u5165\u8a9e\u97f3\u5167\u5bb9\uff1a",
        help_btn: "\u8aaa\u660e",
        play_again: "\u518d\u6b21\u64ad\u653e",
        cant_hear_this: "\u4ee5 MP3 \u683c\u5f0f\u4e0b\u8f09\u8072\u97f3",
        incorrect_try_again: "\u9a57\u8b49\u78bc\u6709\u8aa4\uff0c\u8acb\u518d\u8a66\u4e00\u6b21\u3002",
        image_alt_text: "reCAPTCHA \u9a57\u8b49\u6587\u5b57\u5716\u7247"
    },
    RecaptchaStr_zu = {
        visual_challenge: "Thola inselelo ebonakalayo",
        audio_challenge: "Thola inselelo yokulalelwayo",
        refresh_btn: "Thola inselelo entsha",
        instructions_visual: "Bhala lawa magama amabili:",
        instructions_context: "Bhala amagama asemabhokisini:",
        instructions_audio: "Bhala okuzwayo:",
        help_btn: "Usizo",
        play_again: "Phinda udlale okulalelwayo futhi",
        cant_hear_this: "Layisha umsindo njenge-MP3",
        incorrect_try_again: "Akulungile. Zama futhi.",
        image_alt_text: "umfanekiso oyinselelo we-reCAPTCHA"
    },
    RecaptchaLangMap = {
        en: RecaptchaStr_en,
        af: RecaptchaStr_af,
        am: RecaptchaStr_am,
        ar: RecaptchaStr_ar,
        "ar-EG": RecaptchaStr_ar,
        bg: RecaptchaStr_bg,
        bn: RecaptchaStr_bn,
        ca: RecaptchaStr_ca,
        cs: RecaptchaStr_cs,
        da: RecaptchaStr_da,
        de: RecaptchaStr_de,
        el: RecaptchaStr_el,
        "en-GB": RecaptchaStr_en,
        "en-US": RecaptchaStr_en,
        es: RecaptchaStr_es,
        "es-419": RecaptchaStr_es_419,
        "es-ES": RecaptchaStr_es,
        et: RecaptchaStr_et,
        eu: RecaptchaStr_eu,
        fa: RecaptchaStr_fa,
        fi: RecaptchaStr_fi,
        fil: RecaptchaStr_fil,
        fr: RecaptchaStr_fr,
        "fr-CA": RecaptchaStr_fr_ca,
        "fr-FR": RecaptchaStr_fr,
        gl: RecaptchaStr_gl,
        gu: RecaptchaStr_gu,
        hi: RecaptchaStr_hi,
        hr: RecaptchaStr_hr,
        hu: RecaptchaStr_hu,
        hy: RecaptchaStr_hy,
        id: RecaptchaStr_id,
        is: RecaptchaStr_is,
        it: RecaptchaStr_it,
        iw: RecaptchaStr_iw,
        ja: RecaptchaStr_ja,
        kn: RecaptchaStr_kn,
        ko: RecaptchaStr_ko,
        ln: RecaptchaStr_fr,
        lt: RecaptchaStr_lt,
        lv: RecaptchaStr_lv,
        ml: RecaptchaStr_ml,
        mr: RecaptchaStr_mr,
        ms: RecaptchaStr_ms,
        nl: RecaptchaStr_nl,
        no: RecaptchaStr_no,
        pl: RecaptchaStr_pl,
        pt: RecaptchaStr_pt,
        "pt-BR": RecaptchaStr_pt,
        "pt-PT": RecaptchaStr_pt_pt,
        ro: RecaptchaStr_ro,
        ru: RecaptchaStr_ru,
        sk: RecaptchaStr_sk,
        sl: RecaptchaStr_sl,
        sr: RecaptchaStr_sr,
        sv: RecaptchaStr_sv,
        sw: RecaptchaStr_sw,
        ta: RecaptchaStr_ta,
        te: RecaptchaStr_te,
        th: RecaptchaStr_th,
        tr: RecaptchaStr_tr,
        uk: RecaptchaStr_uk,
        ur: RecaptchaStr_ur,
        vi: RecaptchaStr_vi,
        "zh-CN": RecaptchaStr_zh_cn,
        "zh-HK": RecaptchaStr_zh_hk,
        "zh-TW": RecaptchaStr_zh_tw,
        zu: RecaptchaStr_zu,
        tl: RecaptchaStr_fil,
        he: RecaptchaStr_iw,
        "in": RecaptchaStr_id,
        mo: RecaptchaStr_ro,
        zh: RecaptchaStr_zh_cn
    };
var RecaptchaStr = RecaptchaStr_en,
    RecaptchaOptions, RecaptchaDefaultOptions = {
        tabindex: 0,
        theme: "red",
        callback: null,
        lang: null,
        custom_theme_widget: null,
        custom_translations: null,
        includeContext: !1
    },
    Recaptcha = {
        widget: null,
        timer_id: -1,
        style_set: !1,
        theme: null,
        type: "image",
        ajax_verify_cb: null,
        $: function (a) {
            return "string" == typeof a ? document.getElementById(a) : a
        },
        create: function (a, b, c) {
            Recaptcha.destroy();
            b && (Recaptcha.widget = Recaptcha.$(b));
            Recaptcha._init_options(c);
            Recaptcha._call_challenge(a)
        },
        destroy: function () {
            var a = Recaptcha.$("recaptcha_challenge_field");
            a && a.parentNode.removeChild(a); - 1 != Recaptcha.timer_id && clearInterval(Recaptcha.timer_id);
            Recaptcha.timer_id = -1;
            if (a = Recaptcha.$("recaptcha_image")) a.innerHTML = "";
            Recaptcha.widget && ("custom" != Recaptcha.theme ? Recaptcha.widget.innerHTML = "" : Recaptcha.widget.style.display = "none", Recaptcha.widget = null)
        },
        focus_response_field: function () {
            var a = Recaptcha.$("recaptcha_response_field");
            a.focus()
        },
        get_challenge: function () {
            return "undefined" == typeof RecaptchaState ? null : RecaptchaState.challenge
        },
        get_response: function () {
            var a = Recaptcha.$("recaptcha_response_field");
            return !a ? null : a.value
        },
        ajax_verify: function (a) {
            Recaptcha.ajax_verify_cb = a;
            var a = Recaptcha.get_challenge() || "",
                b = Recaptcha.get_response() || "",
                a = Recaptcha._get_api_server() + "/ajaxverify?c=" + encodeURIComponent(a) + "&response=" + encodeURIComponent(b);
            Recaptcha._add_script(a)
        },
        _ajax_verify_callback: function (a) {
            Recaptcha.ajax_verify_cb(a)
        },
        _get_api_server: function () {
            var a = window.location.protocol,
                b;
            if ("undefined" != typeof _RecaptchaOverrideApiServer) b = _RecaptchaOverrideApiServer;
            else {
                if ("undefined" != typeof RecaptchaState && "string" == typeof RecaptchaState.server && 0 < RecaptchaState.server.length) return RecaptchaState.server.replace(/\/+$/, "");
                b = "www.google.com/recaptcha/api"
            }
            return a + "//" + b
        },
        _call_challenge: function (a) {
            a = Recaptcha._get_api_server() + "/challenge?k=" + a + "&ajax=1&cachestop=" + Math.random();
            Recaptcha.getLang_() && (a += "&lang=" + Recaptcha.getLang_());
            "undefined" != typeof RecaptchaOptions.extra_challenge_params && (a += "&" + RecaptchaOptions.extra_challenge_params);
            RecaptchaOptions.includeContext && (a += "&includeContext=1");
            Recaptcha._add_script(a)
        },
        _add_script: function (a) {
            var b = document.createElement("script");
            b.type = "text/javascript";
            b.src = a;
            Recaptcha._get_script_area().appendChild(b)
        },
        _get_script_area: function () {
            var a = document.getElementsByTagName("head");
            return a = !a || 1 > a.length ? document.body : a[0]
        },
        _hash_merge: function (a) {
            for (var b = {}, c = 0; c < a.length; c++) for (var d in a[c]) b[d] = a[c][d];
            "context" == b.theme && (b.includeContext = !0);
            return b
        },
        _init_options: function (a) {
            a = a || {};
            RecaptchaOptions = Recaptcha._hash_merge([RecaptchaDefaultOptions, a])
        },
        challenge_callback: function () {
            Recaptcha._reset_timer();
            RecaptchaStr = Recaptcha._hash_merge([RecaptchaStr_en, RecaptchaLangMap[Recaptcha.getLang_()] || {},
            RecaptchaOptions.custom_translations || {}]);
            window.addEventListener && window.addEventListener("unload", function () {
                Recaptcha.destroy()
            }, !1);
            Recaptcha._is_ie() && window.attachEvent && window.attachEvent("onbeforeunload", function () {});
            if (0 < navigator.userAgent.indexOf("KHTML")) {
                var a = document.createElement("iframe");
                a.src = "about:blank";
                a.style.height = "0px";
                a.style.width = "0px";
                a.style.visibility = "hidden";
                a.style.border = "none";
                var b = document.createTextNode("This frame prevents back/forward cache problems in Safari.");
                a.appendChild(b);
                document.body.appendChild(a)
            }
            Recaptcha._finish_widget()
        },
        _add_css: function (a) {
            if (-1 != navigator.appVersion.indexOf("MSIE 5")) document.write('<style type="text/css">' + a + "</style>");
            else {
                var b = document.createElement("style");
                b.type = "text/css";
                b.styleSheet ? b.styleSheet.cssText = a : (a = document.createTextNode(a), b.appendChild(a));
                Recaptcha._get_script_area().appendChild(b)
            }
        },
        _set_style: function (a) {
            Recaptcha.style_set || (Recaptcha.style_set = !0, Recaptcha._add_css(a + "\n\n.recaptcha_is_showing_audio .recaptcha_only_if_image,.recaptcha_isnot_showing_audio .recaptcha_only_if_audio,.recaptcha_had_incorrect_sol .recaptcha_only_if_no_incorrect_sol,.recaptcha_nothad_incorrect_sol .recaptcha_only_if_incorrect_sol{display:none !important}"))
        },
        _init_builtin_theme: function () {
            var a = Recaptcha.$,
                b = Recaptcha._get_api_server(),
                c = b.length - 1;
            "/" == b[c] && (b = b.substring(0, c));
            var c = RecaptchaTemplates.VertCss,
                d = RecaptchaTemplates.VertHtml,
                e = b + "/img/" + Recaptcha.theme,
                f = "gif",
                b = Recaptcha.theme;
            "clean" == b && (c = RecaptchaTemplates.CleanCss, d = RecaptchaTemplates.CleanHtml, f = "png");
            "context" == b && (d = RecaptchaTemplates.ContextHtml);
            c = c.replace(/IMGROOT/g, e);
            Recaptcha._set_style(c);
            Recaptcha.widget.innerHTML = '<div id="recaptcha_area">' + d + "</div>";
            c = function (b, c, d, h) {
                var g = a(b + "_btn"),
                    b = a(b);
                b.src = e + "/" + c + "." + f;
                c = RecaptchaStr[d];
                b.alt = c;
                g.title = c;
                g.href = h
            };
            c("recaptcha_reload", "refresh", "refresh_btn", "javascript:Recaptcha.reload();");
            c("recaptcha_switch_audio", "audio", "audio_challenge", "javascript:Recaptcha.switch_type('audio');");
            c("recaptcha_switch_img", "text", "visual_challenge", "javascript:Recaptcha.switch_type('image');");
            c("recaptcha_whatsthis", "help", "help_btn", Recaptcha._get_help_link());
            a("recaptcha_whatsthis_btn").target = "_blank";
            a("recaptcha_whatsthis_btn").onclick = function () {
                Recaptcha.showhelp();
                return false
            };
            "clean" == b && (a("recaptcha_logo").src = e + "/logo." + f, a("recaptcha_tagline").src = e + "/tagline." + f);
            a("recaptcha_table").className = "recaptchatable recaptcha_theme_" + Recaptcha.theme;
            b = function (b, c) {
                var d = a(b);
                if (d) {
                    if (RecaptchaState.rtl && "span" == d.tagName.toLowerCase()) d.dir = "rtl";
                    d.appendChild(document.createTextNode(RecaptchaStr[c]))
                }
            };
            b("recaptcha_instructions_image", "instructions_visual");
            b("recaptcha_instructions_context", "instructions_context");
            b("recaptcha_instructions_audio", "instructions_audio");
            b("recaptcha_instructions_error", "incorrect_try_again")
        },
        _finish_widget: function () {
            var a = Recaptcha.$,
                b = RecaptchaOptions,
                c = b.theme,
                d = {
                    blackglass: 1,
                    clean: 1,
                    context: 1,
                    custom: 1,
                    red: 1,
                    white: 1
                };
            c in d || (c = "red");
            Recaptcha.theme || (Recaptcha.theme = c);
            "custom" != Recaptcha.theme ? Recaptcha._init_builtin_theme() : Recaptcha._set_style("");
            c = document.createElement("span");
            c.id = "recaptcha_challenge_field_holder";
            c.style.display = "none";
            a("recaptcha_response_field").parentNode.insertBefore(c, a("recaptcha_response_field"));
            a("recaptcha_response_field").setAttribute("autocomplete", "off");
            a("recaptcha_image").style.width = "300px";
            a("recaptcha_image").style.height = "57px";
            Recaptcha.should_focus = !1;
            Recaptcha._set_challenge(RecaptchaState.challenge, "image");
            Recaptcha.updateTabIndexes_();
            Recaptcha.widget && (Recaptcha.widget.style.display = "");
            b.callback && b.callback()
        },
        updateTabIndexes_: function () {
            var a = Recaptcha.$,
                b = RecaptchaOptions;
            if (b.tabindex && (b = b.tabindex, a("recaptcha_response_field").tabIndex = b++, "audio" == Recaptcha.type && a("recaptcha_audio_play_again") && (a("recaptcha_audio_play_again").tabIndex = b++, a("recaptcha_audio_download"), a("recaptcha_audio_download").tabIndex = b++), "custom" != Recaptcha.theme)) a("recaptcha_reload_btn").tabIndex = b++, a("recaptcha_switch_audio_btn").tabIndex = b++, a("recaptcha_switch_img_btn").tabIndex = b++, a("recaptcha_whatsthis_btn").tabIndex = b
        },
        switch_type: function (a) {
            Recaptcha.type = a;
            Recaptcha.reload("audio" == Recaptcha.type ? "a" : "v")
        },
        reload: function (a) {
            var b = RecaptchaOptions,
                c = RecaptchaState;
            "undefined" == typeof a && (a = "r");
            c = Recaptcha._get_api_server() + "/reload?c=" + c.challenge + "&k=" + c.site + "&reason=" + a + "&type=" + Recaptcha.type;
            b.includeContext && (c += "&includeContext=1");
            Recaptcha.getLang_() && (c += "&lang=" + Recaptcha.getLang_());
            "undefined" != typeof b.extra_challenge_params && (c += "&" + b.extra_challenge_params);
            "audio" == Recaptcha.type && (c = b.audio_beta_12_08 ? c + "&audio_beta_12_08=1" : c + "&new_audio_default=1");
            Recaptcha.should_focus = "t" != a;
            Recaptcha._add_script(c)
        },
        finish_reload: function (a, b) {
            RecaptchaState.is_incorrect = !1;
            Recaptcha._set_challenge(a, b);
            Recaptcha.updateTabIndexes_()
        },
        _set_challenge: function (a, b) {
            var c = Recaptcha.$,
                d = RecaptchaState;
            d.challenge = a;
            Recaptcha.type = b;
            c("recaptcha_challenge_field_holder").innerHTML = '<input type="hidden" name="recaptcha_challenge_field" id="recaptcha_challenge_field" value="' + d.challenge + '"/>';
            if ("audio" == b) c("recaptcha_image").innerHTML = Recaptcha.getAudioCaptchaHtml();
            else if ("image" == b) {
                var e = Recaptcha._get_api_server() + "/image?c=" + d.challenge;
                c("recaptcha_image").innerHTML = '<img style="display:block;" alt="' + RecaptchaStr.image_alt_text + '" height="57" width="300" src="' + e + '" />'
            }
            Recaptcha._css_toggle("recaptcha_had_incorrect_sol", "recaptcha_nothad_incorrect_sol", d.is_incorrect);
            Recaptcha._css_toggle("recaptcha_is_showing_audio", "recaptcha_isnot_showing_audio", "audio" == b);
            Recaptcha._clear_input();
            Recaptcha.should_focus && Recaptcha.focus_response_field();
            Recaptcha._reset_timer()
        },
        _reset_timer: function () {
            clearInterval(Recaptcha.timer_id);
            var a = Math.max(1E3 * (RecaptchaState.timeout - 60), 6E4);
            Recaptcha.timer_id = setInterval('Recaptcha.reload("t");', a);
            return a
        },
        showhelp: function () {
            window.open(Recaptcha._get_help_link(), "recaptcha_popup", "width=460,height=580,location=no,menubar=no,status=no,toolbar=no,scrollbars=yes,resizable=yes")
        },
        _clear_input: function () {
            Recaptcha.$("recaptcha_response_field").value = ""
        },
        _displayerror: function (a) {
            var b = Recaptcha.$;
            b("recaptcha_image").innerHTML = "";
            b("recaptcha_image").appendChild(document.createTextNode(a))
        },
        reloaderror: function (a) {
            Recaptcha._displayerror(a)
        },
        _is_ie: function () {
            return 0 < navigator.userAgent.indexOf("MSIE") && !window.opera
        },
        _css_toggle: function (a, b, c) {
            var d = Recaptcha.widget;
            d || (d = document.body);
            var e = d.className,
                e = e.replace(RegExp("(^|\\s+)" + a + "(\\s+|$)"), " "),
                e = e.replace(RegExp("(^|\\s+)" + b + "(\\s+|$)"), " "),
                e = e + (" " + (c ? a : b));
            d.className = e
        },
        _get_help_link: function () {
            var a = Recaptcha._get_api_server().replace(/\/[a-zA-Z0-9]+\/?$/, "/help"),
                a = a + ("?c=" + RecaptchaState.challenge);
            Recaptcha.getLang_() && (a += "&hl=" + Recaptcha.getLang_());
            return a
        },
        playAgain: function () {
            Recaptcha.$("recaptcha_image").innerHTML = Recaptcha.getAudioCaptchaHtml()
        },
        getAudioCaptchaHtml: function () {
            var a = Recaptcha._get_api_server() + "/image?c=" + RecaptchaState.challenge;
            0 == a.indexOf("https://") && (a = "http://" + a.substring(8));
            var b = Recaptcha._get_api_server() + "/img/audiocaptcha.swf?v2",
                b = Recaptcha._is_ie() ? '<object classid="clsid:D27CDB6E-AE6D-11cf-96B8-444553540000" id="audiocaptcha" width="0" height="0" codebase="https://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab"><param name="movie" value="' + b + '" /><param name="quality" value="high" /><param name="bgcolor" value="#869ca7" /><param name="allowScriptAccess" value="always" /></object><br/>' : '<embed src="' + b + '" quality="high" bgcolor="#869ca7" width="0" height="0" name="audiocaptcha" align="middle" play="true" loop="false" quality="high" allowScriptAccess="always" type="application/x-shockwave-flash" pluginspage="http://www.adobe.com/go/getflashplayer" /></embed>',
                c = "";
            Recaptcha.checkFlashVer() && (c = "<br/>" + Recaptcha.getSpan_('<a id="recaptcha_audio_play_again" class="recaptcha_audio_cant_hear_link" href="#" onclick="Recaptcha.playAgain(); return false;">' + RecaptchaStr.play_again + "</a>"));
            c += "<br/>" + Recaptcha.getSpan_('<a id="recaptcha_audio_download" class="recaptcha_audio_cant_hear_link" target="_blank" href="' + a + '">' + RecaptchaStr.cant_hear_this + "</a>");
            return b + c
        },
        getSpan_: function (a) {
            return "<span" + (RecaptchaState && RecaptchaState.rtl ? ' dir="rtl"' : "") + ">" + a + "</span>"
        },
        gethttpwavurl: function () {
            if ("audio" != Recaptcha.type) return "";
            var a = Recaptcha._get_api_server() + "/image?c=" + RecaptchaState.challenge;
            0 == a.indexOf("https://") && (a = "http://" + a.substring(8));
            return a
        },
        checkFlashVer: function () {
            var a = -1 != navigator.appVersion.indexOf("MSIE"),
                b = -1 != navigator.appVersion.toLowerCase().indexOf("win"),
                c = -1 != navigator.userAgent.indexOf("Opera"),
                d = -1;
            if (null != navigator.plugins && 0 < navigator.plugins.length) {
                if (navigator.plugins["Shockwave Flash 2.0"] || navigator.plugins["Shockwave Flash"]) a = navigator.plugins["Shockwave Flash 2.0"] ? " 2.0" : "", a = navigator.plugins["Shockwave Flash" + a].description, a = a.split(" "), a = a[2].split("."), d = a[0]
            } else if (a && b && !c) try {
                var e = new ActiveXObject("ShockwaveFlash.ShockwaveFlash.7"),
                    f = e.GetVariable("$version"),
                    d = f.split(" ")[1].split(",")[0]
            } catch (i) {}
            return 9 <= d
        },
        getLang_: function () {
            return "undefined" != typeof RecaptchaState && RecaptchaState.lang ? RecaptchaState.lang : RecaptchaOptions.lang ? RecaptchaOptions.lang : null
        }
    };
Recaptcha._init_options(RecaptchaOptions);
RecaptchaOptions && "custom" == RecaptchaOptions.theme ? (RecaptchaOptions.custom_theme_widget && (Recaptcha.widget = Recaptcha.$(RecaptchaOptions.custom_theme_widget)), Recaptcha.challenge_callback()) : (document.write('<div id="recaptcha_widget_div" style="display:none"></div>'), document.write('<script>Recaptcha.widget = Recaptcha.$("recaptcha_widget_div"); Recaptcha.challenge_callback();<\/script>'));