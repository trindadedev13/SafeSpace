package org.privacymatters.safespace.depracated.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
//import org.privacymatters.safespace.depracated.lib.fileManager.Operations
//import org.privacymatters.safespace.depracated.lib.recyclerView.FilesRecyclerViewAdapter


class MainActivity : AppCompatActivity()
//    ItemClickListener, FolderClickListener
{

//    private lateinit var ops: Operations

//    private lateinit var nothingHereText: TextView
//    private lateinit var filesRecyclerView: RecyclerView
////    private lateinit var filesRecyclerViewAdapter: FilesRecyclerViewAdapter
//    private lateinit var folderRecyclerView: RecyclerView
//    private lateinit var folderRecyclerViewAdapter: FolderRecyclerViewAdapter
//    private lateinit var deleteButton: ImageButton
//    private lateinit var clearButton: ImageButton
//    private lateinit var exportButton: ImageButton
//    private lateinit var moveBulkButton: ImageButton
//    private lateinit var copyBulkButton: ImageButton
//    private var moveCopyBulkFrom = ""
//    private var selectedItems = ArrayList<FileItem>()
//    private val folderNamePattern = Regex("[~`!@#\$%^&*()+=|\\\\:;\"'>?/<,\\[\\]{}]")
//    private lateinit var fileMoveCopyView: ConstraintLayout
//    private lateinit var fileMoveCopyName: TextView
//    private lateinit var fileMoveCopyOperation: TextView
//    private lateinit var fileMoveCopyButton: MaterialButton
//    private lateinit var sharedPref: SharedPreferences
//    private lateinit var topAppBar: MaterialToolbar
//    private lateinit var selectExportDirActivityResult: ActivityResultLauncher<Intent>
//    private lateinit var sortinator: Sortinator
//    private lateinit var actions: Actions
//    private val notificationPermissionRequestCode = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        // set theme on app launch
//        sharedPref = getSharedPreferences(Constants.SHARED_PREF_FILE, Context.MODE_PRIVATE)
//
//        SetTheme.setTheme(
//            delegate,
//            applicationContext,
//            sharedPref.getString(getString(R.string.change_theme), getString(R.string.System))!!
//        )
//
//        setContentView(R.layout.activity_main)
//
//        // initialize things on activity start
//        ops = Operations(application)
//        nothingHereText = findViewById(R.id.nothingHere) // show this when recycler view is empty
//
//        // initialize sortinator, listeners will be registered later during dialog creation
//        sortinator = Sortinator(sharedPref, ops)
//
//        val filesRVAdapterTexts = mapOf(
//            "directory_indicator" to getString(R.string.directory_indicator)
//        )
//
//        val folderRVAdapterTexts = mapOf(
//            "items" to getString(R.string.items),
//            "item" to getString(R.string.item)
//        )
//
//        // request notification permission for Android 13 and above
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
//            if (!isNotificationPermissionGranted()) {
//                requestNotificationPermission()
//            }
//        }
//
//        filesRecyclerView = findViewById(R.id.filesRecyclerView)
//        filesRecyclerViewAdapter = FilesRecyclerViewAdapter(this, filesRVAdapterTexts, ops)
//
//        folderRecyclerView = findViewById(R.id.folderRecyclerView)
//        folderRecyclerViewAdapter = FolderRecyclerViewAdapter(this, folderRVAdapterTexts)
//
//        deleteButton = findViewById(R.id.deleteButton)
//        clearButton = findViewById(R.id.clearButton)
//        exportButton = findViewById(R.id.exportButton)
//        moveBulkButton = findViewById(R.id.moveBulkButton)
//        copyBulkButton = findViewById(R.id.copyBulkButton)
//        fileMoveCopyView = findViewById(R.id.moveCopyFileView)
//        fileMoveCopyName = findViewById(R.id.moveCopyFileName)
//        fileMoveCopyOperation = findViewById(R.id.moveCopyFileOperation)
//        fileMoveCopyButton = findViewById(R.id.moveCopyFileButton)
//        val fileMoveCopyButtonCancel: MaterialButton = findViewById(R.id.moveCopyFileButtonCancel)
////        topAppBar = findViewById(R.id.topAppBar)
//
//        val extendedFab = findViewById<ExtendedFloatingActionButton>(R.id.extended_fab)
//        val cameraFab = findViewById<FloatingActionButton>(R.id.camera_fab)
//        val importFilesFab = findViewById<FloatingActionButton>(R.id.import_fab)
//        val createDirFab = findViewById<FloatingActionButton>(R.id.create_dir_fab)
//        val createNoteFab = findViewById<FloatingActionButton>(R.id.note_fab)
//        actions = Actions(
//            extendedFab,
//            cameraFab,
//            importFilesFab,
//            createDirFab,
//            createNoteFab,
//            this
//        )
//
//        // initialize at first run of app. Sets the root directory
//        if (!sharedPref.getBoolean(Constants.APP_FIRST_RUN, false)) {
//            if (ops.initRootDir() == 1) {
//                with(sharedPref.edit()) {
//                    putBoolean(Constants.APP_FIRST_RUN, true)
//                    apply()
//                }
//            }
//        }
//
//        val (fileList, folderList) = ops.getContents(ops.getInternalPath())
//
//        val horizontalLayoutManager =
//            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
//        folderRecyclerView.layoutManager = horizontalLayoutManager
//        folderRecyclerView.adapter = folderRecyclerViewAdapter
//
//        filesRecyclerView.layoutManager = LinearLayoutManager(this)
//        filesRecyclerView.adapter = filesRecyclerViewAdapter
//
//        folderRecyclerViewAdapter.setData(folderList)
//        filesRecyclerViewAdapter.setData(fileList, nothingHereText)
//
//        fileMoveCopyView.visibility = View.GONE
//        fileMoveCopyName.isSelected = true
//
//        // Directory picker result
//        selectExportDirActivityResult =
//            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
//
//                if (result.resultCode == RESULT_OK) {
//                    result.data.also { intent ->
//                        val uri = intent?.data
//                        if (uri != null) {
//
//                            Toast.makeText(
//                                exportButton.context,
//                                getString(R.string.export_in_progress),
//                                Toast.LENGTH_SHORT
//                            ).show()
//
//                            for (item in selectedItems) {
//                                CoroutineScope(Dispatchers.IO).launch {
//                                    ops.exportItems(uri, item)
//                                }
//                            }
//                            clearSelection()
//                        }
//                    }
//                }
//            }
//
//        // Top App Bar
//        topAppBar.setNavigationOnClickListener {
//            backButtonAction()
//        }
//
//        // Click Listeners
//        deleteButton.setOnClickListener {
//            // file = null because multiple selections to be deleted and there's no single file
//            deleteFilePopup(null, deleteButton.context)
//        }
//
//        clearButton.setOnClickListener {
//            clearSelection()
//        }
//
//        exportButton.setOnClickListener {
//            exportItems()
//        }
//
//        moveBulkButton.setOnClickListener {
//            moveFileBulk()
//        }
//
//        copyBulkButton.setOnClickListener {
//            copyFileBulk()
//        }
//
//        fileMoveCopyButton.setOnClickListener {
//            var status = 0
//
//            if (this.selectedItems.isNotEmpty()) {
//
//                for (file in this.selectedItems) {
//
//                    ops.moveFileFrom =
//                        ops.joinPath(moveCopyBulkFrom, file.name)
//
//                    ops.moveFileTo = ops.joinPath(
//                        ops.getFilesDir(),
//                        ops.getInternalPath(),
//                        file.name
//                    )
//
//                    if (ops.moveFileFrom != null && ops.moveFileFrom != ops.moveFileTo) {
//                        val statusCode =
//                            if (fileMoveCopyButton.text == getString(R.string.move_file_title)) {
//                                ops.moveFile()
//                            } else {
//                                ops.copyFile()
//                            }
//
//                        if (statusCode == -1) {
//                            status = -1
//                        }
//                    }
//                }
//
//            } else {
//
//                val fileName = fileMoveCopyName.text.toString()
//
//                ops.moveFileTo = ops.joinPath(
//                    ops.getFilesDir(),
//                    ops.getInternalPath(),
//                    fileName
//                )
//
//                if (ops.moveFileFrom != null && ops.moveFileFrom != ops.moveFileTo) {
//                    val statusCode =
//                        if (fileMoveCopyButton.text == getString(R.string.move_file_title)) {
//                            ops.moveFile()
//                        } else {
//                            ops.copyFile()
//                        }
//
//                    if (statusCode == -1) {
//                        status = -1
//                    }
//
//                }
//            }
//
//            if (status == -1) {
//                Toast.makeText(
//                    applicationContext,
//                    getString(R.string.move_copy_file_failure),
//                    Toast.LENGTH_SHORT
//                ).show()
//            } else {
//                Toast.makeText(
//                    applicationContext,
//                    getString(R.string.move_copy_file_success),
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//
//            moveCopyBulkFrom = ""
//            clearBulkMoveCopy()
//
//            updateRecyclerView()
//            fileMoveCopyView.visibility = View.GONE
//
//        }
//
//        fileMoveCopyButtonCancel.setOnClickListener {
//            fileMoveCopyView.visibility = View.GONE
//            ops.moveFileFrom = null
//            ops.moveFileTo = null
//        }
//
//        // initialize sorting
//        val sortButton = findViewById<Button>(R.id.sortButton)
//        sortButton.setOnClickListener {
//            showSortDialog(sortButton)
//        }
//
//        // back button - system navigation
//        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                backButtonAction()
//            }
//        })
//        //End: back button - system navigation

    }

//    private fun showSortDialog(sortButton: View) {
//        val builder = MaterialAlertDialogBuilder(sortButton.context)
//
//        val inflater: LayoutInflater = layoutInflater
//        val sortLayout = inflater.inflate(R.layout.sort_dialog, null)
//        sortinator.registerListeners(sortLayout)
//
//        builder.setTitle(getString(R.string.sort))
//            .setCancelable(true)
//            .setView(sortLayout)
//            .setPositiveButton(getString(R.string.ok)) { _, _ ->
//                updateRecyclerView()
//            }
//            .setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
//                // Dismiss the dialog
//                dialog.dismiss()
//            }
//        val alert = builder.create()
//        alert.show()
//
//    }
//
//    private fun backupError(errorCode: Int) {
//        val msg = when (errorCode) {
//            4 -> getString(R.string.backup_err_space)
//            1 -> getString(R.string.backup_err_other)
//            else -> getString(R.string.backup_err_other)
//        }
//
//        Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
//
//    }
//
//    private fun clearSelection() {
//        toggleFloatingButtonVisibility(false)
//        this.selectedItems.clear()
//        updateRecyclerView()
//    }
//
//    fun updateRecyclerView() {
//        // display contents of the navigated path
//        var (files, folders) = ops.getContents(ops.getInternalPath())
//
//        files = sortinator.sortFiles(files)
//
//        filesRecyclerViewAdapter.setData(
//            files,
//            nothingHereText
//        )
//
//        folderRecyclerViewAdapter.setData(folders)
//    }
//
//    // item single tap
//    override fun onClick(data: FileItem) {
//        if (!data.isDir) {
//
//            val filePath =
//                ops.joinPath(ops.getFilesDir(), ops.getInternalPath(), data.name)
//
//            when (Utils.getFileType(data.name)) {
//                Constants.IMAGE_TYPE,
//                Constants.VIDEO_TYPE,
//                Constants.AUDIO_TYPE -> {
//                    loadMedia(filePath)
//                }
//
//                Constants.DOCUMENT_TYPE, Constants.TXT, Constants.JSON, Constants.XML, Constants.PDF -> {
//                    loadDocument(filePath)
//                }
//
//                Constants.ZIP -> {
//                    extractZip(filePath)
//                }
//
//                else -> {
//                    Toast.makeText(
//                        applicationContext,
//                        getString(R.string.unsupported_format),
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            }
//
//        }
//    }
//
//    override fun onLongClick(data: FileItem, view: View) {
//
//        val popup = PopupMenu(this, view)
//
//        popup.inflate(R.menu.files_context_menu)
//
//        // remove share option for directories
//        if (data.isDir) {
//            popup.menu.removeItem(R.id.share_item)
//        }
//
//        popup.setOnMenuItemClickListener { item: MenuItem? ->
//
//            when (item!!.itemId) {
//                R.id.rename_item -> {
//                    renameFilePopup(data, view.context)
//                }
//
//                R.id.delete_item -> {
//                    deleteFilePopup(data, view.context)
//                }
//
//                R.id.move_item -> {
//                    moveFile(data)
//                }
//
//                R.id.copy_item -> {
//                    copyFile(data)
//                }
//
//                R.id.share_item -> {
//                    shareFilePopup(data, view.context)
//                }
//
//            }
//
//            true
//        }
//
//        popup.show()
//    }
//
//    // Item multi select on icon click
//    override fun onItemSelect(data: FileItem, selectedItems: ArrayList<FileItem>) {
//        this.selectedItems = selectedItems
//        if (this.selectedItems.isEmpty()) {
//            toggleFloatingButtonVisibility(false)
//        } else {
//            toggleFloatingButtonVisibility(true)
//        }
//    }
//
//    private fun backButtonAction() {
//
//        var currentPath = ""
//
//        clearBulkMoveCopy()
//
//        if (!ops.isRootDirectory()) {
//            val (_, currentPathTemp) = ops.setGetPreviousAndCurrentPath()
//            currentPath = currentPathTemp
//            // display contents of the navigated path
//            updateRecyclerView()
//        } else {
//            finish()
//        }
//        if (ops.isPreviousRootDirectory()) {
//            topAppBar.title = getString(R.string.app_name)
//            topAppBar.navigationIcon = null
//        } else {
//            topAppBar.title = currentPath
//        }
//    }
//
//    override fun onResume() {
//        super.onResume()
//        updateRecyclerView()
//    }
//
//    private fun renameFilePopup(file: FileItem, context: Context) {
//        val builder = MaterialAlertDialogBuilder(context)
//
//        val inflater: LayoutInflater = layoutInflater
//        val renameLayout = inflater.inflate(R.layout.rename_layout, null)
//        val folderNameTextView =
//            renameLayout.findViewById<TextInputLayout>(R.id.renameTextLayout)
//        folderNameTextView.editText?.setText(file.name)
//
//        builder.setTitle(getString(R.string.context_menu_rename))
//            .setCancelable(true)
//            .setView(renameLayout)
//            .setPositiveButton(getString(R.string.context_menu_rename)) { _, _ ->
//
//                if (!folderNamePattern.containsMatchIn(folderNameTextView.editText?.text.toString())) {
//                    val result = ops.renameFile(
//                        file,
//                        ops.getInternalPath(),
//                        folderNameTextView.editText!!.text.toString()
//                    )
//
//                    if (result == 0) {
//                        Toast.makeText(
//                            context,
//                            getString(R.string.generic_error),
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    } else {
//                        updateRecyclerView()
//                    }
//                } else {
//                    Toast.makeText(
//                        context,
//                        getString(R.string.create_folder_invalid_error),
//                        Toast.LENGTH_SHORT
//                    ).show()
//                }
//            }
//            .setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
//                // Dismiss the dialog
//                dialog.dismiss()
//            }
//        val alert = builder.create()
//        alert.show()
//    }
//
//    private fun deleteFilePopup(file: FileItem?, context: Context) {
//
//        val inflater: LayoutInflater = layoutInflater
//        val deleteLayout = inflater.inflate(R.layout.delete_confirmation, null)
//
//        val builder = MaterialAlertDialogBuilder(context)
//        builder.setTitle(getString(R.string.context_menu_delete))
//            .setCancelable(true)
//            .setView(deleteLayout)
//            .setPositiveButton(getString(R.string.context_menu_delete)) { _, _ ->
//
//                if (this.selectedItems.isNotEmpty() && file == null) {
//                    for (item in this.selectedItems) {
//                        ops.deleteFile(
//                            item,
//                            ops.getInternalPath()
//                        )
//                    }
//
//                    // hide delete button after items are deleted
//                    toggleFloatingButtonVisibility(false)
//
//                    updateRecyclerView()
//                } else {
//
//                    val result = ops.deleteFile(
//                        file!!,
//                        ops.getInternalPath()
//                    )
//
//                    if (result == 0) {
//                        Toast.makeText(
//                            context,
//                            getString(R.string.generic_error),
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    } else {
//                        updateRecyclerView()
//                    }
//                }
//            }
//            .setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
//                // Dismiss the dialog
//                dialog.dismiss()
//            }
//        val alert = builder.create()
//        alert.show()
//    }
//
//    private fun deleteFolderPopup(folder: FolderItem?, context: Context) {
//
//        val inflater: LayoutInflater = layoutInflater
//        val deleteLayout = inflater.inflate(R.layout.delete_confirmation, null)
//
//        val builder = MaterialAlertDialogBuilder(context)
//        builder.setTitle(getString(R.string.context_menu_delete))
//            .setCancelable(true)
//            .setView(deleteLayout)
//            .setPositiveButton(getString(R.string.context_menu_delete)) { _, _ ->
//
//                if (folder != null) {
//                    val result = ops.deleteFolder(
//                        folder,
//                        ops.getInternalPath()
//                    )
//                    if (result == 0) {
//                        Toast.makeText(
//                            context,
//                            getString(R.string.generic_error),
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    } else {
//                        updateRecyclerView()
//                    }
//                }
//            }
//            .setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
//                // Dismiss the dialog
//                dialog.dismiss()
//            }
//        val alert = builder.create()
//        alert.show()
//    }
//
//    private fun shareFilePopup(file: FileItem, context: Context) {
//        val builder = MaterialAlertDialogBuilder(context)
//
//        val inflater: LayoutInflater = layoutInflater
//        val shareLayout = inflater.inflate(R.layout.share_dialog, null)
//
//        builder.setTitle(getString(R.string.share_dialog_title))
//            .setCancelable(true)
//            .setView(shareLayout)
//            .setPositiveButton(getString(R.string.context_menu_share)) { _, _ ->
//                ops.shareFile(
//                    file,
//                    ops.getInternalPath()
//                )
//            }
//            .setNeutralButton(getString(R.string.cancel)) { dialog, _ ->
//                // Dismiss the dialog
//                dialog.dismiss()
//            }
//        val alert = builder.create()
//        alert.show()
//    }
//
//    private fun loadMedia(filePath: String) {
//        toggleFloatingButtonVisibility(false)
//
//        val mediaViewIntent = Intent(this, MediaActivity::class.java)
//        mediaViewIntent.putExtra(Constants.INTENT_KEY_PATH, filePath)
//        startActivity(mediaViewIntent)
//    }
//
//    fun loadDocument(filePath: String) {
//
//        toggleFloatingButtonVisibility(false)
//
//        var documentViewIntent: Intent? = null
//
//        if (filePath.split('.').last() == Constants.PDF) {
//            documentViewIntent = Intent(this, PDFView::class.java)
//        } else if (filePath.split('.').last() in arrayOf(
//                Constants.TXT,
//                Constants.JSON,
//                Constants.XML
//            )
//        ) {
//            documentViewIntent = Intent(this, TextDocumentView::class.java)
//        }
//
//        if (documentViewIntent != null) {
//            documentViewIntent.putExtra(Constants.INTENT_KEY_PATH, filePath)
//            startActivity(documentViewIntent)
//        }
//    }
//
//    private fun moveFile(file: FileItem) {
//        ops.moveFileFrom =
//            ops.joinPath(ops.getFilesDir(), ops.getInternalPath(), file.name)
//
//        fileMoveCopyView.visibility = View.VISIBLE
//        fileMoveCopyName.text = file.name
//        fileMoveCopyOperation.text = getString(R.string.move_title)
//        fileMoveCopyButton.text = getString(R.string.move_file_title)
//
//    }
//
//    private fun moveFileBulk() {
//        moveCopyBulkFrom = ops.joinPath(ops.getFilesDir(), ops.getInternalPath())
//
//        if (this.selectedItems.isNotEmpty()) {
//            fileMoveCopyView.visibility = View.VISIBLE
//            fileMoveCopyName.text = getString(R.string.multi_move)
//            fileMoveCopyOperation.text = getString(R.string.move_title)
//            fileMoveCopyButton.text = getString(R.string.move_file_title)
//        } else {
//            moveCopyBulkFrom = ""
//        }
//
//    }
//
//    private fun copyFileBulk() {
//
//        moveCopyBulkFrom = ops.joinPath(ops.getFilesDir(), ops.getInternalPath())
//
//        if (this.selectedItems.isNotEmpty()) {
//            fileMoveCopyView.visibility = View.VISIBLE
//            fileMoveCopyName.text = getString(R.string.multi_copy)
//            fileMoveCopyOperation.text = getString(R.string.copy_title)
//            fileMoveCopyButton.text = getString(R.string.copy_file_title)
//        } else {
//            moveCopyBulkFrom = ""
//        }
//
//    }
//
//    private fun clearBulkMoveCopy() {
//        if (moveCopyBulkFrom == "") {
//            this.selectedItems.clear()
//            toggleFloatingButtonVisibility(false)
//        }
//    }
//
//    private fun copyFile(file: FileItem) {
//        ops.moveFileFrom =
//            ops.joinPath(ops.getFilesDir(), ops.getInternalPath(), file.name)
//
//        fileMoveCopyView.visibility = View.VISIBLE
//        fileMoveCopyName.text = file.name
//        fileMoveCopyOperation.text = getString(R.string.copy_title)
//        fileMoveCopyButton.text = getString(R.string.copy_file_title)
//    }
//
//    private fun exportItems() {
//        val intent = Intent(Intent.ACTION_OPEN_DOCUMENT_TREE)
//
//        selectExportDirActivityResult.launch(intent)
//    }
//
//    private fun toggleFloatingButtonVisibility(isVisible: Boolean) {
//        if (isVisible) {
//            deleteButton.visibility = View.VISIBLE
//            clearButton.visibility = View.VISIBLE
//            exportButton.visibility = View.VISIBLE
//            moveBulkButton.visibility = View.VISIBLE
//            copyBulkButton.visibility = View.VISIBLE
//            actions.extendedFabVisible(false)
//        } else {
//            deleteButton.visibility = View.GONE
//            clearButton.visibility = View.GONE
//            exportButton.visibility = View.GONE
//            moveBulkButton.visibility = View.GONE
//            copyBulkButton.visibility = View.GONE
//            actions.extendedFabVisible(true)
//        }
//
//    }
//
//    override fun onFolderSelect(folderItem: FolderItem) {
//
//        topAppBar.title = folderItem.name
//        topAppBar.navigationIcon = AppCompatResources.getDrawable(
//            baseContext,
//            R.drawable.arrow_back_fill0_wght400_grad0_opsz24
//        )
//
//        ops.setInternalPath(folderItem.name)
//
//        clearBulkMoveCopy()
//
//        updateRecyclerView()
//    }
//
//    override fun onFolderLongPress(folderItem: FolderItem, view: View) {
//        val popup = PopupMenu(this, view)
//
//        popup.inflate(R.menu.folder_context_menu)
//
//        popup.setOnMenuItemClickListener { item: MenuItem? ->
//
//            when (item!!.itemId) {
//                R.id.rename_item -> {
//                    renameFilePopup(FileItem(folderItem.name, 0, true, 0), view.context)
//                }
//
//                R.id.delete_item -> {
//                    deleteFolderPopup(folderItem, view.context)
//                }
//
//                R.id.compress_item -> {
//                    compressFolder(folderItem)
//                }
//
//            }
//
//            true
//        }
//
//        popup.show()
//
//    }
//
//    private fun compressFolder(folderItem: FolderItem) {
//        CoroutineScope(Dispatchers.IO).launch {
//            when (ops.compressFolder(folderItem)) {
//                0 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        updateRecyclerView()
//                    }
//                }
//
//                4 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        backupError(4)
//                    }
//                }
//
//                1 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        backupError(1)
//                    }
//                }
//            }
//        }
//    }
//
//    private fun extractZip(filePath: String) {
//        CoroutineScope(Dispatchers.IO).launch {
//            when (ops.extractZip(filePath)) {
//                0 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        updateRecyclerView()
//                    }
//                }
//
//                4 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        backupError(4)
//                    }
//                }
//
//                1 -> {
//                    CoroutineScope(Dispatchers.Main).launch {
//                        backupError(1)
//                    }
//                }
//            }
//        }
//    }
//
//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
//    private fun isNotificationPermissionGranted(): Boolean {
//        val permission = ContextCompat.checkSelfPermission(
//            this,
//            Manifest.permission.POST_NOTIFICATIONS
//        )
//
//        return permission == PackageManager.PERMISSION_GRANTED
//    }
//
//    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
//    private fun requestNotificationPermission() {
//        ActivityCompat.requestPermissions(
//            this,
//            arrayOf(Manifest.permission.POST_NOTIFICATIONS),
//            notificationPermissionRequestCode
//        )
//    }

}