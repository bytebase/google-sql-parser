all: build test

build:
	@echo "Running building"
	antlr -Dlanguage=Go -package parser -visitor *.g4

test:
	go test ./...