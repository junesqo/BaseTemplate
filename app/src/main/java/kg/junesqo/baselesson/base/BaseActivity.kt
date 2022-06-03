package kg.junesqo.baselesson.base

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB: ViewBinding, VM: BaseViewModel>: AppCompatActivity() {
    protected lateinit var binding: VB
    protected lateinit var viewModel: VM
    protected abstract fun inflateViewBinding(inflater: LayoutInflater): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding(layoutInflater)
        setContentView(binding.root)

        checkInternet()
        initViewModel()
        initView()
        initListener()
    }

    abstract fun initView() //вьюшки
    abstract fun initListener() //логика кликов
    abstract fun initViewModel() //обзерверы
    abstract fun checkInternet()
}
