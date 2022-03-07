/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Dog

/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val dogs: List<Dog> = listOf(
        Dog(
            R.drawable.dude,
            "\"Чювак\" - обращение к человеку мужского рода.",
            "7",
            "sunbathing"
        ),
        Dog(
            R.drawable.want,
            "\"Это то, что я хотел\" - выражение того, чего человек очень сильно желал или наоборот, очень не хотел. Хрен разберешь. Нужен контекст.",
            "4",
            "sleeping in dangerous places"
        ),
        Dog(
            R.drawable.bye,
            " \"До побаченья\" - типичное прощание. Всё понятно.",
            "2",
            "stealing socks"
        ),
        Dog(
            R.drawable.blen,
            "\"Блеееен\" - выбражение досады, радости и ещё хрен знает чего, зависит от обстоятельств.",
            "8",
            "meeting new animals"
        ),
        Dog(
            R.drawable.pris,
            "\"Присрать\" - качественно прилепить один объект к другому или что-то сделать.",
            "8",
            "Digging in the garden"
        ),
        Dog(
            R.drawable.vetr,
            "\"Сделать ветряк\" - иронизцаия по поводу того, что был какой-то проект, котрый очень хотели сделтаь, но потом поняли, что оно нафиг не надо.",
            "14",
            "Chasing sea foam"
        ),
        Dog(
            R.drawable.hand,
            "\"Сделать руку\" - поехать во Францию и классно провести время, делая крутые вещи.",
            "1",
            "play with sticks"
        ),
        Dog(
            R.drawable.poliv,
            "\"Сделать поливалку\" - пример успешно выполненного проекта, разработчики котрого очень гордятся собой.",
            "2",
            "kek"
        ),
        Dog(
            R.drawable.krut,
            "\"Та херня крутящаяся с датчиками\" - пример проекта, который активно выполнялся, но потерял актуальность и впоследствии интерес к нему. Но всё же в будущем он неожиданно пригодился. Не то же самое, что и \"Сделать ветряк\"",
            "1",
            "play with sticks"
        ),
        Dog(
            R.drawable.sucsess,
            "\"Ну это успех, так-то\" - выражение радости по поводу успешного чего-то.",
            "2",
            "kek"
        ),
        Dog(
            R.drawable.dict,
            "\"НикитоСережско-русский словарь\" - вот эта фигня, которую вы сейчас чиаете. Могли бы и мой видосрик посмотерть так-то, про кофе например.",
            "14",
            "Chasing sea foam"
        ),
        Dog(
            R.drawable.cnc,
            "\"Собрать ЧПУ станок\" - Проект, о котором ты настолько долго думаешь, строишь планы, готовишься, но в конце концов понимаешь, что он нахер не нужен... Но потом понимаешь, что его можно загнать Французам.",
            "1",
            "play with sticks"
        ),
        Dog(
            R.drawable.hodila,
            "\"Ходила\" - Вид человека, очень любящего ходьбу, готов идти до 9 школы.",
            "2",
            "kek"
        ),
        Dog(
            R.drawable.road,
            "\"Идти до 9 школы\" - желание выполнить какой-то очень сложный проект и понимание, что он заглохнет на полпути.",
            "1",
            "play with sticks"
        ),
        Dog(
            R.drawable.zaebok,
            "“Заебок” - пояснения излишни. ",
            "2",
            "kek"
        )

    )
}
