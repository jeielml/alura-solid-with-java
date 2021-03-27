package br.com.alura.rh.model;

import br.com.alura.rh.ValidacaoException;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		/**
		 * Critica 3: retornar o próprio cargo pode gerar stack over flow caso alguém decida percorrer a progressão de cargos
		 * @return
		 */
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	};

	public abstract Cargo getProximoCargo();
}
