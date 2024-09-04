#include <stdio.h>
#include <malloc.h>

typedef struct {
	int peso;   // peso em quilogramas
	int altura; // altura em centimetros
} PesoAltura;

int main() {
	PesoAltura *pessoa1; //ponteiro para PesoAltura
	pessoa1 = (PesoAltura *) malloc(sizeof(PesoAltura));
    pessoa1->peso = 80;
    pessoa1->altura = 185;
    printf("Peso: %i", pessoa1->peso);
    printf("\n");
    printf("Altura: %i", pessoa1->altura);
    printf("\n");

	return 0;
}

