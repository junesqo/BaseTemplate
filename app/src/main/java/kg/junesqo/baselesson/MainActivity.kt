package kg.junesqo.baselesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kg.junesqo.baselesson.base.BaseActivity
import kg.junesqo.baselesson.base.BaseViewModel
import kg.junesqo.baselesson.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

}