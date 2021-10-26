package com.example.lotus

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.ic,""),
feel(R.drawable.sww,"Сосредоточенным"),
    feel(R.drawable.relax,"Расслабленным"),
    feel(R.drawable.ghypnoz,"Взволнованным"),)}

data class state(val  tittle:String, val text_state:String, val image_state: Int)
class MyState
{val state_list= arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.ghypnoz))
}
