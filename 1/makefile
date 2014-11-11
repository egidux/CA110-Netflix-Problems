# the compiler: gcc for C program, define as g++ for C++
CC = g++

# the build target executable:
TARGET = factorial

all: $(TARGET)

$(TARGET): $(TARGET).cpp
	$(CC) -o $(TARGET) $(TARGET).cpp

clean:
	rm $(TARGET)