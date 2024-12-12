all: update_test build test

update_test:
	python3 fetch_test.py

build:
	@echo "Running building"
	antlr -Dlanguage=Go -package parser -visitor *.g4

test:
	go test ./...

