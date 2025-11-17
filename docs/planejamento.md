# Planejamento do Sistema de Controle de Despesas

## 🧭 Prioridades de Desenvolvimento

### 🚀 Fase 1 (Prioridade Alta)
- Implementar cadastro de despesas.
- Criar cadastro de usuários (com criptografia de senha).
- Permitir registrar pagamentos.
- Criar listagem de despesas pagas e em aberto.

### ⚙️ Fase 2 (Prioridade Média)
- Implementar filtro por data e categoria.
- Gerenciar tipos de despesas (adicionar, editar e excluir).
- Editar e excluir despesas.

### 🧩 Fase 3 (Prioridade Baixa)
- Melhorar interface e experiência do usuário.
- Adicionar relatórios e estatísticas.
- Criar exportação para CSV.

---

## 🧪 POC (Prova de Conceito)
- Testar gravação e leitura em arquivos de texto (`FileWriter` e `BufferedReader`).
- Criar um teste simples de criptografia de senha (ex: `MessageDigest` com SHA-256).
- Verificar estrutura de classes base (`Despesa`, `Usuario`, `TipoDespesa`).

---

## 💡 MVP (Versão Mínima Viável)
O MVP deverá conter:
- Menu principal funcional.
- Cadastro e listagem de despesas.
- Cadastro e autenticação de usuário.
- Registro de pagamento.
- Persistência de dados em arquivo de texto.