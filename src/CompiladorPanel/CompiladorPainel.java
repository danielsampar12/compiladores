/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CompiladorPanel;

import CompiladorGals.LexicalError;
import CompiladorGals.Lexico;
import CompiladorGals.Token;
import InformacaoLinha.IdLinha;
import InformacaoLinha.InformacaoLinha;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.stream.Collectors;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CompiladorPainel extends javax.swing.JFrame {

    private boolean arquivoNovo = true;
    
    private File arquivoExistente = null;
    
    public CompiladorPainel() {
        initComponents();
        barraStatus.setText("");
        caixaEditor.setBorder(new IdentificadorLinha());
        caixaMensagem.setEditable(false);
        atalhoBotoes();
    }
    
    public void atalhoBotoes() {

        btnNovo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK), "btnNovo");
        btnNovo.getActionMap().put("btnNovo", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaEditor.setText("");
                caixaMensagem.setText("");
                barraStatus.setText("");
                arquivoNovo = true;
            }
        });
        
        btnAbrir.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK), "btnAbrir");
        btnAbrir.getActionMap().put("btnAbrir", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirArquivo();
            }
        });
        
        btnSalvar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK), "btnSalvar");
        btnSalvar.getActionMap().put("btnSalvar", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarArquivo();
            }
        });
        
        btnCopiar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK), "btnCopiar");
        btnCopiar.getActionMap().put("btnCopiar", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                ClipboardOwner conteudoCopiar = new StringSelection(caixaEditor.getSelectedText());
                clipboard.setContents((Transferable) conteudoCopiar, conteudoCopiar);
            }
        });
        
        btnColar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK), "btnColar");
        btnColar.getActionMap().put("btnColar", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaEditor.paste();
            }
        });
        
        btnRecortar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK), "btnRecortar");
        btnRecortar.getActionMap().put("btnRecortar", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                caixaEditor.cut();
            }
        });
        
        btnCompilar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0), "btnCompilar");
        btnCompilar.getActionMap().put("btnCompilar", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
               caixaMensagem.setText("Compilação de programas ainda não foi implementada.");
            }
        });
        
        btnEquipe.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0), "btnEquipe");
        btnEquipe.getActionMap().put("btnEquipe", new AbstractAction(){
            @Override
            public void actionPerformed(ActionEvent e) {
                barraStatus.setText("Equipe: Patrick Antunes e Daniel Garcia.");
            }
        });
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelPrincipal = new javax.swing.JPanel();
        barraIcones = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnAbrir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        btnColar = new javax.swing.JButton();
        btnRecortar = new javax.swing.JButton();
        btnCompilar = new javax.swing.JButton();
        btnEquipe = new javax.swing.JButton();
        Editor = new javax.swing.JScrollPane();
        caixaEditor = new javax.swing.JTextArea();
        Mensagem = new javax.swing.JScrollPane();
        caixaMensagem = new javax.swing.JTextArea();
        barraStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(915, 580));

        painelPrincipal.setMinimumSize(new java.awt.Dimension(900, 620));
        painelPrincipal.setPreferredSize(new java.awt.Dimension(900, 620));

        barraIcones.setAlignmentX(0.0F);
        barraIcones.setAlignmentY(0.0F);
        barraIcones.setAutoscrolls(true);
        barraIcones.setMaximumSize(new java.awt.Dimension(1000000, 1000000));
        barraIcones.setMinimumSize(new java.awt.Dimension(70, 900));
        barraIcones.setPreferredSize(new java.awt.Dimension(70, 900));

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Novo.png"))); // NOI18N
        btnNovo.setText("novo[ctrl-n]");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setMaximumSize(new java.awt.Dimension(112, 112));
        btnNovo.setMinimumSize(new java.awt.Dimension(112, 112));
        btnNovo.setPreferredSize(new java.awt.Dimension(112, 112));
        btnNovo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });

        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Abrir.png"))); // NOI18N
        btnAbrir.setText("abrir[ctrl-o]");
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setMaximumSize(new java.awt.Dimension(112, 112));
        btnAbrir.setMinimumSize(new java.awt.Dimension(112, 112));
        btnAbrir.setPreferredSize(new java.awt.Dimension(112, 112));
        btnAbrir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Salvar.png"))); // NOI18N
        btnSalvar.setText("salvar[ctrl-s]");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setMaximumSize(new java.awt.Dimension(112, 112));
        btnSalvar.setMinimumSize(new java.awt.Dimension(112, 112));
        btnSalvar.setPreferredSize(new java.awt.Dimension(112, 112));
        btnSalvar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Copiar.png"))); // NOI18N
        btnCopiar.setText("copiar[ctrl-c]");
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setMaximumSize(new java.awt.Dimension(112, 112));
        btnCopiar.setPreferredSize(new java.awt.Dimension(112, 112));
        btnCopiar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnColar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Colar.png"))); // NOI18N
        btnColar.setText("colar[ctrl-v]");
        btnColar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColar.setPreferredSize(new java.awt.Dimension(112, 112));
        btnColar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnColar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColarActionPerformed(evt);
            }
        });

        btnRecortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Cortar.png"))); // NOI18N
        btnRecortar.setText("recortar[ctrl-x]");
        btnRecortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecortar.setMaximumSize(new java.awt.Dimension(89, 57));
        btnRecortar.setMinimumSize(new java.awt.Dimension(89, 57));
        btnRecortar.setPreferredSize(new java.awt.Dimension(112, 112));
        btnRecortar.setVerifyInputWhenFocusTarget(false);
        btnRecortar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnRecortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecortarActionPerformed(evt);
            }
        });

        btnCompilar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Compilar.png"))); // NOI18N
        btnCompilar.setText("compilar[F7]");
        btnCompilar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompilar.setPreferredSize(new java.awt.Dimension(112, 112));
        btnCompilar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        btnEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CompiladorImgs/Equipe.png"))); // NOI18N
        btnEquipe.setText("equipe[F1]");
        btnEquipe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipe.setPreferredSize(new java.awt.Dimension(89, 57));
        btnEquipe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnEquipe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout barraIconesLayout = new javax.swing.GroupLayout(barraIcones);
        barraIcones.setLayout(barraIconesLayout);
        barraIconesLayout.setHorizontalGroup(
            barraIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIconesLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecortar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCompilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        barraIconesLayout.setVerticalGroup(
            barraIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraIconesLayout.createSequentialGroup()
                .addGroup(barraIconesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnEquipe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnColar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCompilar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        Editor.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Editor.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        Editor.setPreferredSize(new java.awt.Dimension(900, 400));

        caixaEditor.setColumns(20);
        caixaEditor.setRows(5);
        Editor.setViewportView(caixaEditor);

        Mensagem.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        Mensagem.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        caixaMensagem.setColumns(20);
        caixaMensagem.setRows(5);
        Mensagem.setViewportView(caixaMensagem);

        barraStatus.setText("jLabel1");

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraIcones, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
            .addComponent(Editor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Mensagem)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(barraStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addComponent(barraIcones, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Editor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 915, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipeActionPerformed
        caixaMensagem.setText("Equipe: Patrick Antunes e Daniel Garcia.");
    }//GEN-LAST:event_btnEquipeActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        Lexico lexico = new Lexico();
        lexico.setInput(new StringReader(caixaEditor.getText()));

        IdLinha identificadorLinha = new IdLinha();
        try {
            if (!"".equals(caixaEditor.getText().trim())) {
                caixaMensagem.setText("");
                Token token;
                String format = "%1$-5s %2$-20s %3$-5s";
                caixaMensagem.append(String.format(format, "LINHA","CLASSE","LEXEMA")+"\n");
                while ((token = lexico.nextToken()) != null) {
                    try{
                        InformacaoLinha linha = identificadorLinha.getLinha(caixaEditor.getText(), token.getPosition());
                        String classe = identificarClasse(token.getId());
                        if (classe != null){
                            caixaMensagem.append(String.format(format, linha.getLinha(), classe, token.getLexeme())+"\n");
                        }
                    }catch(Exception ex){
                        System.out.println(ex);
                    }
                }
                caixaMensagem.append("Programa compilado com sucesso.");
            } else {
                caixaMensagem.setText("");
                caixaMensagem.append("Não há o que compilar.");
            }
        } catch (LexicalError e) {
            try {
                InformacaoLinha linha = identificadorLinha.getLinha(caixaEditor.getText(), e.getPosition());
                //caixaEditor.setText("");
                caixaMensagem.setText("");
                String msgErro = e.getMessage();
                if ("símbolo inválido".equals(msgErro)) {
                    msgErro = identificadorLinha.getSimboloInvalido(e.getPosition(), caixaEditor.getText()) + " " + msgErro;
                }
                caixaMensagem.append("Erro na linha " + linha.getLinha() + " - " + msgErro);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    public String identificarClasse(int idToken){
        System.out.println("! " + idToken );
        if(idToken == 2){
            return "identificador";
        }else if(idToken == 3){
            return "constante int";
        }else if(idToken == 4){
            return "constante float";
        }else if(idToken == 5){
            return "constante char";
        }else if(idToken == 6){
            return "constante string";
        }else if(idToken == 7 || idToken == 8){
            return null;
        }else if(idToken >= 9 && idToken <= 25){
            return "palavra reservada";
        }else{
            return "símbolo especial";
        }
    }
    
    private void btnRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecortarActionPerformed
        caixaEditor.cut();
    }//GEN-LAST:event_btnRecortarActionPerformed

    private void btnColarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColarActionPerformed
        caixaEditor.paste();
    }//GEN-LAST:event_btnColarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        ClipboardOwner conteudoCopiar = new StringSelection(caixaEditor.getSelectedText());
        clipboard.setContents((Transferable) conteudoCopiar, conteudoCopiar);
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        salvarArquivo();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrirArquivo();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        caixaEditor.setText("");
        caixaMensagem.setText("");
        barraStatus.setText("");
        arquivoNovo = true;
    }//GEN-LAST:event_btnNovoActionPerformed

    public void abrirArquivo(){
        JFileChooser arquivo = new JFileChooser();
        
        FileNameExtensionFilter filtroTXT = new FileNameExtensionFilter("Arquivos TXT", "txt");  
        arquivo.addChoosableFileFilter(filtroTXT);
        arquivo.setAcceptAllFileFilterUsed(false);
       
        if(arquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            
        caixaEditor.setText("");
        barraStatus.setText("");
        
        String diretorioArquivo = arquivo.getSelectedFile().getAbsolutePath().toUpperCase();
        barraStatus.setText("Aberto o arquivo: " + arquivo.getSelectedFile().getName().toUpperCase() + " no diretório: " + diretorioArquivo);
       
        File arquivoLeitura = arquivo.getSelectedFile();
        
        String conteudo = "";
        try{
            conteudo = Files.readAllLines(arquivoLeitura.toPath()).stream().collect(Collectors.joining("\n"));
            arquivoNovo = false; //Se importar o conteúdo não é mais um arquivo novo.
            arquivoExistente = arquivoLeitura;
            
            }catch(Exception e){
        };
        
        caixaEditor.setText(conteudo);
    }
    }
    
    public void salvarArquivo(){
        String conteudoSalvar = caixaEditor.getText(); //independente do caso salvo o conteúdo do editor de texto

        if (arquivoNovo == true){
            JFileChooser arquivoNovo = new JFileChooser();   
                if(arquivoNovo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
                String arquivoNome = arquivoNovo.getSelectedFile() + ".txt";
                    try{
                        editarArquivo(arquivoNome, conteudoSalvar);
                        caixaMensagem.setText("");
                        barraStatus.setText("Arquivo salvo em: " + arquivoNome);
                    }catch(Exception e){
                };
            }
        }else{
              try{
                    editarArquivo(arquivoExistente.getAbsolutePath(), conteudoSalvar);
                    caixaMensagem.setText("");
                    arquivoExistente = new File(arquivoExistente.getAbsolutePath());
              }catch(Exception e){
            };      
        }
    }
    
    private void editarArquivo(String nomeArquivo, String conteudoTexto) throws IOException {
        try (
            BufferedReader leitura = new BufferedReader(new StringReader(conteudoTexto));
            PrintWriter escrita = new PrintWriter(new FileWriter(nomeArquivo)); ) {
            leitura.lines().forEach(line -> escrita.println(line));
        }
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CompiladorPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CompiladorPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CompiladorPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompiladorPainel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CompiladorPainel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Editor;
    private javax.swing.JScrollPane Mensagem;
    private javax.swing.JPanel barraIcones;
    private javax.swing.JLabel barraStatus;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnColar;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnEquipe;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRecortar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextArea caixaEditor;
    private javax.swing.JTextArea caixaMensagem;
    private javax.swing.JPanel painelPrincipal;
    // End of variables declaration//GEN-END:variables
}

