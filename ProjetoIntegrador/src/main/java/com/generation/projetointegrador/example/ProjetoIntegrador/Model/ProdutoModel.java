package com.generation.projetointegrador.example.ProjetoIntegrador.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "tb_Produto")

public class ProdutoModel {
				
			@Id
			@GeneratedValue (strategy = GenerationType.IDENTITY)
			private Long id_produto;
			
			@NotNull
			@Size (min = 3, max = 30) 
			private String nome_produto;
			
			@NotNull
			@Size (min = 11, max = 22)
			private Float valor;
			
			@NotNull
			@Size (min = 5, max = 10)
			private String descricao;
			
			@Size (min = 5, max = 2000)
			private String urlImagem;

			public Long getId_produto() {
				return id_produto;
			}

			public void setId_produto(Long id_produto) {
				this.id_produto = id_produto;
			}

			public String getNome_produto() {
				return nome_produto;
			}

			public void setNome_produto(String nome_produto) {
				this.nome_produto = nome_produto;
			}

			public Float getValor() {
				return valor;
			}

			public void setValor(Float valor) {
				this.valor = valor;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

			public String getUrlImagem() {
				return urlImagem;
			}

			public void setUrlImagem(String urlImagem) {
				this.urlImagem = urlImagem;
			}
}